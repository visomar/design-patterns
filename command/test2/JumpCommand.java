package designpatterns.command.test2;

public class JumpCommand implements Command {

	@Override
	public void execute(Actor actor) {
		actor.jump();
	}

}
