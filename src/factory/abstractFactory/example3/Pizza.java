package factory.abstractFactory.example3;

import java.util.ArrayList;

public abstract class Pizza {
	String name;
	Dough dough;
	Sauce sauce;
	Veggies veggies[];
	Cheese cheese;
	Clams clam;
	
	public String getName() {
		return name;
	}
	
	public abstract void prepare();

	public void bake() {
		System.out.println("350도에서 25분간 피자를 굽습니다.");
	}

	public void cut() {
		System.out.println("원형 모양의 조각으로 피자를 자릅니다.");
	}

	public void box() {
		System.out.println("피자를 포장합니다.");
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public String toString() {
		return name;
	}
	
}
