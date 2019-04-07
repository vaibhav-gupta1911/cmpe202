
public class CreditCardExpDecorator extends Decorator {

	StringBuilder number = new StringBuilder();
	private String decorate;
	IScreen c;

	public CreditCardExpDecorator(IDisplayComponent c) {
		super(c);
	}

	public String decorate(String s) {
		number.setLength(0);
		if (!s.equals("[MM/YY]" + "  ")) {
			for (int i = 0; i < s.length(); i++) {
				if (i == 3)
					number.append("/" + s.charAt(i));
				else
					number.append(s.charAt(i));
			}

			return number.toString();
		} else
			return s;
	}

	@Override
	public String display() {
		decorate = super.display();
		return decorate(decorate);
	}   
}
