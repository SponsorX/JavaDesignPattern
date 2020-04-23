package factory.simple.example1;

public abstract class Pizza {

	public void prepare() {
		System.out.println("피자의 재료를 준비합니다.");
	}

	public void bake() {
		System.out.println("피자를 굽습니다.");
	}

	public void cut() {
		System.out.println("피자를 자릅니다.");
	}

	public void box() {
		System.out.println("피자를 포장합니다.");
	}
	
}
