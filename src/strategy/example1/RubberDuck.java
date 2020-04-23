package strategy.example1;

class RubberDuck extends Duck{
	public RubberDuck() {
		quackBehavior = new Squeak();
		flyBehavior = new FlyNoWay();
	}
	public void display() {
		System.out.println("저는 고무오리입니다.");
	}
}