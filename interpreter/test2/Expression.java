package designpatterns.interpreter.test2;

public abstract class Expression {
	public abstract String one();
	public abstract String four();
	public abstract String five();
	public abstract String nine();
	public abstract int multiplier();

	public void interpret(Context context){
		String numberAnalyzed = context.getAnalyzedString();
		int output = 0;
		
		if( numberAnalyzed.startsWith(nine()) ){
			output += (9 * multiplier());
			numberAnalyzed = numberAnalyzed.substring(2);
		}
		else if( numberAnalyzed.startsWith(four()) ){
			output += (4 * multiplier());
			numberAnalyzed = numberAnalyzed.substring(2);
		}
		else if( numberAnalyzed.startsWith(five()) ){
			output += (5 * multiplier());
			numberAnalyzed = numberAnalyzed.substring(1);
		}
		
		while( numberAnalyzed.startsWith(one()) ){
			output += multiplier();
			numberAnalyzed = numberAnalyzed.substring(1);
		}

		context.addValue(output);
		context.updateAnalyzedString(numberAnalyzed);
	}
}
