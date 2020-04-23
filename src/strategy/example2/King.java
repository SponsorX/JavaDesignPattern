package strategy.example2;

class King extends Character{
	@Override
	void fight() {
		weapon.useWeapon();	
	}
}