package stateExample;

public class ThirdState implements State {
	private Double cost = 54.71;
	private String name = "Second";

	@Override
	public Double getCost() {
		return cost;
	}

	@Override
	public String getName() {
		return name;
	}

}
