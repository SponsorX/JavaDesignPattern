package state.example2;

public class GumballMachine {
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	State winnerState;
	
	State state = soldOutState;
	int count = 0;
	
	
	public GumballMachine(int count) {
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		
		winnerState = new WinnerState(this); //WinnerState 추가해춰야 함... ㅋ
		
		this.count = count;
		if(count > 0) {
			state = noQuarterState;//동전을 넣지 않은 상태 
		}
	}
	
	
	//동전 투입시에 해야할 일 
	public void insertQuarter() {
		state.insertQuarter();
	}
	//동전 반환시에 해야할 일 
	public void ejectQuarter() {
		state.ejectQuarter();
	}
	//손잡이를 돌렸을 때 해야할 일
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}
	//알맹이를 배출할 때 해야 할 일 
	public void dispense() {
		
	}


	public State getSoldOutState() {
		return soldOutState;
	}


	public void setSoldOutState(State soldOutState) {
		this.soldOutState = soldOutState;
	}


	public State getNoQuarterState() {
		return noQuarterState;
	}


	public void setNoQuarterState(State noQuarterState) {
		this.noQuarterState = noQuarterState;
	}


	public State getHasQuarterState() {
		return hasQuarterState;
	}


	public void setHasQuarterState(State hasQuarterState) {
		this.hasQuarterState = hasQuarterState;
	}


	public State getSoldState() {
		return soldState;
	}


	public void setSoldState(State soldState) {
		this.soldState = soldState;
	}


	public State getWinnerState() {
		return winnerState;
	}


	public void setWinnerState(State winnerState) {
		this.winnerState = winnerState;
	}


	public State getState() {
		return state;
	}


	public void setState(State state) {
		this.state = state;
	}


	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}


	public void releaseBall() {
		System.out.println("알맹이를 배출합니다.");
		count = count - 1;
	}


	@Override
	public String toString() {
		return "GumballMachine [state=" + state + ", count=" + count + "]";
	}


	
	
	
}
