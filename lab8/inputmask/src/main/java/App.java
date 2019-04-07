/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

/**
 * Main App Class for Displaying Screen.
 */
public class App {

	private Screen screen;
	private IDisplayComponent num;
	private IDisplayComponent exp;
	private CreditCardCVC cvc;
	private int keyCount;

	public App() {

		screen = new Screen();
		cvc = new CreditCardCVC();

		num = new CreditCardNumDecorator(new CreditCardNum());
		exp = new CreditCardExpDecorator(new CreditCardExp());

		screen.addSubComponent(num);
		screen.addSubComponent(exp);
		screen.addSubComponent(cvc);

		keyCount = 1;
	}

	public String display() {
		String output = "";
		output += "========================================\n";
		output += screen.name() + "\n";
		output += "========================================\n";
		output += "\n\n\n\n";
		output += screen.display() + "\n";
		output += "\n\n\n\n";
		output += "========================================\n";
		return output;
	}

	public void key(String ch) {
		try {
			System.out.println("count:" + keyCount);

			if (ch.matches("X|x")) {

				if (keyCount <= 1) {
					return;
				}

				if (keyCount > 23)
				{
					keyCount = 24;
				}

				keyCount--;
				screen.key(ch, keyCount);

			} else if (Integer.parseInt(ch) >= 0 && Integer.valueOf(ch) <= 9) {

				if (keyCount <= 23)
					screen.key(ch, keyCount);
				keyCount++;
			}

		} catch (Exception e) {

		}

	}

}
