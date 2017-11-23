package designpatterns.chainofresponsibility.test2;

public class Request {
	private int budget;
	private String description;
	
	public Request(int budget, String description){
		this.budget = budget;
		this.description = description;
	}

	public int getBudget() {
		return budget;
	}

	public String getDescription() {
		return description;
	}
}
