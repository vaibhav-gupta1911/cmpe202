public class Main {

	public static void main(String[] args) {
		GumballMachine oneQuarterMachine = new QuartersAcceptingGamballMachine(2, CostForAGumBall.QuarterCents);
		GumballMachine twoQuartersMachine = new QuartersAcceptingGamballMachine(1, CostForAGumBall.FiftyCents);
		GumballMachine multipleCoinsMachine = new MultiCoinsAcceptingGamBallMachine(4, CostForAGumBall.FiftyCents);

		System.out.println("gumballMachine");

		oneQuarterMachine.insertCoin(25);
		oneQuarterMachine.turnCrank();

		System.out.println("gumballMachine");

		twoQuartersMachine.insertCoin(25);
		twoQuartersMachine.insertCoin(25);
		twoQuartersMachine.turnCrank();
		
		twoQuartersMachine.insertCoin(25);
		twoQuartersMachine.turnCrank();
		
		
		multipleCoinsMachine.insertCoin(10);
		multipleCoinsMachine.turnCrank();
		
		multipleCoinsMachine.insertCoin(25);
		multipleCoinsMachine.turnCrank();
		System.out.println("gumballMachine");
	}
}