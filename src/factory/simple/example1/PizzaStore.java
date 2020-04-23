package factory.simple.example1;

public class PizzaStore {
	SimplePizzaFactory factory;
	public PizzaStore(SimplePizzaFactory factory) {
		this.factory = factory;
	}
	
	public static void main(String[] args) {
		PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
		pizzaStore.go();
	}

	public void go() {
		orderPizza("cheese");
		orderPizza("pepperoni");
		orderPizza("clam");
		orderPizza("veggie");
	}

	public Pizza orderPizza(String type) {
		//typePizza pizza = new Pizza();
		
		Pizza pizza;
		pizza = factory.createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
		
	}
}
