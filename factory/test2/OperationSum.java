package designpatterns.factory.test2;

public class OperationSum implements Operation {

	@Override
	public int operate(int a, int b) {
		return a + b;
	}

}
