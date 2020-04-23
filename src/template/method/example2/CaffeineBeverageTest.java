package template.method.example2;

public class CaffeineBeverageTest {
	public static void main(String[] args) {
		System.out.println("--------- 차를 준비합니다. ---------");
		Tea myTea = new Tea();
		myTea.prepareRecipe();
		
		System.out.println();
		
		System.out.println("-------- 커피를 준비합니다. ---------");
		Coffee myCoffee = new Coffee();
		myCoffee.prepareRecipe();
	}
	
}
