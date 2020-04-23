package adapter.example1;

public class TurkeyAdapter implements Duck {
	Turkey turkey;
	
	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}
	
	@Override
	public void quack() {
		turkey.gobble();

	}

	@Override
	public void fly() {
		for(int i = 0 ; i < 5 ; i++)
			System.out.println("칠면조가 오리처럼 난다.");

	}

}
