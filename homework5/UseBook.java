public class UseBook {
	public static void main(String[] args) {

		//test out constructor
		Book b1 = new Book("The Hobbit", "J.R.R. Tolkien");

		//test out accessor methods for title and author
		System.out.println("Title (should be The Hobbit): " + b1.getTitle() );
		System.out.println("Author (should be J.R.R. Tolkien): " + b1.getAuthor() );

		//test out borrowing mechanism
		System.out.println("Is borrowed? (should be false): " + b1.getBorrowed() );
		b1.borrowBook();
		System.out.println("Is borrowed? (should be true): " + b1.getBorrowed() );

		//test out returning mechanism
		b1.returnBook();
		System.out.println("Is borrowed? (should be false): " + b1.getBorrowed() );

		//test toString
		System.out.print(b1);
	}
}
