package designpatterns.command.test2;

public class CrouchCommand implements Command {

	@Override
	public void execute(Actor actor) {
		actor.crouch();
	}

}
