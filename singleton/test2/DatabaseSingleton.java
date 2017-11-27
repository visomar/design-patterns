package designpatterns.singleton.test2;

public class DatabaseSingleton {

	private DatabaseSingleton(){ }

	// You can find different approaches for achieving thread safety: synchronized block inside getInstance, synchronizing the method itself, or maybe just
	// instantiating the object when declaring it (you can't lazy load it with this).
	// My favourite one is with inner static classes:

	public static DatabaseSingleton getInstance() {
		return Holder.INSTANCE;
	}

	// This static class will hold the instance of the singleton, and will not be initialized until the first time getInstance gets called
	// This is called "Initialization-on-demand holder (IODH)"
	private static class Holder{
		private static final DatabaseSingleton INSTANCE = new DatabaseSingleton();
	}
}
