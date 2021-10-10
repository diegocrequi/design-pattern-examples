package stateExample;

public class Enrollment {
	
	State state;
	Boolean presentEnrollment;
	
	public Enrollment(DraftState initialState) {
		initialState.setEnrollment(this);
		this.state = initialState;
		presentEnrollment = false;
	}
	
	public void nextState() {
		state.nextState();
	}
	
	public void showCurrentState( ) {
		System.out.println("Current state: " + state.getName());
	}
	
	public void setState(State state) {
		this.state = state;
	}

	public Boolean getPresentEnrollment() {
		return presentEnrollment;
	}

	public void setPresentEnrollment(Boolean presentEnrollment) {
		this.presentEnrollment = presentEnrollment;
	}
}
