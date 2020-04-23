package strategy.example1;

class Squeak implements QuackBehavior{
	@Override
	public void quack() {
		System.out.println("삑삑");
	}
}