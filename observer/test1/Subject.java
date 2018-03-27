package designpatterns.observer.test1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Subject {
	private List<Observer> observers = new ArrayList<>();

	public void attachObserver(Observer observer){
		this.observers.add( observer );
	}

	public void detachObserver(Observer observer){
		this.observers.remove( observer );
	}

	public void detachAllObservers(){
		Iterator<Observer> iter = observers.iterator();
		while(iter.hasNext()){
			iter.next();
			iter.remove();
		}
	}

	public void notifyObservers(State state){
		for(Observer observer : observers){
			observer.update( state );
		}
	}
}
