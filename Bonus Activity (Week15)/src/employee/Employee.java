package employee;

import java.util.Scanner;

public class Employee {
	String name;
	double hours;
	double totalPay;
	
	final double hourlyRate = 15;
	final double overtimeRate = 16.5;
	
	

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}









	public double getTotalPay() {
		return totalPay;
	}
	public void setTotalPay() {
		if(hours<40) {
			totalPay = hours*hourlyRate;
		}
		else if(hours>40) {
			totalPay = 40*hourlyRate + (hours-40) * overtimeRate;
		}
	}
	


	public Employee(String name, double hours) {
		super();
		this.name = name;
		this.hours = hours;
		setTotalPay();
	}

	

	


}
