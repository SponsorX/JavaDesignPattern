package strategy.example1;

class FlyWithWings implements FlyBehavior{
	@Override
	public void fly() {
		System.out.println("날개짓하며 날아갑니다.");	
	}
}