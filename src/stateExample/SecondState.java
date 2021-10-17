package stateExample;

public class SecondState implements State {
	private Double cost = 25.25;
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
