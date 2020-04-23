package strategy.example1;

abstract class Duck{
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	
	
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	public void performQuack() {
		quackBehavior.quack();
	}
	public void performFly() {
		flyBehavior.fly();
	}
	public void swim() {
		System.out.println("헤엄친다.");
	}
	abstract public void display();
	//기타 오리 관련 메소드
}