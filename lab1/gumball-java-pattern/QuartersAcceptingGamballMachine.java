
/* "QuartersAcceptingGamballMachine" Developed by SJSU SE-Spring 2019*/
// Author: Vaibhav Gupta
// Dated : 02-06-2019

public class QuartersAcceptingGamballMachine extends GumballMachine {

	public QuartersAcceptingGamballMachine(int size, CostForAGumBall amountNeededForAGumbball) {
		super(size, amountNeededForAGumbball);
	}

	public void insertCoin(int insertedCoin) {
		if (insertedCoin == AcceptedCoins.Quarter.getValue()) {
			this.AddCoinAmount(insertedCoin);
		} else {
			System.out.println("Please insert a qaurter");
			state = noCoinState;
		}
		state.insertCoin();
	}

	public void turnCrank() {
		if (!isGumBallAvailable()) {
			GumBallUnavailablityMessage();
			return;
		} else if (this.coinsTotal >= this.getcostForAGumBall()) {
			state.turnCrank();
			state.dispense();
			this.EjectGumBall();
		} else if (this.coinsTotal < this.getcostForAGumBall()) {
			System.out.println("Insert more quarter please");
			 state = noCoinState;
		}
	}
}