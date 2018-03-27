package designpatterns.observer.test1;

public class Test1 {

	public static void main(String[] args) {
		Character protagonist = new Character();

		//Setting the observers
		Observer achievements = new AchievementsObserver( protagonist );

		//In our game, the character shoots for the first time
		protagonist.shoot();

		//Remember ALWAYS to detach observers when they aren't needed anymore to prevent memory leaks
		protagonist.detachAllObservers();
	}
}
