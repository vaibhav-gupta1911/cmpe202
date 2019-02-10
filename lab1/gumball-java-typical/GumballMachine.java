
/* "GumballMachine" Developed by SJSU SE-Spring 2019*/
// Author: Vaibhav Gupta
// Dated : 02-06-2019

/* Declaring the GumballMachine as abstract class because there is never going to be 
an direct instance of GumballMachine. The machine will be any of following gumball machines- 
SingleQuarterGamballMachine, DupletQuartersGamballMachine, FiftyCentsMachine or any other machine added in future.*/

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
	protected int num_gumballs;
	protected int coinsTotal;
	private int costForAGumBall;

	abstract void turnCrank();
	abstract void insertCoin(int coin);

	protected GumballMachine(int size, CostForAGumBall amountNeededForAGumbball) {
		this.num_gumballs = size;
		this.costForAGumBall = amountNeededForAGumbball.getValue();
		this.coinsTotal = 0;
	}

	protected boolean EjectGumBall() {
		if (this.isGumBallAvailable()) {
			this.num_gumballs--;
			this.coinsTotal = 0;
			System.out.println("Thanks for your " + this.getcostForAGumBall() + " cents. Gumball Ejected!");
			return true;
		}
		return false;
	}

	protected int getcostForAGumBall() {
		return this.costForAGumBall;
	}

	protected void AddCoinAmount(int amount) {
		this.coinsTotal += amount;
	}
	
	protected boolean isGumBallAvailable() {
		if (this.num_gumballs > 0) {
			return true;
		}
		return false;
	}
	
	protected void GumBallUnavailablityMessage() {
		System.out.println("No More Gumballs!  Sorry, can't return your coin.");
	}
}