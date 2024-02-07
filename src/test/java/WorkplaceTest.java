import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WorkplaceTest
{
	Payment con;
	Payment hour;
	Payment sal;
	
	Employee A;
	Employee B;
	Employee C;
	
	Workplace wp;
	
	
	
	@BeforeEach
	void setUp() throws Exception
	{
		con = new Contractor();
		hour = new HourlyEmployee();
		sal = new SalaryEmployee();
		
		A = new Employee("A", con, 7, 0);
		B = new Employee("B", hour, 7, 0);
		C = new Employee("C", sal, 7, 0);
		
		wp = new Workplace();
	}

	@Test
	void testContractor()
	{
		assertEquals(0, A.getPay());
		A.hours = 30;
		assertEquals(210, A.getPay());
		A.hours = 40;
		assertEquals(280, A.getPay());
		A.hours = 50;
		assertEquals(350, A.getPay());
		A.payRate = 8;
		assertEquals(400, A.getPay());
		
	}
	
	@Test
	void testHourly()
	{
		assertEquals(0, B.getPay());
		B.hours = 30;
		assertEquals(210, B.getPay());
		B.hours = 40;
		assertEquals(280, B.getPay());
		B.hours = 45;
		assertEquals(332.5, B.getPay());
	}
	
	@Test
	void testSalary()
	{
		assertEquals(280, C.getPay());
		C.hours = 5;
		assertEquals(280, C.getPay());
		C.hours = 50;
		assertEquals(280, C.getPay());
		C.payRate = 10;
		assertEquals(400, C.getPay());
	}
	
	@Test
	void testWorkplace()
	{
		wp.addEmployee(A);
		wp.addEmployee(B);
		wp.addEmployee(C);
		
		A.hours = 30;
		B.hours = 45;
		C.hours = 30;
		
		ArrayList<Double> payments = new ArrayList<Double>();
		payments.add((double)210);
		payments.add((double)332.5);
		payments.add((double)280);
		
		assertEquals(payments, wp.getPay());
		
		assertEquals(210, wp.getPay(A));
		assertEquals(332.5, wp.getPay(B));
		assertEquals(280, wp.getPay(C));
		
	}

}
