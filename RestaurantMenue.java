
public class RestaurantMenue {
	
	String itemName;
	double price;
	String category;
	
	public RestaurantMenue (String itemName, double price, String category) {
		this.itemName = itemName;
		this.price = price;
		this.category = category;
	}
	
	public double priceForTwo() {
		double priceForTwo = (double) (price * 2);
		return priceForTwo;
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestaurantMenue rm = new RestaurantMenue("Grilled Salmon", 16.99, "Main");
		RestaurantMenue mr = new RestaurantMenue("Chocolate Cake", 6.49, "Dessert");
		
		System.out.println("Item Name = " + rm.itemName);
		System.out.println("Price = " + rm.price + "$");
		System.out.println("Category = " + rm.category);
		System.out.println("Price for Two Persons = " + rm.priceForTwo() + "$");
		System.out.println("Item Name = " + mr.itemName);
		System.out.println("Price = " + mr.price + "$");
		System.out.println("Category = " + mr.category);
		System.out.println("Price for Two Persons = " + mr.priceForTwo() + "$");
	}

}
