
public class Decorator implements IDisplayComponent, IKeyEventHandler {

	private IDisplayComponent c;
	private IKeyEventHandler s;

	public Decorator(IDisplayComponent c) {

		this.c = c;
		s = (IKeyEventHandler) c;
	}

	@Override
	public String display() {
		return c.display();
	}

	@Override
	public void addSubComponent(IDisplayComponent c) {
		// TODO Auto-generated method stub
	}

	@Override
	public void key(String ch, int cnt) {
		s.key(ch, cnt);
	}

	@Override
	public void setNext(IKeyEventHandler next) {
		s.setNext(next);
	}

}
