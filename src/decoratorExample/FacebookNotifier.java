package decoratorExample;

/**
 * Concrete Decorator
 */
public class FacebookNotifier extends BaseNotifier {

	public FacebookNotifier(MessageInterface wrappee) {
		super(wrappee);
	}
	
	public void execute(){
		super.execute();
		System.out.println("\tSent message via Facebook");
	}
}
