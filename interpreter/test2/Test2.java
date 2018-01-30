package designpatterns.interpreter.test2;

import java.util.ArrayList;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		Context roman1 = new Context( "MCMXCIX" );

		List<Expression> interpreter = Test2.buildInterpreterTree();

		for(Expression exp : interpreter){
			exp.interpret(roman1);
		}

		System.out.println( roman1.getRoman() + " value is " + roman1.getValue() );
	}

	public static List<Expression> buildInterpreterTree(){
		List<Expression> list = new ArrayList<>();
		list.add( new ThousandExpression() );
		list.add( new HundredExpression() );
		list.add( new TenExpression() );
		list.add( new OneExpression() );

		return list;
	}
}
