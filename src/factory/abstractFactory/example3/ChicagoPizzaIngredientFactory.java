package factory.abstractFactory.example3;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	@Override
	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	@Override
	public BlackOlives createBlackOlives() {
		return new BlackOlives();
	}

	@Override
	public SlicedPepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Frozenclam createFrozenClam() {
		return new FrozenClam();
	}
	
}
