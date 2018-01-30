package designpatterns.interpreter.test2;

public class Context {

	private String roman;
	private String tempRoman; //String analyzed so far
	private int value;

	public Context(String roman){
		this.roman = roman;
		this.tempRoman = roman;
		this.value = 0;
	}

	public void addValue(int value){
		this.value += value;
	}

	public String getRoman(){
		return this.roman;
	}

	public int getValue(){
		return this.value;
	}

	public void updateAnalyzedString(String temp){
		this.tempRoman = temp;
	}

	public String getAnalyzedString(){
		return this.tempRoman;
	}
}
