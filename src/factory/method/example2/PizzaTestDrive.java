package factory.method.example2;

public class PizzaTestDrive {
	// 팩토리 메소드 패턴 - 팩토리 메소드 패턴에서는 객체를 생성하기 위한 인터페이스를 정의하는 데, 어떤 클래스의 인스턴스를 만들지는 서브클래스에서 결정하게 만든다.
	// 팩터리 메소드 패턴을 이용하면 클래스의 인스턴스를 만드는 일을 서브클래스에게 맡기게 된다.
	
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		
		
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");

		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");

	}

}
