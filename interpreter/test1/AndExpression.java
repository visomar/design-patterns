package designpatterns.interpreter.test1;

public class AndExpression implements Expression {

	private Expression expression1 = null;
	private Expression expression2 = null;

	public AndExpression(Expression exp1, Expression exp2) {
		this.expression1 = exp1;
		this.expression2 = exp2;
	}

	@Override
	public boolean interpret(String context) {
		return expression1.interpret(context) && expression2.interpret(context);
	}
}
