package designpatterns.controller.test1;

//The ConcreteCommand
public class OnCommand implements Command {

	private Light light;

	public OnCommand(Light light) {
		// tie the receiver to this command instance
		this.light = light;
	}

	@Override
	public void execute() {
		light.on();
		System.out.println( light.toString() );
	}
}
