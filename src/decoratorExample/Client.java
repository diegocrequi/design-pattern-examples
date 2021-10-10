package decoratorExample;

public class Client {

	public static void main(String[] args) {
		Message message = new Message("This is my message");
		
		// Send via SMS and Slack
		BaseNotifier smsNotifier = new SMSNotifier(message);
		BaseNotifier slackNotifier = new SlackNotifier(smsNotifier);
		slackNotifier.execute();
	}
}
