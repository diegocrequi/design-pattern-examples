package stateExample;

public class Subject {
	private String name;
	private State state;
	private Integer numCredits;
	
	public Subject(String name, State state, Integer numCredits) {
		this.name = name;
		this.state = state;
		this.numCredits = numCredits;
	}
	
	public Double getCost() {
		return state.getCost() * numCredits;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStateName() {
		return state.getName();
	}

	public void setState(State state) {
		this.state = state;
	}
	
	public String toString() {
		return name + ": " + this.getCost();
	}
}
