package strategy.example2;

class Troll extends Character{
	@Override
	void fight() {
		weapon.useWeapon();		
	}
}