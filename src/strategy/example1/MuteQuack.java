package strategy.example1;

class MuteQuack implements QuackBehavior{

	@Override
	public void quack() {
		//소리를 낼 수 없음...
	}
}