package command.example2;

public class Stereo {
	private String name;
	public Stereo(String name) {
		this.name = name;
	}
	
	public void on() {
		System.out.println("스테레오를 켭니다.");
	}
	public void off() {
		System.out.println("스테레오를 끕니다.");
	}
	public void setCD() {
		System.out.println("스테레오의 CD 기능을 켭니다.");
	}
	public void setDVD() {
		System.out.println("스테레오의 DVD 기능을 켭니다.");
	}
	public void setRadio() {
		System.out.println("스테레오의 Radio 기능을 켭니다.");
	}
	public void setVolume(int volume) {
		System.out.println("스테레오의 볼륨을 " + volume + "로 설정합니다.");
	}
}
