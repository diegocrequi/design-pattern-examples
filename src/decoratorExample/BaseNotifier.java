package decoratorExample;

public class BaseNotifier implements MessageInterface{
	private MessageInterface wrappee;
	
	public BaseNotifier(MessageInterface wrappee) {
		super();
		this.wrappee = wrappee;
	}

	@Override
	public void execute() {
		wrappee.execute();
	}
}
