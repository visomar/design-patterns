package designpatterns.singleton.test2;

public class Test2 {

	public static void main(String[] args) {
		// In this case, we will make the singleton class thread safe

		// Our singleton will manage the same instance for accessing the database
		DatabaseSingleton instance1 = DatabaseSingleton.getInstance();
		DatabaseSingleton instance2 = DatabaseSingleton.getInstance();
		
		System.out.println(instance1);
		System.out.println(instance2);
	}

}
