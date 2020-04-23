package factory.method.example2;

import java.util.ArrayList;

public abstract class Pizza {
	String name;
	String dough;
	String sauce;
	ArrayList<String> toppings = new ArrayList<String>();
	
	public String getName() {
		return name;
	}
	
	public void prepare() {
		System.out.println(name + "피자의 재료를 준비합니다.");
		System.out.println("도우를 준비합니다.");
		System.out.println("소스를 첨가합니다.");
		System.out.println("토핑을 첨가합니다.");
		for(int i = 0; i < toppings.size(); i++) {
			System.out.println("   " + toppings.get(i));
		}
	}

	public void bake() {
		System.out.println("350도에서 25분간 피자를 굽습니다.");
	}

	public void cut() {
		System.out.println("원형 모양의 조각으로 피자를 자릅니다.");
	}

	public void box() {
		System.out.println("피자를 포장합니다.");
	}
	
}
