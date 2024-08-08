
public class Rectangle {
	double width;
	double length;
	
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	public double area() {
		double area = width * length;
		return area;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle(50.5, 25.7);
		
		System.out.println("width = " + r.width);
		System.out.println("length = " + r.length);
		System.out.println("area = " + r.area());
	}

}
