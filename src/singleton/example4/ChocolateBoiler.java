package singleton.example4;

//고전적인 싱글톤 패턴은 다중 스레드에서 문제를 일으킴. 이 문제를 해결해야 함.
public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	private static ChocolateBoiler chocolateBoiler;

	//2. 클래스이름.getInstance 메소드를 호출하여 싱글톤 객체를 얻기 때문에 getChocolateBoiler() 보다는 getInstance()로 메소드 이름 지정. 정적 메소드로 지정 필요
	//3. 이 해결 방법은 메소드에 lock을 거는 방법임. 한번에 하나의 쓰레드만 접근 가능.
	public static synchronized ChocolateBoiler getInstance() {
		if (chocolateBoiler == null) {
			chocolateBoiler = new ChocolateBoiler();
		}
		return chocolateBoiler;
	}
	//4. 인스턴스를 필요할 때 생성하지말고, 처음부터 만들어 버리는 것도 좋은 방법이 될 수 있음.
	//public static ChocolateBoiler chocolateBoiler = new ChocolateBoiler();
	//private ChocolateBoiler(){}
	//public static ChocolateBoiler getInstance(){
	//	return chocolateBoiler;
	//}
	
	//1. 싱글턴 패턴의 경우는 생성자의 접근자를 private으로 설정
	private ChocolateBoiler() { 
		empty = true;
		boiled = false;
	}
	
	public void fill() {
		if (isEmpty()) {
			empty = false;
			boiled = false;
		}
	}
	
	public void drain() {
		if (!isEmpty() && isBoiled()) {
			empty = true;
		}
	}
	
	public void boil() {
		if (!isEmpty() && !isBoiled()) {
			boiled = true;
		}
	}
	
	public boolean isEmpty() {
		return empty;
	}
	
	public boolean isBoiled() {
		return boiled;
	}
}
