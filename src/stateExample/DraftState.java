package stateExample;

public class DraftState implements State {

	String name = "Draft";
	Enrollment enrollment;

	public void nextState() {
		State nextState;
		if (enrollment.getPresentEnrollment()) {
			nextState = new PresentedState();
		} else {
			nextState = new CancelledState();
		}
		nextState.setEnrollment(enrollment);
		enrollment.setState(nextState);
	}

	public void setEnrollment(Enrollment enrollment) {
		this.enrollment = enrollment;
	}

	public String getName() {
		return name;
	}
}
