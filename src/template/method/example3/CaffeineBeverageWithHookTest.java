package template.method.example3;

public class CaffeineBeverageWithHookTest {
	public static void main(String[] args) {
		System.out.println("---------- 커피를 준비합니다. ---------");
	    CoffeeWithHook myCoffee = new CoffeeWithHook();
		myCoffee.prepareRecipe();
		
		System.out.println();
		
		System.out.println("---------- 차를 준비합니다. ---------");
	    TeaWithHook myTea = new TeaWithHook();
		myTea.prepareRecipe();
		
	}
	
}
