package factory.simple.example1;

public class SimplePizzaFactory {
	
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		/*}  else if (type.equals("greek")) {
			pizza = new GreekPizza(); */
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		} else if (type.equals("clam")) {
			pizza = new ClamPizza();
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizza();
		}
		System.out.println(type +" 피자를 만듭니다.");
		return pizza;
	}
}
	