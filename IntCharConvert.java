import java.util.Scanner;

	/* This program allows you to change a character into an integer and an integer into a character */

	public class IntCharConvert 	{
		public static void main(String [] args) {

			//  declaration of variables, i1 = inputed integer, c1 = inputed character
			int i1;
			char c1;

			//  create a Scanner
			Scanner input = new Scanner(System.in); 

			//  Enter Integer
			System.out.print("Please input an integer : ");
			i1 = input.nextInt();	//  Read in input from terminal 
						//  and stores it in the variable "i1"

			//  Enter Character
			System.out.print("Please input a character : ");
			c1 = input.next().charAt(0);	//  Read in input from terminal 
							//  and stores it in the variable "c1"

			//  Compute the character variable of integer "i1" 
			char c2 = (char)(i1);
				//  and stores it in the variable "c2".

			//  Compute the integer variable of character "c1" 
			int i2 = c1;
				//  and stores it in the variable "i2". 

			//  print out the result
			System.out.println("The character value of " + i1 + " is : " +c2 );
			System.out.println("The integer value of " + c1 + " is : " +i2 );
		}
	}
