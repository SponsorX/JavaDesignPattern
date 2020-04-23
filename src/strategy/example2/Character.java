package strategy.example2;

abstract class Character{
	WeaponBehavior weapon;
	void setWeapon(WeaponBehavior w) {
		this.weapon = w;
		System.out.println("무기를 장착합니다.");
	}
	abstract void fight();
}