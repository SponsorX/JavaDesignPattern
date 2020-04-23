package adapter.example1;

public class DuckTestDrive {

	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();
		
		WildTurkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		
		System.out.println("칠면조...");
		turkey.gobble();
		turkey.fly();
		
		System.out.println("\n오리...");
		testDuck(duck);
		
		System.out.println("\n오리가면을 쓴 칠면조...");
		testDuck(turkeyAdapter);

	}

	private static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
		
	}

}
