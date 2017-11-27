package designpatterns.singleton.test1;

public class Test1 {

	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();

		if(singleton1 == singleton2){
			System.out.println("You've got the same instance!");
		}
		else{
			System.out.println("Different singleton instances");
		}
	}

}
