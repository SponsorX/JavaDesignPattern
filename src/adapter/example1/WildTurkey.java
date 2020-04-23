package adapter.example1;

public class WildTurkey implements Turkey {

	@Override
	public void gobble() {
		System.out.println("구블 구블.");

	}

	@Override
	public void fly() {
		System.out.println("칠면조가 난다.");

	}

}
