import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WorkplaceTest
{
	
	CSC360E1 A;
	CSC360E1 B;
	CSC360E1 C;
	
	CSC360WP1 wp;
	
	
	
	@BeforeEach
	void setUp() throws Exception
	{
		
		A = new CSC360E1("A", "Contractor", 7, 0);
		B = new CSC360E1("B", "Hourly", 7, 0);
		C = new CSC360E1("C", "Salary", 7, 0);
		
		wp = new CSC360WP1();
	}

	@Test
	void testContractor()
	{
		assertEquals(0, A.p());
		A.hr = 30;
		assertEquals(210, A.p());
		A.hr = 40;
		assertEquals(280, A.p());
		A.hr = 50;
		assertEquals(350, A.p());
		A.pr = 8;
		assertEquals(400, A.p());
		
	}
	
	@Test
	void testHourly()
	{
		assertEquals(0, B.p());
		B.hr = 30;
		assertEquals(210, B.p());
		B.hr = 40;
		assertEquals(280, B.p());
		B.hr = 45;
		assertEquals(332.5, B.p());
	}
	
	@Test
	void testSalary()
	{
		assertEquals(280, C.p());
		C.hr = 5;
		assertEquals(280, C.p());
		C.hr = 50;
		assertEquals(280, C.p());
		C.pr = 10;
		assertEquals(400, C.p());
	}
	
	
	@Test
	void testWorkplace()
	{
		wp.CSC360AEs(A);
		wp.CSC360AEs(B);
		wp.CSC360AEs(C);
		wp.CSC360AEs(A);
		wp.CSC360AEs(B);
		wp.CSC360AEs(C);
		
		A.hr = 30;
		B.hr = 45;
		C.hr = 30;
		
		ArrayList<Double> payments = new ArrayList<Double>();
		payments.add((double)210);
		payments.add((double)332.5);
		payments.add((double)280);
		payments.add((double)210);
		payments.add((double)332.5);
		payments.add((double)280);
		
		assertEquals(payments, wp.iterate(0));
		
		assertEquals(210, wp.CSC360RP(A));
		assertEquals(332.5, wp.CSC360RP(B));
		assertEquals(280, wp.CSC360RP(C));
		
	}

}
