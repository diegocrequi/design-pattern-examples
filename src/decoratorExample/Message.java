package decoratorExample;

public class Message implements MessageInterface {
	
	private String messageText;
	
	public Message(String messageText) {
		this.messageText = messageText;
	}

	@Override
	public void execute() {
		System.out.println("Starting sending the message:");
	}
}
