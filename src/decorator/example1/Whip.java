package decorator.example1;

public class Whip extends CondimentDecorator {

	Beverage beverage;
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", 휘핑크림";
	}

	public double cost() {
		return beverage.cost() + .10;
	}
}
