package designpatterns.controller.test1;

//The ConcreteCommand
public class OffCommand implements Command {

	public Light light;

	public OffCommand(Light light) {
		// tie the receiver to this command instance
		this.light = light;
	}

	@Override
	public void execute() {
		light.off();
		System.out.println( light.toString() );
	}
}
