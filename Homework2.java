/*
THIS CODE WAS MY OWN WORK , IT WAS WRITTEN WITHOUT CONSULTING
CODE WRITTEN BY OTHER STUDENTS . NANDAR SOE
*/

// Nandar Soe, Homework2
import java.util.Scanner;

	public class Homework2 {

		/*This program contains 6 methods*/

		//Main method
		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);

			//Results of Question 1
			initial();

			//Result of Question 2 
			System.out.print("Please input a word with a maximum of 4 characters: ");
			String s2 = input.next();
			System.out.print("Please input an integer: "); 
			int i2 = input.nextInt(); 
			System.out.println(asciiCipher(s2, i2));

			//Result of Question 3
			System.out.print("Furlong: ");
			int f1 = input.nextInt();
			System.out.println(furlongsToMeters(f1));

			//Results of Question 4
			System.out.print("Please input amount in dollars: $");
			int dollars = input.nextInt();
			System.out.println(makeChange(dollars));

			//Results of Question 5
			System.out.print("Please input the number of magic kitten seeds: ");
			int seed1 = input.nextInt();
			System.out.println(magicKittenSeeds(seed1));

			//Results of Question 6 
			System.out.print("Please input a savings amount: $");
			double sav1 = input.nextDouble();
			System.out.print("Please input the interest rate in percentage: ");
			int per1 = input.nextInt();
			System.out.println(futureValue(sav1, per1));
		}

		//Question 1, Initials 
		
		/*This method is used to print out the large initial N*/
		public static void initial() {

			System.out.println("********             ****");
			System.out.println("**** ****            ****");
			System.out.println("****  ****           ****");
			System.out.println("****   ****          ****");
			System.out.println("****    ****         ****");
			System.out.println("****     ****        ****");
			System.out.println("****      ****       ****");
			System.out.println("****       ****      ****");
			System.out.println("****        ****     ****");
			System.out.println("****         ****    ****");
			System.out.println("****          ****   ****");
			System.out.println("****           ****  ****");
			System.out.println("****            **** ****");
			System.out.println("****             ********");

		}

		//Question 2, Caesar Cipher 

		/*This method takes in a string input returns an encrypted string where the words have been shifted by the integer i1*/
		public static String asciiCipher(String s1, int i1) {

			/*Declaration of Variables*/
			/*o1 = character value of first string input, o2 = character value of second string input, o3 = character value of third string input, o4 = character value of fourth string input */
			/*oi1 = integer value of o1, oi2 = integer value of o2, oi3 = integer value of o3, oi4 = integer value of o4*/
			/*ci1 = character value of oi1+i1, ci2 = character value of oi2+i1, ci3 = character value of oi3+i1, ci4 = character value of oi4+i1*/
			/*si1 = string value of ci1, si2 = string value of ci2, si3 = string value of ci3, si4 = string value of ci4*/

			char o1, o2, o3, o4, ci1, ci2, ci3, ci4; 
			int oi1, oi2, oi3, oi4;
			String si1,si2,si3,si4;

			//Compute the new string word if the length of string is 1
			if (s1.length() == 1) {

				//Convert the first string letter into character
				o1 = s1.charAt(0);			//and store it in the variable "o1"

				//Convert the character "o1" into integer
				oi1 = (int)o1;				//and store it in the variable "oi1"

				//Compute the sum of the integers "oi1" and "i1"
				oi1 += i1;					//and store it in the variable "oi1"

				//Compute the character variable of integer "oi1"
				ci1 = (char)(oi1);			//and store it in the variable "ci1"

				//Compute the string value of character "si1"
				si1 = String.valueOf(ci1); 	// and store it in the variable "si1"

				//Returns the string "si1"
				return si1;
			}
			
			//Compute the new string word if the length of string is 2
			else if (s1.length() == 2) {

				//Converts the first and second letter in string into character 
				o1 = s1.charAt(0); 			// and stores first letter in the variable "o1"
				o2 = s1.charAt(1); 			// and stores second letter in the variable "o2"

				//Converts the character "o1" and "o2" into integer
				oi1 = (int)o1;				// and stores integer value of "o1" in the variable "oi1"
				oi2 = (int)o2;				// and stores integer value of "o2" in the variable "oi2"

				//Sums "oi1" and "oi2" with "i1"
				oi1 += i1;
				oi2 += i1;

				//Converts the integers "oi1" and "oi2" into characters
				ci1 = (char)(oi1);			// and stores character value of "oi1" in the variable "ci1"
				ci2 = (char)(oi2);			// and stores character value of "oi2" in the variable "ci2"

				//Converts the characters "ci1" and "ci2" into string
				si1 = String.valueOf(ci1);	// and stores the string value of "ci1" in the variable "si1"
				si2 = String.valueOf(ci2);	// and stores the stirng value of "ci2" in the variable "si2"

				//Returns the string si1,si2
				return si1+si2;
			}

			//Compute the new string word if the length of string is 3
			else if (s1.length() == 3) {

				//Converts the first, second, and third letter in string into character 
				o1 = s1.charAt(0);			// and stores first letter in the variable "o1"
				o2 = s1.charAt(1);			// and stores first letter in the variable "o2"
				o3 = s1.charAt(2);			// and stores first letter in the variable "o3"

				//Converts the character "o1", "o2", and "o3" into integer
				oi1 = (int)o1;				// and stores integer value of "o1" in the variable "oi1"
				oi2 = (int)o2;				// and stores integer value of "o2" in the variable "oi2"
				oi3 = (int)o3;				// and stores integer value of "o3" in the variable "oi3"

				//Sums the variable "oi1", "oi2", and "oi3" with "i1"
				oi1 += i1;
				oi2 += i1;
				oi3 += i1;

				//Converts the integers "oi1", "oi2", and "oi3" into characters
				ci1 = (char)(oi1);			// and stores character value of "oi1" in the variable "ci1"
				ci2 = (char)(oi2);			// and stores character value of "oi2" in the variable "ci2"
				ci3 = (char)(oi3);			// and stores character value of "oi3" in the variable "ci3"

				//Converts the characters "ci1", "ci2", and "ci3" into string
				si1 = String.valueOf(ci1);	// and stores the string value of "ci1" in the variable "si1"
				si2 = String.valueOf(ci2);	// and stores the string value of "ci2" in the variable "si2"
				si3 = String.valueOf(ci3);	// and stores the string value of "ci3" in the variable "si3"

				//Returns the string si1,si2, si3
				return si1+si2+si3;

			}

			//Compute the new string word if the length of string is 4
			else if (s1.length() == 4) {

				//Converts the first, second, third, and fourth letter in string into character 
				o1 = s1.charAt(0);			// and stores first letter in the variable "o1"
				o2 = s1.charAt(1);			// and stores first letter in the variable "o2"
				o3 = s1.charAt(2);			// and stores first letter in the variable "o3"
				o4 = s1.charAt(3);			// and stores first letter in the variable "o4"
				
				//Converts the character "o1", "o2", and "o3" into integer
				oi1 = (int)o1;				// and stores integer value of "o1" in the variable "oi1"
				oi2 = (int)o2;				// and stores integer value of "o2" in the variable "oi2"
				oi3 = (int)o3;				// and stores integer value of "o3" in the variable "oi3"
				oi4 = (int)o4;				// and stores integer value of "o4" in the variable "oi4"

				//Sums the variable "oi1", "oi2", "oi3", and "oi4" with "i1"
				oi1 += i1;		
				oi2 += i1;
				oi3 += i1;
				oi4 += i1; 

				//Converts the integers "oi1", "oi2", and "oi3" into characters
				ci1 = (char)(oi1);			// and stores character value of "oi1" in the variable "ci1"	
				ci2 = (char)(oi2);			// and stores character value of "oi2" in the variable "ci2"
				ci3 = (char)(oi3);			// and stores character value of "oi3" in the variable "ci3"
				ci4 = (char)(oi4);			// and stores character value of "oi4" in the variable "ci4"

				//Converts the characters "ci1", "ci2", "ci3", and "ci4" into string
				si1 = String.valueOf(ci1);	// and stores the string value of "ci1" in the variable "si1"
				si2 = String.valueOf(ci2);	// and stores the string value of "ci2" in the variable "si2"
				si3 = String.valueOf(ci3);	// and stores the string value of "ci3" in the variable "si3"
				si4 = String.valueOf(ci4);	// and stores the string value of "ci4" in the variable "si4"

				//Returns the string si1,si2,si3,si4
				return si1+si2+si3+si4;

			}

			else {
				//Returns an error message if string is longer than 4 characters
				return "Error: character is longer than 4 characters!";
			}

		}

		//Question 3, Furlong (Meters) 

		/*This method takes in a furlong integer input and converts into meters*/
		public static double furlongsToMeters(int fl1) { 

			//Multiplies the integer "fl1" with 201.168
			double met = fl1 * 201.168;		// and stores it in the variable "met"

			//Returns the value met
			return met; 
		}

		//Question 4, Monopoly 

		/*This method takes in an integer d1 and prints the optimal number of monopoly change needed for the banker*/
		public static String makeChange(int d1) {

			//Divides d1 with 500 
			int dol500 = d1 / 500 ;			// and stores it in the variable "dol500"
			
			//Computes the remainder value of d1 after dividing it with 500
			d1 = d1 % 500 ;					

			//Divides d1 with 100
			int dol100 = d1 / 100 ; 		// and stores it in the variable "dol100"
			
			//Computes the reaminder value of d1 after dividing it with 100
			d1 = d1 % 100 ; 

			//Divides d1 with 50
			int dol50 = d1 / 50 ; 			// and stores it in the variable "dol50"

			//Computes the remainder value of d1 after dividing it with 50
			d1 = d1 % 50 ; 	

			//Divides d1 with 20
			int dol20 = d1 / 20 ; 			// and stores it in the variable "dol20"

			//Computes the remainder value of d1 after dividing it with 20
			d1 = d1 % 20 ;					

			//Divides d1 with 10
			int dol10 = d1 / 10 ;			// and stores it in the variable "dol10"

			//Computes the remainder value of d1 after dividing it with 10
			d1 = d1 % 10 ; 

			//Divides d1 with 5
			int dol5 = d1 / 5 ; 			// and stores it in the variable "dol5"

			//Computes the remainder value fo d1 after dividing it with 5
			d1 = d1 % 5 ; 					

			//Divides d1 with 1
			int dol1 = d1 / 1 ; 			// and stores it in the variable "dol1"

			//Computes the remainder value of d1 after dividing it with 1
			d1 = d1 % 1 ; 

			//Returns the string with the optimum number of monopoly change
			return dol500 + " ($500) " + dol100 + " ($100) "+ dol50 + " ($50) " + dol20 + " ($20) " + dol10 +" ($10) "+ dol5 +" ($5) "+ dol1 + " ($1)";
		}

		//Question 5, Magical Seed 
		/*This method accepts an integer value of magic Kitten Seeds(m1) and prints out the maximum and minimum amount of kittens you could get*/
		public static String magicKittenSeeds(int m1) {

			//Computes the minimum number of Magic Kitten Seeds 
			//Multiplies m1 with 3
			int min = m1*3 ; 			// and stores it in the variable "min"

			//Computes the maximum number of Magic Kitten Seeds
			//Multiplies m1 with 7
			int max = m1*7 ; 			// and stores it in the variable "max"

			//Returns the string that contains the max and min number of kitten seeds you can get
			return "You can get between " +min+ " and " +max+ " kittens with " +m1+ " seeds." ;

		}

		//Question 6, Interest Per Month 
		/*This method takes a double amount and a interger percentage interest and returns the value after 4 months */
		public static double futureValue(double v1, int p1) {

			//Computes the percentage interest
			double p2 = (p1/100.0)+1; 	// and stores it in the variable "p2"

			//Computes the new value of v1 after 4 months
			v1 = v1*Math.pow(p2, 4);	 

			//Rounds the value of the new v1 into 2 decimal places
			v1 = Math.round(v1*100.0)/100.0;

			//Returns the value of the saving after 4 months with 2 decimal places
			return v1;

		}
	
	}
