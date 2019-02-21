package test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalcTest {

	   @Test public void testAdd()
	   {
	      assertTrue("Calc sum incorrect", 5 == Calc.add (2, 3));
	   }
	   
	   @Test public void testSubtract()
	   {
		   assertTrue("Calc subtraction incorrect", 1 == Calc.subtract(5,4));
	   }
	   
	   @Test public void testMultiply()
	   {
		   assertTrue ("Calc multiplication incorrect", 12 == Calc.multiply(3, 4));
	   }
	   
	   @Test public void testDivide()
	   {
		   assertTrue("Calc division incorrect", 2 == Calc.divide(7, 3));
	   }

}
