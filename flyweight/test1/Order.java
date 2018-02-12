package designpatterns.flyweight.test1;

public class Order {
	private final int orderNumber;
	private final Item item;

	public Order(int orderNumber, Item item){
		this.orderNumber = orderNumber;
		this.item = item;
	}

	public void processOrder(){
		System.out.printf("Processing order number [%d] for Item [%s]%n", orderNumber, item.toString());
	}
}
