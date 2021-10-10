package decoratorExample;

/**
 * Concrete Decorator
 */
public class SlackNotifier extends BaseNotifier{

	public SlackNotifier(MessageInterface wrappee) {
		super(wrappee);
	}
	
	public void execute(){
		super.execute();
		System.out.println("\tSent message via Slack");
	}
}
