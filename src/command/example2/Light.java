package command.example2;

public class Light {
	private String name;
	public Light(String name) {
		this.name = name;
	}
	public void on() {
		System.out.println(name + " 전등을 켭니다.");
	}
	public void off() {
		System.out.println(name + " 전등을 끕니다.");
	}
}
