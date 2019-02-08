import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class toStringTest {

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
		
		assertEquals("[6, 8, 10, 9, 4, 3, 2, 7, 5, 1]",test.toString());
	}

}
