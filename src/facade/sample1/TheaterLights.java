package facade.sample1;

public class TheaterLights {
	public void on() {
		System.out.println("Lights : 영화관람실 조명을 켭니다.");
	}
	public void off() {
		System.out.println("Lights : 영화관람실 조명을 끕니다.");
	}
	public void dim(int light) {
		System.out.println("Lights : 영화관람실 조명을 " + light + "로 조절합니다.");
	}
}
