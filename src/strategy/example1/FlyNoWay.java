package strategy.example1;

class FlyNoWay implements FlyBehavior{
	@Override
	public void fly() {
		System.out.println("날지 못합니다.");
	}
}