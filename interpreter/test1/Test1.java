package designpatterns.interpreter.test1;

public class Test1 {

	public static void main(String[] args) {
		Expression interpreter = Test1.buildInterpreterTree();

		String sentence = "one three four";

		System.out.println(sentence + " is " + interpreter.interpret(sentence));
	}

	public static Expression buildInterpreterTree(){
		//Establish a grammar
		Expression terminal1 = new TerminalExpression("one");
		Expression terminal2 = new TerminalExpression("two");
		Expression terminal3 = new TerminalExpression("three");

		//one OR two
		Expression combination1 = new OrExpression(terminal1, terminal2);
		//three AND (one OR two)
		Expression combination2 = new AndExpression(terminal3, combination1);

		return combination2;
	}
}
