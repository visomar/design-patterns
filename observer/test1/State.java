package designpatterns.observer.test1;

public class State {

	private String msg = "";

	public State(String msg){
		this.msg = msg;
	}

	public String getMessage(){
		return this.msg;
	}
}
