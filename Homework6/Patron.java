// Homework6, Nandar Soe
// This class Patron is meant to work with my version of Book.java, toString() method may not look elegant otherwise. 

// Import the Array Class
import java.util.Arrays;

// Template for a patron to borrow up to 3 books. The patron class models someone who can check books out at a library
public class Patron {

	//Declaration of Variables
	String name; 						// String to store the patron's name
	Book[] listBook = new Book[3];				// Array of objects to store patron's list of book in raw form with null
	Book[] myBooks; 					// Array of objects to store patron's list of book in refined form without null
	int count = 0;						// Counts how many book the patron currently has

	// Purpose: A constructor for the patron's name
	// Input: this constructor takes in a string "name"
	// Output: no output
	public Patron(String name) {

	this.name = name; 					// Stores the parameter variable "name" in class variable "name"

	}

	// Purpose: this method assign a book to a specific patron and mark the book as borrowed
	// Input: this method takes in an object "Book b"
	// Ouput: this method has no output
	public void checkout(Book b) {

		// If the book is already borrowed
		if (b.getBorrowed() == true) {

			// Inform patron book is already checked out
			System.out.println("Error: "+ b.getTitle() + " is already checked out.");

			// End of method
			return;
		}

		// Loop to check if there is space to borrow book in the case that book b is not borrowed
		for (int i = 0 ; i<listBook.length ; i++) {

			// If patron has not exceeded the borrow limit, and the book is not borrowed
			if (listBook[i] == null && b.getBorrowed() == false) {

				listBook[i] = b;		// Put book in patron's record of borrowed books
				b.borrowBook();			// Mark the book as borrowed
				count++;			// Increase count by 1

				//Inform patron book is now checked out
				System.out.println(b.getTitle()+ " has been successfully checked out");
				return;				// End of Method
			}

		}

		// If the patron tries to borrow more than 3 books
		if (count == 3) {

				// Inform patron that borrow limit is exceeded
				System.out.println("Error: Cannot check out more than 3 books. Please return a book.");
			}

	}

	// Purpose: this method unassign a book from a patron and mark a book as not borrowed
	// Input: this method takes in an object "Book b"
	// Output: this method has no output
	public void returnBook(Book b) {

		// Check if the book is borrowed
		if (b.getBorrowed() == true) {

			// Loop to check where the book is stored in patron's "listBook"
			for (int j =0 ; j<listBook.length ; j++) {

				// if nothing is stored in listBook at index j, skip else if statement and continue through loop
				if (listBook[j] == null) {
					continue;
				}

				// if the address of the book b title matches the address of object book stored at the patron's listBook[j]
				else if (b.getTitle() == listBook[j].getTitle()) {

					b.returnBook();		// mark the book as not borrowed
					listBook[j] = null;	// free up the memory at index "j" in "listBook"
					count--;		// Decrease the count by 1

					//Inform patron book is now returned
					System.out.println(b.getTitle() + " has been successfully returned");
					return;			// End of Method
				}

			}

			// if the book was not stored in the patron's list of Book
			System.out.println("Error: "+b.getTitle() + " is checked out by another patron.");

		}

		// If the book is not borrowed
		else {
			System.out.println("Error: "+b.getTitle() + " is not checked out");
		}

	
	}

	// Purpose: this method returns an array of Book object representing the books the patron currently has checked out
	// Input: this method takes in no input
	// Output: this method returns an array of Book objects
	public Book[] getBooks() {

		// Create an array of objects called "myBooks" with the size of "count"
		myBooks = new Book[count]; 

		// Declaration of integer b
		int b = 0;					// Used to keep of the the index on array "myBooks"

		// Loop to store objects in myBooks
		for (int k = 0 ; k<listBook.length ; k++) {

			// If listBook at index "k" is not empty
			if (listBook[k] != null) {	
	
				myBooks[b] = listBook[k];	// Copy the address of listBook[k] to myBooks[b]
				b++;				// Increase b by 1
			}

		}

		// Return the array "myBooks"
		return myBooks;

	}

	// Purpose: this method displays information about the Patron, including name and books checked out.
	// Input: this method takes in no input
	// Output: this method returns a String with the patron's name and books
	public String toString() {

		//Declaration of Variables
		String pname = "Name:      " + name;		// used to store patron's name
		String s1 = "";					// used to store the list of books as string

		// Loop to check all the books in array "myBook"
		for (int k=0; k<myBooks.length ; k++) {

			s1 += myBooks[k].toString();		// Add the information of myBook at index "k" to string s1

		}

		// Return the name of patron and the list of books
		return pname + '\n' + s1;

	}


}
