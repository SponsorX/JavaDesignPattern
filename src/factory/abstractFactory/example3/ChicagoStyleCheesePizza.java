package factory.abstractFactory.example3;

public class ChicagoStyleCheesePizza extends Pizza {

	public ChicagoStyleCheesePizza() {
		name ="Chica Style Deep Dish Cheese Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
		
		toppings.add("Shredded Mozzarella Cheese");
	}
	public void cut() {
		System.out.println("사각형 모양의 조각으로 피자를 자릅니다.");
	}
}
