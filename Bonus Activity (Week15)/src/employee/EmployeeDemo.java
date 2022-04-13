package employee;

import java.util.Scanner;

public class EmployeeDemo {
	public static void main (String [] args) {
				
		
		Scanner input = new Scanner(System.in);
		
		
		
		System.out.println("Enter how many hours you worked");
		double hours = input.nextDouble();

		System.out.println("Enter your name");
		String name = input.next();
	
		

		Employee obj = new Employee(name, hours);
		
		System.out.println("Total Pay for " + obj.name + " is: " + obj.totalPay);

	}
	
	
}
