enum AcceptedCoins {
	Dime(5), Nickel(10), Quarter(25);

	private final int value;

	AcceptedCoins(final int newValue) {
		value = newValue;
	}

	public int getValue() {
		return value;
	}
}

enum CostForAGumBall {
	FiftyCents(50), QuarterCents(25);

	private final int value;

	CostForAGumBall(final int newValue) {
		value = newValue;
	}

	public int getValue() {
		return value;
	}
}

public abstract class GumballMachine {
 
	State soldOutState;
	State noCoinState;
	State hasQuarterState;
	State soldState;
	protected int count;
	protected int coinsTotal;
	private int costForAGumBall;
 
	abstract void turnCrank();
	abstract void insertCoin(int coin);
	
	State state = soldOutState;
 
	public GumballMachine(int numberGumballs, CostForAGumBall amountNeededForAGumbball) {
		soldOutState = new SoldOutState(this);
		noCoinState = new noCoinState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);

		this.count = numberGumballs;
 		if (numberGumballs > 0) {
			state = noCoinState;
		} 
 		
		this.costForAGumBall = amountNeededForAGumbball.getValue();
		this.coinsTotal = 0;
	}
 
	public void insertQuarter() {
		state.insertCoin();
	}
 
	public void ejectQuarter() {
		state.ejectQuarter();
	}
 
	void setState(State state) {
		this.state = state;
	}
 
	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			count = count - 1;
		}
	}
 
	int getCount() {
		return count;
	}
 
	void refill(int count) {
		this.count = count;
		state = noCoinState;
	}

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noCoinState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

	protected int getcostForAGumBall() {
		return this.costForAGumBall;
	}

	protected void AddCoinAmount(int amount) {
		this.coinsTotal += amount;
		 state.insertCoin();
	}
	
	protected boolean isGumBallAvailable() {
		if (this.count > 0) {
			return true;
		}
		state = soldOutState;
		return false;
	}
	
	protected void GumBallUnavailablityMessage() {
		System.out.println("No More Gumballs!  Sorry, can't return your coin.");
	}
	
	protected boolean EjectGumBall() {
		if (this.isGumBallAvailable()) {
			state.turnCrank();
			state.dispense();
			this.count--;
			this.coinsTotal = 0;
			System.out.println("Thanks for your " + this.getcostForAGumBall() + " cents. Gumball Ejected!");
			return true;
		}
		state = soldOutState;
		return false;
	}
	
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004");
		result.append("\nInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
	}
}