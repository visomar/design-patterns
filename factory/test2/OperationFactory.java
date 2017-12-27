package designpatterns.factory.test2;

public class OperationFactory {

	public enum OperationType{
		ADD,
		SUBTRACT,
		MULTIPLY
	}

	public static Operation getOperation( OperationType type ){
		Operation operation;
		switch (type) {
			case ADD:
				operation = new OperationSum();
				break;
			case SUBTRACT:
				operation = new OperationSub();
				break;
			case MULTIPLY:
				operation= new OperationMul();
				break;
			default:
				operation = null;
				break;
		}

		return operation;
	}
}
