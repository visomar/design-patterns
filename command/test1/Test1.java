package designpatterns.command.test1;

public class Test1 {

	public static void main(String[] args) {
		// The Light and Switch example is a common command example which allows us to see the basic "how to" 
		// with this pattern

		//The Receiver
		Light light = new Light();

		//The Invoker
		Switch swithc = new Switch();

		//The concrete implementation of a command
		Command onCommand = new OnCommand(light);
		Command offCommand = new OffCommand(light);

		//Instead of calling light.on(), we call the "execution" of that command over the "light" object
		swithc.execute(onCommand);
		swithc.execute(offCommand);
	}
}
