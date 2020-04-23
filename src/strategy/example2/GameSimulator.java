package strategy.example2;
public class GameSimulator {

	public static void main(String[] args) {
		Character knight1 = new Knight();
		knight1.setWeapon(new SwordBehavior());
		knight1.fight();
		knight1.setWeapon(new AxeBehavior());
		knight1.fight();
	}

}
