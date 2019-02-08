import static org.junit.Assert.*;

import org.junit.Test;

public class enQueueTest {

	@Test
	public void test() {
		BoundedQueue test = new BoundedQueue(10);
		
		assertEquals(true, test.isEmpty());
		assertEquals(false, test.isFull());
		
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
		
		assertEquals(true, test.isFull());
		assertEquals(false,test.isEmpty());
		
		assertEquals("[6, 8, 10, 9, 4, 3, 2, 7, 5, 1]",test.toString());
		
		
		
	}

}
