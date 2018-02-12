package designpatterns.flyweight.test1;

public class Test1 {

	public static void main(String[] args) {
		InventorySystem ims = new InventorySystem();

		ims.takeOrder( "BQ Aquaris M5", 7238);
		ims.takeOrder( "Nokia 5220", 4563);
		ims.takeOrder( "LG Nexus 4 E960", 4531);
		ims.takeOrder( "LG Nexus 4 E960", 4539);
		ims.takeOrder( "BQ Aquaris M5", 7833);
		ims.takeOrder( "Nokia 5220", 5466);
		ims.takeOrder( "BQ Aquaris M5", 4221);
		ims.takeOrder( "LG Nexus 4 E960", 8732);
		ims.takeOrder( "BQ Aquaris M5", 980);
		ims.takeOrder( "Nokia 5220", 2133);
		ims.takeOrder( "LG Nexus 4 E960", 8974);
		ims.takeOrder( "BQ Aquaris M5", 6202);

		ims.process();

		System.out.println( ims.report() );
	}

}
