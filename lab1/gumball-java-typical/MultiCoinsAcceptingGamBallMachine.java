/* "QuartersAcceptingGamballMachine" Developed by SJSU SE-Spring 2019*/
// Author: Vaibhav Gupta
// Dated : 02-07-2019

public class MultiCoinsAcceptingGamBallMachine extends GumballMachine {
	public MultiCoinsAcceptingGamBallMachine(int size, CostForAGumBall costForAGumBall) {
		super(size, costForAGumBall);
	}

	public void insertCoin(int insertedCoin) {
		if (insertedCoin == AcceptedCoins.Dime.getValue() || insertedCoin == AcceptedCoins.Nickel.getValue()
				|| insertedCoin == AcceptedCoins.Quarter.getValue())
			this.AddCoinAmount(insertedCoin);
		else
			System.out.println("Please insert a dime, nickel or quarter");
	}

	public void turnCrank() {
		if (!isGumBallAvailable()) {
			GumBallUnavailablityMessage();
			return;
		} else if (this.coinsTotal >= this.getcostForAGumBall()) {
			this.EjectGumBall();
		} else if (this.coinsTotal < this.getcostForAGumBall()) {
			System.out.println("Insert " + (this.getcostForAGumBall() - this.coinsTotal) + " more coins");
		}
	}
}