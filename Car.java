
public class Car {
	
	String factory;
	String model;
	int year;
	String colour;
	
	public Car(String factory, String model, int year, String colour) {
		this.factory = factory;
		this.model = model;
		this.year = year;
		this.colour = colour;
	}
	
	public int carAge() {
		int carAge = 2024 - year;
		return carAge;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car("BMW", "X5", 2021, "Black");
			
			System.out.println("Factrory = " + c.factory);
			System.out.println("Model = " + c.model);
			System.out.println("Year = " + c.year);
			System.out.println("Colour = " + c.colour);
			System.out.println("Car Age = " + c.carAge());
			

	}

}
