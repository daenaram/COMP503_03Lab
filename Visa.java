
public class Visa {
	String name;
	int kind;
	
	public Visa(String name, int kind) {
		this.name = name;
		this.kind = kind;
	}
	
	public String description() {
		String description;
		if (kind == 1) {
			description = "Permanent";
		}
		
		if (kind == 2) {
			description = "Temporary";
		}
		
		else {
			description = "Other";
		}
		
		return description;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Visa v = new Visa("John", 1);
		
		System.out.println("name = " + v.name);
		System.out.println("kind = " + v.kind);
		System.out.println("description = " + v.description());
	}

}
