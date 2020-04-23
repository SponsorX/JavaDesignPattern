package facade.sample1;

public class Tuner {
	Amplifier amplifier;
	
	
	
	public Tuner(Amplifier amplifier) {
		super();
		this.amplifier = amplifier;
	}
	public void on() {
		System.out.println("Tuner : 튜너를 켭니다.");
	}
	public void off() {
		System.out.println("Tuner : 튜너를 끕니다.");
	}
	public void setAm() {
		System.out.println("Tuner : 라디오를 AM으로 전환합니다.");
	}
	public void setFm() {
		System.out.println("Tuner : 라디오를 FM으로 전환합니다.");
	}
	public void setFrequency() {
		System.out.println("Tuner : 라디오의 주파수를 설정합니다.");
	}
}
