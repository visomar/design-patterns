package designpatterns.command.test2;

public class ShootCommand implements Command {

	@Override
	public void execute(Actor actor) {
		actor.shoot();
	}

}
