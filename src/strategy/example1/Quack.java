package strategy.example1;

class Quack implements QuackBehavior{
	@Override
	public void quack() {
		System.out.println("꽥꽥");
	}
}