package template.method.example3;

//Hook을 사용한 템플릿 메소드 패턴 

public abstract class CaffeineBeverageWithHook {
	public void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if (customerWantsCondiments()) {
			addCondiments();
		}
		
	};
	
	boolean customerWantsCondiments() {
		//Hook 메소드. 비어있는 메소
		return true;
	}

	abstract void brew();
	abstract void addCondiments();
	
	
	public void boilWater() {
		System.out.println("물 끓이는 중...");
	}
	public void pourInCup() {
		System.out.println("컵에 따르는 중...");
	}
}
