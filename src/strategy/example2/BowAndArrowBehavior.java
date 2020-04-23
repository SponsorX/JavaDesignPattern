package strategy.example2;

class BowAndArrowBehavior implements WeaponBehavior{
	@Override
	public void useWeapon() {
		System.out.println("활로 공격합니다.");
	}
}