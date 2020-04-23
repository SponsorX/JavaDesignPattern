package facade.sample1;

public class HomeTheaterFacade {
	Screen screen;
	PopcornPopper popcornPopper;
	TheaterLights theaterLights;
	
	Amplifier amplifier;
	Tuner tuner;
	CdPlayer cdPlayer;
	DvdPlayer dvdPlayer;
	Projector projector;
	
	public HomeTheaterFacade(Amplifier amp, Tuner tuner, DvdPlayer dvd, CdPlayer cd, Projector projector, Screen screen, TheaterLights lights, PopcornPopper popper) {
		this.amplifier = amp;
		this.popcornPopper = popper;
		this.theaterLights = lights;
		
		this.amplifier = amp;
		this.tuner = tuner;
		this.cdPlayer = cd;
		this.dvdPlayer = dvd;
		this.projector = projector;
		this.screen = screen;
	}
	
	public void watchMovie(String string) {
		projector.setInput(dvdPlayer);
		projector.on();
		screen.down();
		dvdPlayer.on();
		dvdPlayer.setSurroundAudio();
		dvdPlayer.play("바람과 함께 사라지다.");
	}
	public void endMovie() {
		projector.off();
		dvdPlayer.off();
		screen.up();
	}
	public void listenToCd() {
		cdPlayer.on();
		cdPlayer.play();
	}
	public void endCd() {
		cdPlayer.off();
	}
	public void listenRadio() {
		tuner.on();
		tuner.setFm();
		tuner.setFrequency();
	}
	public void endRadio() {
		tuner.off();
	}
}
