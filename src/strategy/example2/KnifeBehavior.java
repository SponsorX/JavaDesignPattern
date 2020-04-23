package strategy.example2;

class KnifeBehavior implements WeaponBehavior{
	@Override
	public void useWeapon() {
		System.out.println("칼로 공격합니다.");
	}
}