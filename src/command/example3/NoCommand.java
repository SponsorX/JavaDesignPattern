package command.example3;

public class NoCommand implements Command {

	@Override
	public void execute() {
		System.out.println("명령이 탑재되지 않은 상태입니다.");

	}

}
