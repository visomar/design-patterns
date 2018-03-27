package designpatterns.observer.test1;

public class AchievementsObserver extends Observer {

	public AchievementsObserver(Subject subject){
		super(subject);
	}

	@Override
	public void update(State state) {
		final String prefix = "Achievement Unlocked: ";

		System.out.println(prefix + state.getMessage());
	}
}
