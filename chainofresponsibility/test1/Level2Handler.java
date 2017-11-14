package designpatterns.chainofresponsibility.test1;

import java.io.IOException;

public class Level2Handler extends Handler {

	@Override
	public void handleRequest(Exception exception) {
		if(exception instanceof IOException){
			System.out.println("Level 2 of exception management - IOException");
		}
		else{
			if(successor != null){
				successor.handleRequest(exception);
			}
		}
	}
}
