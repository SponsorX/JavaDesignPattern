package facade.sample1;

public class TheaterTest {
	public static void main(String[] args) {	
		Screen screen = new Screen();
		PopcornPopper popcornPopper = new PopcornPopper();
		TheaterLights theaterLights = new TheaterLights();
		
		Amplifier amplifier = new Amplifier();
		Tuner tuner = new Tuner(amplifier);
		CdPlayer cdPlayer = new CdPlayer(amplifier);
		DvdPlayer dvdPlayer = new DvdPlayer(amplifier);
		Projector projector = new Projector();
		projector.setInput(dvdPlayer);
		
		amplifier.cdPlayer = cdPlayer;
		amplifier.dvdPlayer = dvdPlayer;
		amplifier.tuner = tuner;
		
		
		popcornPopper.on();
		popcornPopper.pop();
		theaterLights.dim(10);
		screen.down();
		projector.on();
		projector.setInput(dvdPlayer);
		projector.wideScreenMode();
		
		amplifier.on();
		amplifier.setDvD();
		amplifier.setSurroundSound();
		amplifier.setVolumn(5);
		
		dvdPlayer.on();
		dvdPlayer.play("바람과 함께 사라지다.");	
	}
}
		
