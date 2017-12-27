package designpatterns.factory.test2;

import designpatterns.factory.test2.OperationFactory.OperationType;

public class Test2 {

	public static void main(String[] args) {
		// I don't know how useful this approach would be, but it's simple, and easy to express as
		// a factory pattern. I'm looking for examples, not actual pieces of code, you silly ass.

		// The example in this test tries to implement a binary operation of a calculator, and given
		// two integers and the description of the operation we want to apply, the Factory pattern
		// should return an appropiate class to solve the operation itself.

		int a = 9;
		int b = 7;

		Operation sum = OperationFactory.getOperation( OperationType.ADD );
		Operation sub = OperationFactory.getOperation( OperationType.SUBTRACT );
		Operation mul = OperationFactory.getOperation( OperationType.MULTIPLY );

		System.out.println( sum.operate(a, b) );
		System.out.println( sub.operate(a, b) );
		System.out.println( mul.operate(a, b) );
	}

}
