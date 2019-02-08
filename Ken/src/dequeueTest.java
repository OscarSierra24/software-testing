import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class dequeueTest {

	@Test
	void test() {
		BoundedQueue test = new BoundedQueue(10);
		
		test.enQueue(6);
		test.enQueue(8);
		test.enQueue(10);
		test.enQueue(9);
		test.enQueue(4);
		test.enQueue(3);
		test.enQueue(2);
		test.enQueue(7);
		test.enQueue(5);
		test.enQueue(1);
		
		int pop = (int) test.deQueue();
		
		assertEquals(6,pop);
		
		pop = (int) test.deQueue();
		
		assertEquals(8,pop);
		
		pop = (int) test.deQueue();
		
		assertEquals(10,pop);
		
		pop = (int) test.deQueue();
		
		assertEquals(9,pop);
		
		pop = (int) test.deQueue();
		
		assertEquals(4,pop);
		
		pop = (int) test.deQueue();
		
		assertEquals(3,pop);
		
		pop = (int) test.deQueue();
		
		assertEquals(2,pop);
		
		pop = (int) test.deQueue();
		
		assertEquals(7,pop);
		
		pop = (int) test.deQueue();
		
		assertEquals(5,pop);
		
		pop = (int) test.deQueue();
		
		assertEquals(1,pop);
		
		
		
	}

}
