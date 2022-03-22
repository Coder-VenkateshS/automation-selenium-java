package junittesting;

import static org.junit.Assert.*;

import org.junit.Test;
// Import junit 4 jar and hamcrest core jar file to your build path
public class TestLogic {

	@Test
	public void testFindMax() {
		assertEquals(6,JunitExample.findMax(new int[] {1,2,5,4,6}));
		assertEquals(-1,JunitExample.findMax(new int[] {-12,-1,-4,-8}));
	}
}
