
public class Book {
	String title;
	String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book pukeNgIna = new Book ("Pride and Prejudice", "Jane Austen");
		System.out.println("Title = " + pukeNgIna.title);
		System.out.println("Author = " + pukeNgIna.author);
	}

}
