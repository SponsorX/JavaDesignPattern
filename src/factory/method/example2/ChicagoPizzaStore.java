package factory.method.example2;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(String type) {
		Pizza pizza = null;
		if (type.equals("cheese")) {
			pizza = new ChicagoStyleCheesePizza();
		/*}  else if (type.equals("greek")) {
			pizza = new GreekPizza(); 
		} else if (type.equals("pepperoni")) {
			pizza = new ChicagoStylePepperoniPizza();
		} else if (type.equals("clam")) {
			pizza = new ChicagoStyleClamPizza();
		} else if (type.equals("veggie")) {
			pizza = new ChicagoStyleVeggiePizza(); */
		}
		System.out.println("시카고식"+ type +" 피자를 만듭니다.");
		return pizza;
	}

}
