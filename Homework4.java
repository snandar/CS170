

//Nandar Soe, Homework4,13/06/2016

import java.util.Scanner;

public class Homework4 {

	/*Main Class*/
	public static void main(String[] args) {

	//Creating Scanner named "input"
	Scanner input = new Scanner(System.in);


	//Results of Q1
	System.out.print("Input String: ");
	String str = input.next();
	str += input.nextLine();
	String[] a;
	a = parseString(str);
	for (int i = 0 ; i <a.length; i++)
		System.out.println(a[i]);


	//Results of Question 2
	System.out.print("Input integer: ");
	int i2 = input.nextInt();
	int[] b;
	b = listOfPrimes(i2);
	for (int i = 0 ; i < b.length ; i++ )
		System.out.println(b[i]);


	//Results of Question 3
	int[] testArray = {8,12,15,-4}; 
	int[][] printArray = new int[testArray.length][3];
	printArray = goldbach(testArray); 
	for (int q = 0 ; q<printArray.length; q++) {
		for (int w = 0 ; w<printArray[q].length; w++){
			System.out.print(printArray[q][w]);
		}
	}

	//Result of Question 4
	int[] ccard = {4,9,9,1,6,5,7};
	int ccsum;
	ccsum = luhnChecksum(ccard); 
	System.out.println(ccsum);

	}

	

	/**Question 1, Seperating String into words */
	/*This method takes in a string "s1" as input and seperates them into individual words and returns the list of words as an array*/
	public static String[] parseString(String s1) {

		//Declaration of Variables 
		String indiword = "";									// String used to represent "indi"vidual "word"s
		int blank = 0; 										// Counts the number of spaces seperating each word
		int y = 0;										// Determines the index number in the array "word[]" (Line 75)

		//Adds a space character to the last word in the string "s1"
		s1 = s1 + " ";

		//Loop to count the number of "blank" spaces
		for (int i = 0 ; i<s1.length(); i++) {
			if (s1.charAt(i) == ' ')							// If the character at i is a space character
				blank++;								// Increases "blank" by 1
		}

		//Declaration of String array word used to store the individual words
		String[] word = new String[blank];

		//Loop to seperate String "s1" into individual words
		for (int a = 0 ; a<s1.length(); a++) {

			if (s1.charAt(a) != ' ') {							// If the character at a is not a space character
				indiword += String.valueOf(s1.charAt(a));				// Add the string of the character into "indiwords"
			}

			else {										// If the character at a is a space character

				word[y] = indiword;							// Store the string "indiwords" in the array word at index y
				y++;									// Increases y by 1
				indiword = "";								// Resets indiwords to be empty

			}

		}

		//Returns the list of strings stored in word
		return word;
	}

	/**Question 2, list of Primes less than the integer "i1"*/
	/*This takes in an integer "i1" and returns the list of primes less than or equal to "i1"*/
	public static int[] listOfPrimes(int i1) {				

		//Declaration of Variables
		int count = 0; 										// variable "count" is used to count the number of primes less than or equal to "i1"
		int u = 0 ;										// variable "u" is use to determine the index number in the array integer "myPrimes"

		//Counting the number of primes if "i1" is not prime
		//Calls the method isPrime() to check if "i1" is prime
		if (!isPrime(i1)) {	

			//Continue loop while "i1" is not prime							
			while (!isPrime(i1)) {							

				i1--;									// Decrease "i1" by 1

				//If "i1" is prime
				if (isPrime(i1)) {							
					for (int i = 1 ; i < i1 ;i++)					// Use loop to determine the number of primes less than or equal to "i1"
						if (isPrime(i))						// If "i" is prime 
							count++; 					// Increase "count" by 1
				}

			}
		}

		//Counting the number of primes under i1 if input is prime
		//Calls the method isPrime() to check if "i1" is prime	
		else {
			//If "i1" is prime
			if (isPrime(i1)) {
				for (int i = 0 ; i< i1 ;i++)						// Use loop to determine the number of primes less than or equal to "i1"
					if (isPrime(i))							// If "i" is prime 
						count++; 						// Increase "count" by 1
			}
		}

		//Declaration of the Array myPrimes used to store a list of primes less than or equal to "i1"
		int[] myPrimes = new int[count]; 

		//Loop used to store all the primes numbers less than or equal to "i1"
		//Continue loop while "i1" is greater 1
		while (i1 > 1) {

			//If "i1" is prime
			//Calls the method isPrime() to check if "i1" is prime	
			if (isPrime(i1)) {								
				myPrimes[u] = i1;							// store "i1" in the array "myPrimes" at index "u"
				u++;									// Increase "u" by 1
				i1--;									// Decrease "i1" by 1
				
			}
			
			//If "i1" is not prime
			//Calls the method isPrime() to check if "i1" is prime	
			else {											
				i1--;									// Decrease "i1" by 1
			}

		}

		//Sorting "myPrimes" array to go from smallest to largest
		for (int b=0; b < myPrimes.length ; b++) {
			// Finding the minimum in the array
			int currentMin = myPrimes[b];							// storing the "currentMin" with the int stored in myPrimes at index "b"
			int currentMinIndex = b; 							// storing the "currentMinIndex" with the int "b"

			for ( int c = b+1; c<myPrimes.length; c++) {					// Loop to find the an int smaller than myPrimes[b] in the array
				if (currentMin > myPrimes[c]) {						// if myPrime[b] is larger than myPrime[c]
					currentMin = myPrimes[c];					// store the "currentMin" with the int stored in myPrimes at index "c"
					currentMinIndex = c;						// store the "currentMinIndex" with the int "c"
				}
			}
			
			// Swap myPrimes[i] with myPrime[currentMinIndex] when necessary;
			if (currentMinIndex != b) {							// if the "currentMinIndex" does not equal to "b"
				myPrimes[currentMinIndex] = myPrimes[b];				// set myPrimes[currentMinIndex] to equal myPrime[b]
				myPrimes[b] = currentMin;						// set myPrimes[b] to equal "currentMin"
			}

		}

		//Returns a list of integers less than or equal to "i1"
		return myPrimes;

	}

	/**This method is part of Question 2 && 3*/
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

	/**Question 3, Sum of 2 primes*/
	/*This method is a demonstration of Goldbach Conjecture*/
	/*This method takes in an array of positive integers and returns a 2D integer array consisting of the integer itself and its 2 primes*/
	public static int[][] goldbach(int[] posints) {

		// Declaration of Variables
		int tempint;										// Variable "tempint" is used to store the temporary integer in the array "posints"
		int prime1;										// Integer variable "prime1" is used to store the first prime sum of "tempint"
		int prime2;										// Integer variable "prime2" is used to store the second prime sum of "tempint"

		// Declaration of 2D Array "arrayReturn"
		int[][] arrayReturn = new int[posints.length][3];	// Array used to store the list of "tempint", "prime1", and "prime2"

		// Loop to compute the fist prime and second prime sum of "tempint", and store them in the array "arrayReturn"
		for (int i = 0 ; i<posints.length ; i++) {

			// Declaration of Variable
			prime1 = 0;									// "prime1" is set/reset to 0 
			prime2 = 0;									// "prime2" is set/reset to 0
			tempint = posints[i];								// "tempint" temporarily stores the integer at "i"

			// Computes "prime1" and "prime2" if "tempint" is larger than 2 and if "tempint" is even
			if ((tempint > 2) && (tempint%2 == 0)) {

				// Loop to check all numbers(j) less than "tempint" but greater than 2
				for (int j = 2 ; j<tempint; j++) {

					// If "j" is prime and if "tempint"-"j" is prime and if "tempint" - "j" is greater than 2
					if (isPrime(j) && isPrime(tempint-j) && (tempint-j>=2) ) {

						// Compute "prime1" and "prime2"
						prime1 = tempint - j;					// Store "tempint" - "j" in "prime1"
						prime2 = j;						// Store "j" in "prime2"

						// Determining where to store "tempint" && "prime1" && "prime2"
						arrayReturn[i][0] = tempint;				// Store "tempint" in row "i" at column "1"
						arrayReturn[i][1] = prime1;				// Store "prime1" in row "i" at column "2"
						arrayReturn[i][2] = prime2; 				// Store "prime2" in row "i" at colum "3"
					}
				}
			}

			// Determines what should be stored in arraryReturn[][] in other cases
			else {
				arrayReturn[i][0] = tempint;						// Stores "tempint" in row "i" at colume "1". All other colum is 0.  
			}

		}

		// Returns the 2D array "arrayReturn[][]" with the list of "posints" && "prime1" && "prime2"
		return arrayReturn;

	}

	/**Question 4, Credit Card number Validity*/
	/*This method implements the Luhn-10 checksum algorithm and returns an integer resulting from the algorithum*/
	public static int luhnChecksum(int[] cnumber){

		// Declaration of variables
		int digit;										// temporary storage used to store the "digit" in the arrays
		int product; 										// Storage for the product of "digit" and 1 or 2
		int count = 0;										// "count" the number of integers used to sum in Luhn-10 check sum 
		int checkSum = 0;									// Stores the sum of the integers produced by the Luhn-10 checksum algorithum

		// Loop to find the length of the new array cpNumber[] (Line 268)
		for (int e =0; e<cnumber.length; e++) {

			// Temporarily store the "digit" at "e" in the array cnumber[]
			digit = cnumber[e];

			// If the digit is meant to be multiplied by 2 in the algorithum and the digit is larger than 4
			if (e%2==0 && digit>4){

				// Increase count by 2
				count += 2;
			} 

			// In all other cases
			else {

				// Increase count by 1
				count++;
			}
			
		}

		// Creating a longer array used to store "cnumber"
		// Declaration of array cpNumber[] storing a list of integers with the length of "count"
		int[] cpNumber = new int[count];

		// Copies the integers in the array cnumber[] to cpNumber[]
		System.arraycopy(cnumber, 0, cpNumber, 0, cnumber.length);

		// Loop used to computer the luhn-10 algorithum for all the integers in cpNumber[]
		for (int u =0; u<cpNumber.length; u++) {
			
			// Store the integer in "cpNumber" at "u" in the variable "digit"
			digit = cpNumber[u];
			
			// if cpNumber[even], it is on a even uth number on the array cpNumber
			if (u%2 == 0) {

				// Multiply digit by 2
				product = digit*2;

					//If product is greater than 9
					if (product>9) {
						checkSum += 1;						// Increase "checkSum" by 1
						checkSum += (product-10);				// Increase "checkSum" by (product-10)
					}

					// If product is less than 9
					else {
						checkSum += product;					// Increase "checkSum" by "product"
					}

			}

			// if cpNumber[odd], it is on a odd uth number on the array cpNumber
			else {
					checkSum += digit;						// Increase "checkSum" by "digit"
			}

		}

		// Return the final "checkSum" sum
		return checkSum;
	}

}
