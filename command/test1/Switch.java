package designpatterns.command.test1;

//The Invoker
public class Switch {
	//Here you can manage what to do with the action: store, execute, undo...
	
	public void execute(Command command){
		command.execute();
	}
}
