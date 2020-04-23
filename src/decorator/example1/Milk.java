package decorator.example1;

public class Milk extends CondimentDecorator {

	Beverage beverage;
	
	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", 모카";
	}

	public double cost() {
		return beverage.cost() + .10;
	}
}
