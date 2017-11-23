package designpatterns.chainofresponsibility.test2;

public class CEO extends Handler {

	public CEO(String name, Handler delegate) {
		super(name, delegate);
	}

	@Override
	public void handleRequest(Request request) {
		int budget = request.getBudget();
		if(budget > 30000){
			System.out.println("CEO [" + this.getName() + "] has managed this request");
			String approval;
			if(Math.random() >= 0.5){
				approval = "Approved";
			}
			else{
				approval = "Rejected";
			}
				System.out.println("  " + request.getDescription() + " - " + approval);
		}
		else{
			if(getDelegate() != null){
				getDelegate().handleRequest(request);
			}
		}
	}

}
