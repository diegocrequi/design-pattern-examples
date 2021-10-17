package stateExample;

public class FirstState implements State {
	private Double cost = 12.62;
	private String name = "First";

	@Override
	public Double getCost() {
		return cost;
	}

	@Override
	public String getName() {
		return name;
	}

}
