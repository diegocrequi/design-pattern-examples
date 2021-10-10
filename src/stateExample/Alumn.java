package stateExample;


public class Alumn {

	public static void main(String[] args) {
		Enrollment enrollment = new Enrollment(new DraftState());
		enrollment.showCurrentState();
		
		// Change state to Cancelled
		enrollment.setPresentEnrollment(false);
		enrollment.nextState();
		enrollment.showCurrentState();
		
		// Change state to Draft
		enrollment.nextState();
		enrollment.showCurrentState();
		
		// Change state to Presented
		enrollment.setPresentEnrollment(true);
		enrollment.nextState();
		enrollment.showCurrentState();
	}
}
