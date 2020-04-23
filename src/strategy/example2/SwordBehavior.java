package strategy.example2;

class SwordBehavior implements WeaponBehavior{
	@Override
	public void useWeapon() {
		System.out.println("검으로 공격합니다.");
	}
}