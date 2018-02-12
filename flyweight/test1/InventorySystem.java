package designpatterns.flyweight.test1;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventorySystem {
	private final Catalog catalog = new Catalog();
	private final List<Order> orders = new CopyOnWriteArrayList<>();

	public void takeOrder(String itemName, int orderNumber){
		Item item = catalog.lookup( itemName );
		Order order = new Order( orderNumber, item );
		orders.add( order );
	}

	public void process(){
		for(Order order : this.orders){
			order.processOrder();
			orders.remove( order );
		}
	}

	public String report(){
		return "\nItem objects made: " + catalog.totalItemsMade();
	}
}
