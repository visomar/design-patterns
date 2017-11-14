package designpatterns.chainofresponsibility.test1;

public class Level3Handler extends Handler {

	@Override
	public void handleRequest(Exception exception) {
		System.out.println("Level 3 of exception management - Any Exception");
		
		//No more chained successors
	}
}
