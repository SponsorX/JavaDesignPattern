package factory.method.example2;

public class NYPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(String type) {
		Pizza pizza = null;
		if (type.equals("cheese")) {
			pizza = new NYStyleCheesePizza();
		/*}  else if (type.equals("greek")) {
			pizza = new GreekPizza(); 
		} else if (type.equals("pepperoni")) {
			pizza = new NYStylePepperoniPizza();
		} else if (type.equals("clam")) {
			pizza = new NYStyleClamPizza();
		} else if (type.equals("veggie")) {
			pizza = new NYStyleVeggiePizza(); */
		}
		System.out.println("뉴욕식"+ type +" 피자를 만듭니다.");
		return pizza;
	}

}
