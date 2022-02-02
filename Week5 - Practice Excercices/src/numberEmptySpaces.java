import java.util.*;


public class numberEmptySpaces {
	public static void main (String args[]) {
		//1. declare variable 
		String str;
		int space = 0;
		
		//2. initialization of variables (user input)
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter the String");
		str = input.nextLine();
		
		int i= 0;
		while(i<str.length()) {			//while the value of e/ char in string is less than the complete length of the string str
			char ch = str.charAt(i);	//for the char that is located in the position of where 'i' is being explored in the str(while it changes), put that value in ch
			
			if (ch==' ') {				//of all the 'ch's, all the empty-->
				space++;				//locate those empty spaces and count them. space will count how many 
			}
			i++;
		}
		System.out.println("The number of empty spaces in the entered string is: " + space);
	}
}
