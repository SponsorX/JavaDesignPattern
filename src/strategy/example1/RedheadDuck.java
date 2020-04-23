package strategy.example1;

class RedheadDuck extends Duck{
	public RedheadDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	public void display() {
		System.out.println("저는 빨건머리오리입니다.");
	}

}