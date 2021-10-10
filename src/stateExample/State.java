package stateExample;

public interface State {
	void nextState();
	String getName();
	void setEnrollment(Enrollment enrollment);
	
}
