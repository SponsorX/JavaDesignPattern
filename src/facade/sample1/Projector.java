package facade.sample1;

public class Projector {
	DvdPlayer dvdPlayer;
	public void setInput(DvdPlayer dvdPlayer) {
		this.dvdPlayer = dvdPlayer;
		System.out.println("Projector : dvd와 연결합니다.");
	}
	
	public void on() {
		System.out.println("Projector : 프로젝터를 켭니다.");
	}
	public void off() {
		System.out.println("Projector : 프로젝터를 끕니다.");
	}
	public void tvMode() {
		System.out.println("Projector : tvMode로 설정합니다.");
	}
	public void wideScreenMode() {
		System.out.println("Projector : wideScreenMode로 설정합니다.");
	}
}
