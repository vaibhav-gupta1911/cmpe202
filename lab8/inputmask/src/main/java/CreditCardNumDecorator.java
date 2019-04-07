
public class CreditCardNumDecorator extends Decorator {

	StringBuilder number = new StringBuilder();
	private String decorate;

	public CreditCardNumDecorator(IDisplayComponent c) {
		super(c);

	}

	public String decorate(String s) {
		number.setLength(0);
		if (!s.equals("[4444 4444 4444 4444]" + "  ")) {
			for (int i = 0; i < s.length(); i++) {
				if (i == 5 || i == 9 || i == 13)
					number.append(" " + s.charAt(i));
				else
					number.append(s.charAt(i));
			}
			return number.toString();
		} else
			return s;
	}

	public String display() {
		decorate = super.display();
		return decorate(decorate);
	}
}
