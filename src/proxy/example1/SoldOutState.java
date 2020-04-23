package proxy.example1;

public class SoldOutState implements State {
	
	GumballMachine gumballMachine;
	
	public SoldOutState(GumballMachine gumballMachine) {
		super();
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("매진되었습니다.");

	}

	@Override
	public void ejectQuarter() {
		System.out.println("매진되었습니다. 동전을 반환받으세요.");

	}

	@Override
	public void turnCrank() {
		System.out.println("매진되었습니다.");

	}

	@Override
	public void dispense() {
		System.out.println("매진되었습니다.");

	}

}
