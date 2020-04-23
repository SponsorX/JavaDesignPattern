package command.example3;

public class RemoteLoader {

	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();
		
		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen Room");
		Stereo stereo = new Stereo("Living Room");
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		
		
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
		
		StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);
		
		CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
		
		Command[] partyOn = { livingRoomLightOn, kitchenLightOn, stereoOnWithCD, ceilingFanHigh };
		Command[] partyOff = {livingRoomLightOff, kitchenLightOff, stereoOff, ceilingFanOff };
		MacroCommand partyOnMacro = new MacroCommand(partyOn);
		MacroCommand partyOffMacro = new MacroCommand(partyOff);
		
		
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		remoteControl.setCommand(2, stereoOnWithCD, stereoOff);
		
		remoteControl.setCommand(6, partyOnMacro, partyOffMacro);
		
		System.out.println(remoteControl);
		
		remoteControl.onButtonPressed(0);
		//System.out.println(remoteControl);
		remoteControl.undoButtonPressed();
		
		remoteControl.onButtonPressed(1);
		remoteControl.onButtonPressed(2);
		//System.out.println(remoteControl);
		remoteControl.undoButtonPressed();
		
		
		remoteControl.onButtonPressed(3);
		remoteControl.onButtonPressed(4);
		remoteControl.onButtonPressed(5);
		remoteControl.onButtonPressed(6);

		System.out.println(remoteControl);
		
		
		

	}

}
