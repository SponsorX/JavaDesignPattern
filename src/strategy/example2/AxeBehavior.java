package strategy.example2;

class AxeBehavior implements WeaponBehavior{
	@Override
	public void useWeapon() {
		System.out.println("도끼로 공격합니다.");
	}
}