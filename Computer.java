
public class Computer {
	String brand;
	int ramSize;
	int storageCapacity;
	
	public Computer(String brand, int ramSize, int storageCapacity) {
		this.brand = brand;
		this.ramSize = ramSize;
		this.storageCapacity = storageCapacity;
	}
	
	public static void displaySpecs() {
		Computer s = new Computer("HP" , 8 , 256);
			System.out.println("Brand = " + s.brand);
			System.out.println("RAM Size = " + s.ramSize +" GB");
			System.out.println("Storage Capacity = " + s.storageCapacity + " GB");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer c = new Computer("Dell", 16, 512);
		
		System.out.println("Brand = " + c.brand);
		System.out.println("RAM Size = " + c.ramSize +" GB");
		System.out.println("Storage Capacity = " + c.storageCapacity + " GB");
		displaySpecs();
	}

}
