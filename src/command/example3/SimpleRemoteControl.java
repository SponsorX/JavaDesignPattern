package command.example3;

public class SimpleRemoteControl {
	Command slot;
	public SimpleRemoteControl() {
		
	}
	public void setCommand(Command command) {
		slot = command;
	}
	public void bottonWasPressed() {
		slot.execute();
	}
}
