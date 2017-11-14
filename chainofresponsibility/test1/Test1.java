package designpatterns.chainofresponsibility.test1;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Test1 {

	public static void main(String[] args) {
		Handler level1 = new Level1Handler();
		Handler level2 = new Level2Handler();
		Handler level3 = new Level3Handler();
		
		level1.setSuccessor( level2 );
		level2.setSuccessor( level3 );
		
		level1.handleRequest( new IOException() );
		level1.handleRequest( new FileNotFoundException() );
		level1.handleRequest( new NullPointerException() );
		level2.handleRequest( new FileNotFoundException() );
	}

}
