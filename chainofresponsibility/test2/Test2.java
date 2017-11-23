package designpatterns.chainofresponsibility.test2;

public class Test2 {

	public static void main(String[] args) {
		// This test is for the use case of some Budget needed to get managed by a person with a responsible position
		// The request comes with an amount, which is the budget itself, and maybe other fields, like for example, a description
		// The handlers are instances of classes defining those positions inside the business
		// A budget of more than 30k is only managed by the CEO, whereas a budget of equal or more than 5k is managed by the department director, and
		// with budgets of less than 5k, the Project Manager can be the accountant of approving or rejecting it.

		// Each instance defines a delegate for managing requests
		Handler lewis = new ProjectManager("Lewis", null);
		Handler connor = new DepartmentDirector("Connor", lewis);
		Handler mary = new CEO("Mary", connor);
		
		Request request1 = new Request(200, "Buying a new NAS");
		Request request2 = new Request(8000, "Buying 3 iPhones");
		Request request3 = new Request(50000, "Acquiring a new wing for the office");
		
		mary.handleRequest(request3);
		mary.handleRequest(request2);
		mary.handleRequest(request1);
	}

}
