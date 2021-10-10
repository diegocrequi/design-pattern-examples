package decoratorExample;

/**
 * Concrete Decorator
 */
public class SMSNotifier extends BaseNotifier {

	public SMSNotifier(MessageInterface wrappee) {
		super(wrappee);
	}

	public void execute(){
		super.execute();
		System.out.println("\tSent message via SMS");
	}

}
