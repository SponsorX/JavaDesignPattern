package command.example2;

public class RemoteLoader {

	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();
		
		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen Room");
		Stereo stereo = new Stereo("Living Room");
		
		
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
		
		StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);
		
		
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		remoteControl.setCommand(2, stereoOnWithCD, stereoOff);
		
		System.out.println(remoteControl);
		
		remoteControl.onButtonPressed(0);
		System.out.println(remoteControl);
		remoteControl.undoButtonPressed();
		
		remoteControl.onButtonPressed(1);
		remoteControl.onButtonPressed(2);
		System.out.println(remoteControl);
		remoteControl.undoButtonPressed();
		
		
		remoteControl.onButtonPressed(3);
		remoteControl.onButtonPressed(4);
		remoteControl.onButtonPressed(5);
		remoteControl.onButtonPressed(6);

		
		
		

	}

}
