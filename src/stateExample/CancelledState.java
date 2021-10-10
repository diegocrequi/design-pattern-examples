package stateExample;

public class CancelledState implements State {

	String name = "Cancelled";
	Enrollment enrollment;

	@Override
	public void nextState() {
		State nextState = new DraftState();
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
