package designpatterns.chainofresponsibility.test2;

public abstract class Handler {

	private String name;
	private Handler delegate;

	public Handler(String name, Handler delegate){
		this.name = name;
		setDelegate(delegate);
	}

	protected String getName() {
		return name;
	}

	protected void setDelegate(Handler delegate){
		this.delegate = delegate;
	}

	protected Handler getDelegate(){
		return this.delegate;
	}

	public abstract void handleRequest(Request request);

}
