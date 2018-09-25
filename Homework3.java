//Nandar Soe, Homework3 

//Creating Scanner
import java.util.Scanner;

public class Homework3 {

	/** Main Method */
	public static void main(String[] args) {

		//Creating new Scanner
		Scanner input = new Scanner(System.in);

		//Result of Question 1
		System.out.print("Please input an integer: ");
		int number = input.nextInt();
		System.out.println(primeFactors(number));

		//Results of Question 2
		System.out.print("Please write a sentence: ");
		String sentence = input.next();
		sentence += input.nextLine();
		System.out.println(avgLength(sentence));

		//Results of Question 3
		System.out.print("Please input a word: ");
		String cWords = input.next(); 
		cWords += input.nextLine(); 
		System.out.println(countMyCs(cWords));

		//Results of Question 4
		salesTax();

		//Results of Question 5
		System.out.print("Please input first integer: ");
		int int1 = input.nextInt();
		System.out.print("Please input second integer: ");
		int int2 = input.nextInt();
		printFibonacci(int1, int2);


	}

	/** Question 1, Prime Factors */
	/*This method takes in an integer as an input and stores it in "number" and returns its prime factors*/
	public static int primeFactors(int number) {	

		//Declaration of integer variable "count"
		int count  = 0;											//Initial count is set to "0"

		//This loop checks all the factors of the int "number" starting from 2 
		for (int factor = 2; 2 < number; factor++) {		

			//Loops to check whether the "factor" is a factor of the integer "number"
			while (number%factor == 0) {

				//If statement used to checks whether the "factor" is prime
				//Call in the Method "isPrime(int number)"(Line 86) to check whether the number "factor" is prime
				if (isPrime(factor)) {
					//If the number "factor" is prime, it excecutes the following commands: 

					count++;								//Increases "count" by 1 if number is prime

					//Printing Factors
					if (factor < number)											
						System.out.print(factor + ", ");				//Prints the first to second before the last "factor" 
					else 
						System.out.print(factor + " ");					//Prints the last factor

					number = number/factor;							//Divides "number" by "factor" and stores in "number"
				}
			}		
		} 

		//Returns the number of prime factors the "number" has
		return count; 

	}

	/**This method is part of Question 1*/
	/*This method checks whether the integer "number" is a prime number*/
	public static boolean isPrime(int number) {

		//"number" is set to prime as default
		boolean isPrime = true;

		//Loop to check whether the "number" is prime
		//"number" is checked with the integer "tester"  until "tester" is less than or equal to the sqare root of "number"
		for (int tester = 2; tester <= (int)(Math.sqrt(number)) ; tester++) {

			//Checks whether the "number" is divisible by any integer less than or equal to the sqare root of "number"
			if (number % tester == 0) {

				//if "number" is divisible by an integer less than or equal to the square root of "number", the "number" is not a prime number
				return false; 
			}

		}

		//otherwise returns "number" is a prime number
		return isPrime;
	}

	/**Question 2, Length of Words*/
	/*This method counts the words in the String "s1" and returns the average length of the words*/
	public static double avgLength(String s1) {

		//Declaration of Double Variables
		double count = 0.0; 										//Variable "count" stores the number of words in the string
		double blank = 0.0;										//Variable "blank" stores the number of spaces in the string

		//Loop to check each individual character in the string until the last character in the string
		for (int i=0; i < s1.length() ; i++) {
			
			//If statment used to check whether the charater at "i" on the string is a punctuation
			//Calls upon the method "isPunctuation(char c1)" (Line 146) to check whether the character at "i" is a punctuation
			if (!(isPunctuation(s1.charAt(i)))) {

				//If the character at "i" is not a punctuation:
				count++;									//Word "count" increases by 1
			}

			//Checks whether the character at "i" is a blank space
			if (s1.charAt(i) == ' '){

				//If the character at "i" is a blank space:
				blank++;									//"blank" count increases by 1
			}
			
		}
		
		//Computes the average length of the word by dividing word "count" with the number of "blank" spaces
		double averageLengthOfWord = count/(blank+1.0);							//Then stores the value in the variable "averageLengthOfWord"

		//Returns the double value sorted in the variable "averageLengthOfWord"
		return averageLengthOfWord;

	}

	/**This method is part of Question 2*/
	/*This method checks wheter the character "c1" is a punctuation*/
	public static boolean isPunctuation(char c1) {

		//boolean isPunctuation is set to true by default
		boolean isPunctuation = true;

		//Changes the character into an int value
		int i1 = c1; 

		//Checks whether the character "c1" is between A-Z
		if (i1>=65 && i1<=90) {

			//if it is between A-Z, isPuntuation is set to false
			return false;
		}

		//Checks whether the character "c1" is between a-z
		else if (i1>=97 && i1<=122) {

			//if it is between a-z, isPuntuation is set to false
			return false;
		}

		//Returns "c1" "isPuncation" otherwise
		return isPunctuation; 

	}


	/**Question 3, Counting Cs and Replacing Cs */
	/*This method takes the String "s1" as input and returns the number of 'C' & 'c'. Then it replaces the C/c with dashes and prints the new string*/
	public static int countMyCs(String s1) {

		//Declaration of Variables
		int count = 0; 											//Initial "count" of C/c is set to 0 and stored in the variable "count"

		//Loop to check each individual character in the string
		for (int i1 = 0; i1<s1.length() ; i1++) {

			//Converts the string value at "i1" to char
			char c = s1.charAt(i1);									//and stores it in the variable "c"

			//Checks whether the character at i1 is 'C' or 'c'
			if (s1.charAt(i1) != 'c' && s1.charAt(i1)!= 'C')
				//If the character at i1 is not 'C' or 'c' execute the following command:

				System.out.print(c);								//Print the character

			else {
				//If the character at i1 is 'C' or 'c' execute the following command:

				System.out.print("-");								//Print dash "-" 

				count++;									//"count" of C/c increases by 1
			}
		}

		//Returns the number of 'C 'or 'c' in the string "s1"
		return count;
	}


	/**Question 4, Sales Tax */
	/*This method is used to calculate the "subtotal", "sales tax" at 8%, and "total" based on the user input*/
	/*This method takes in no input and does not return anything*/
	public static void salesTax() {

		//Creating Scanner named "input"
		Scanner input = new Scanner(System.in);

		//Declaration of variables
		String sprice = "$0.00";									//User string input is stored in the variable "sprice"
		double subTotal = 0;										//Sum of the total prices is stored in the double variable "subTotal", with the initial value set to 0.
		double value;											//double value of the String sprice is stored in the double variable "value"
		double tax = 0;											//Total tax based on the subTotal is stored in the double variable "tax", with the initial value set to 0.
		double total = 0; 										//Sum of "tax" and "subTotal" is stored in the double variable "total" with the initial value set to 0.

		//Loop to prompt user to enter the next price until the user enters "X"
		while(sprice.charAt(0) != '\u0058') {	

			System.out.print("Enter price: ");							//Prints "Enter price: "

			sprice = input.next();									//Takes in user input and stores it in the String variable "sprice"

			//If the user input is not "X", excute the following commands: 
			if (sprice.charAt(0) != '\u0058') {			
				sprice = sprice.replace("$", "");						//Removes the '$' character from the string "sprice" 

				value = Double.parseDouble(sprice);						//Converts the String "sprice" into a double and stores in the variable "value"

				subTotal += value;								//Computes the sum of "subTotal" and "value" and stores in the variable "subTotal"

				tax = 0.08*subTotal;								//Computes the "tax" by multiplying "subTotal" with 8% and stores in the variable "tax"

				total = subTotal + tax;								//Computes teh total price by the sum of "subTotal" and "tax" and stores in the variable "total"

			}

			//If the user input is "X", excute the following commands:
			else {
				//Print the results
				System.out.printf("SubTotal :     $%6.2f\n", subTotal); 			//Prints out the total price without tax

				System.out.printf("Tax:           $%6.2f\n", tax);				//Prints out the total tax
				
				System.out.printf("Total:         $%6.2f\n", total);				//Prints of the total price with tax
			}
			
		}
	}


	/** Question 5, Fibonacci sequence */
	/*This method takes in 2 integers "int1" and "int2 and prints the next 10 numbers in a Fibonacci sequence starting with the addition of int1 and int2*/
	/*This method does not return anything*/ 
	public static void printFibonacci(int int1, int int2) {

		//Loop used to produce the next 10 numbers in the sequence
		for (int i = 0 ; i<10 ; i++) {

			//Computes the sum of int1 and in2
			int sum = int1+int2;									//and stores in the variable "sum"							

			//If it is between 1-9th value of the sequence, excute the following command
			if (i<9) {
				System.out.print(sum + ", ");							//Print the "sum" and a comma sign
			}

			//It if is on the 10th value of the squence, excute the following command
			else {
				System.out.print(sum);								//Print the "sum"
			}

			//Changes the literals in the variable "int1" and "int2"
			int1 = int2;										//value of "int2" is now stored in the variable "int1"
			int2 = sum; 										//value of "sum" is now stored in the variable "int2"
		}

		//Prints a blank line
		System.out.println();
	}

}


