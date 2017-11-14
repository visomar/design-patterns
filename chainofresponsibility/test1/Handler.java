package designpatterns.chainofresponsibility.test1;

public abstract class Handler {

	protected Handler successor;
	
	public abstract void handleRequest(Exception exception);
	
	public void setSuccessor(Handler successor){
		this.successor = successor;
	}
}
