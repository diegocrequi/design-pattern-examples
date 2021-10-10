package stateExample;

public class PresentedState implements State {

	String name = "Presented";
	Enrollment enrollment;

	@Override
	public void nextState() {
		State nextState = new CancelledState();
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
