package facade.sample1;

public class DvdPlayer {
	Amplifier amplifier;
	
	public DvdPlayer(Amplifier amplifier) {
		super();
		this.amplifier = amplifier;
	}
	public void on() {
		System.out.println("DVDPlayer : DVD 플레이어를 켭니다.");
	}
	public void off() {
		System.out.println("DVDPlayer : DVD 플레이어를 끕니다.");
	}
	public void eject() {
		System.out.println("DDVDPlayer : VD를 배출합니다.");
	}
	public void pause() {
		System.out.println("DVDPlayer : DVD 재생을 잠시 중지합니다.");
	}
	public void play(String movie) {
		System.out.println("DVDPlayer :" + movie + " DVD를 재생합니다.");
	}
	public void stop() {
		System.out.println("DVDPlayer : DVD 재생을 정지합니다.");
	}
	public void setSurroundAudio() {
		System.out.println("DVDPlayer : 써라운드 오디오를 설정합니다.");
	}
	public void setTwoChannelAudio() {
		System.out.println("2채널 오디오를 설정합니다.");
	}
}
