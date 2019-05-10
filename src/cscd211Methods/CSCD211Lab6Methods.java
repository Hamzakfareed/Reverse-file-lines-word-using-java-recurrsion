package cscd211Methods;

import java.util.Scanner;

public class CSCD211Lab6Methods {

	public static int menu(final Scanner kb) {
		
		System.out.println("Please choose between the follwoing options");
		System.out.println("1: Reverse word");
		System.out.println("2: Reverse File");
		System.out.println("3: Reverse Both file and words");
		int index = kb.nextInt();
	
		return index;
	}
	//take string input from user
	public static String readString(final Scanner kb) {
		System.out.println("Please enter a word");
		String line = kb.next();
		return line;
	}

	
	//this method reverseFile lines order
	public static void reverseFile(final Scanner br) {
		try {
			//if br hasNext value , its we have next line in file
			if (br.hasNext()) {
				// line will be equal to br.nextLine 
				String line = br.nextLine();
				//pass br to reverseFile again
				reverseFile(br);
				//print line 
				System.out.println(line);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// this method reverse string characters
	public static String reverseString(final String str) {
		if (str.isEmpty())
			return str;
		// Calling Function Recursively
		return reverseString(str.substring(1)) + str.charAt(0);
	}

	// thie method do both file changinf file lines order and words character orders
	public static void doBoth(final Scanner br) {
		
		// declare empty line 
		String line = "";
		try {
			//if br has next line in file 
			if (br.hasNext()) {
				//make line equal to nextLine in file
				 line = br.nextLine();
				 //calling doBoth recursively
				doBoth(br);
				
				//print the reverse of string 
				System.out.println(reverseString(line));
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
