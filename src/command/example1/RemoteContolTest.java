package command.example1;

public class RemoteContolTest {

	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		
		Light light = new Light();
		Command lightOn = new LightOnCommand(light);
		Command lightOff = new LightOffCommand(light);

		GarageDoor garageDoor = new GarageDoor();
		Command garageOpen = new GarageDoorOpenCommand(garageDoor);
		Command garageClose = new GarageDoorCloseCommand(garageDoor);
		
		
		remote.setCommand(lightOn);
		remote.bottonWasPressed();
		
		remote.setCommand(lightOff);
		remote.bottonWasPressed();
		
		remote.setCommand(garageOpen);
		remote.bottonWasPressed();
		
		remote.setCommand(garageClose);
		remote.bottonWasPressed();
	}

}
