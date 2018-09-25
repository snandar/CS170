/**This class is a template for book objects*/
public class Book {
	
	//Declaration of Variables
	private String title1;						//Variable to store the title of the book
	private String author1;						//Variable to store the author of the book
	private boolean borrowed;					//Variable to know if a book is borrowed or not

	// Purpose: to store the title of the book and the author of the book
	// The constructor that takes two String arguments as input: the first is the title and the second is the author
	public Book(String title2, String author2) {
		title1 = title2;					
		author1 = author2; 					

	}

	// Purpose: Marks the book as borrowed
	// Takes no input
	// Returns no output
	public void borrowBook() {

		borrowed = true;		

	}

	// Purpose: Marks the book as not borrowed
	// Takes no input
	// Returns no output
	public void returnBook() {

		borrowed = false; 

	}

	// Purpose: to return the title of the book
	// There is no input
	// Returns a string with the title of the book
	public String getTitle(){

		return title1; 

	}

	// Purpose: to return the author of the Book
	// There is no input
	// Returns the string with the author of the book
	public String getAuthor() {

		return author1; 

	}

	// Purpose: to know whether the book is borrowed or not
	// There is no input
	// Returns true/false to wheter the book is borrowed or not 
	public boolean getBorrowed() {

		return borrowed;

	}

	// Purpose: to display the book's title, author and borrowed status
	// There is no input
	// Returns a string with book's author, title, and borrowed status
	public String toString() {

	String s1 = "Title:     " + title1 + '\n' + "Author:    " + author1 + '\n' + "Borrowed?: " + borrowed + '\n';

		return s1; 

	}

}
