package facade.sample1;

public class HomeTheaterFacadeTest {
	public static void main(String[] args) {
		HomeTheaterFacadeTest homeTheaterFacadeTest = new HomeTheaterFacadeTest();
		homeTheaterFacadeTest.go();
	}

	private void go() {
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
		
		HomeTheaterFacade homeTheater = new HomeTheaterFacade(amplifier, tuner, dvdPlayer, cdPlayer, projector, screen, theaterLights, popcornPopper);
		System.out.println("---------- dvd 시청 ----------");
		homeTheater.watchMovie("바람과 함께 사라지다.");
		homeTheater.endMovie();
		System.out.println("---------- 라디오 청취 ----------");
		homeTheater.listenRadio();
		homeTheater.endRadio();
		System.out.println("---------- 씨디 청취 ----------");
		homeTheater.listenToCd();
		homeTheater.endCd();
		
		
	}

}
