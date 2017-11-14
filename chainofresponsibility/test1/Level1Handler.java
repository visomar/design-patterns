package designpatterns.chainofresponsibility.test1;

import java.io.FileNotFoundException;

public class Level1Handler extends Handler {

	@Override
	public void handleRequest(Exception exception) {
		if(exception instanceof FileNotFoundException){
			System.out.println("Level 1 of exception management - FileNotFoundException");
		}
		else{
			if(successor != null){
				successor.handleRequest(exception);
			}
		}
	}
}
