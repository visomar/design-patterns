package designpatterns.observer.test1;

public class Character extends Subject {

	public void shoot(){
		notifyObservers( new State("My character shot for the first time!") );
	}
}
