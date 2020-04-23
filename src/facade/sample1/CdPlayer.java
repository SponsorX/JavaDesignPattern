package facade.sample1;

public class CdPlayer {
	Amplifier amplifier;
	
	
	
	public CdPlayer(Amplifier amplifier) {
		super();
		this.amplifier = amplifier;
	}
	public void on() {
		System.out.println("CDPlayer : CD 플레이어를 켭니다.");
	}
	public void off() {
		System.out.println("CDPlayer : CD 플레이어를 끕니다.");
	}
	public void eject() {
		System.out.println("CDPlayer : CD를 배출합니다.");
	}
	public void pause() {
		System.out.println("CDPlayer : CD 재생을 잠시 중지합니다.");
	}
	public void play() {
		System.out.println("CDPlayer : CD를 재생합니다.");
	}
	public void stop() {
		System.out.println("CDPlayer : CD 재생을 정지합니다.");
	}
}
