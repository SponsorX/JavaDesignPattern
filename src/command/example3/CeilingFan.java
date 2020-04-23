package command.example3;

public class CeilingFan {
	public static final int HIGH = 2;
	public static final int MEDIUM = 1;
	public static final int LOW = 1;
	public static final int OFF = 0;
	String location;
	int speed;
	
	//Git Test용 주석 추가
	
	public CeilingFan(String location) {
		this.location = location;
		speed = OFF;
	}
	
	public void high() {
		speed = HIGH;
	}
	public void medium() {
		speed = MEDIUM;
	}
	public void low() {
		speed = LOW;
	}
	public void off() {
		speed = OFF;
	}
	public int getSpeed() {
		return speed;
	}
	
}
