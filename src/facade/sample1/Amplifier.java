package facade.sample1;

public class Amplifier {
	Tuner tuner;
	DvdPlayer dvdPlayer;
	CdPlayer cdPlayer;
	
	public void on() {
		System.out.println("AMP : 앰프의 전원을 켭니다.");
	}
	public void off() {
		System.out.println("AMP : 앰프의 전원을 끕니다.");
	}
	public void setCD() {
		
		System.out.println("AMP : CD를 설정합니다.");
	}
	public void setDvD() {
		
		System.out.println("DAMP : VD를 설정합니다.");
	}
	public void setStereoSound() {
		System.out.println("AMP : 스테레오 사운드를 설정합니다.");
	}
	public void setSurroundSound() {
		System.out.println("AMP : 서라운드 사운드를 설정합니다.");
	}
	public void setTuner() {
		System.out.println("AMP : 튜너를 설정합니다.");
	}
	public void setVolumn(int i) {
		System.out.println("AMP : 볼륨을 " + i +"로 설정합니다.");
	}
}
