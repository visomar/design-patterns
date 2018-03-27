package designpatterns.observer.test1;

public abstract class Observer {

	public Observer(Subject subject){
		subject.attachObserver( this );
	}

	public abstract void update(State state);
}
