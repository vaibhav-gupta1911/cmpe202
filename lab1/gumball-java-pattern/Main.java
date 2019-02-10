public class Main {

	public static void main(String[] args) {
		GumballMachine gumballMachine = new QuartersAcceptingGamballMachine(5, CostForAGumBall.QuarterCents);

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);
	}
}