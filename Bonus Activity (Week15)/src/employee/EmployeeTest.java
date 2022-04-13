package employee;

import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeTest {

	@Test
	void testTotalPay() {
		Employee emp = new Employee("Juan", 50);
		assertEquals(765, emp.getTotalPay(),1);
		
		Employee emp1 = new Employee("Juan", 10);
		assertEquals(150, emp1.getTotalPay(),1);
	}
	
	

}
