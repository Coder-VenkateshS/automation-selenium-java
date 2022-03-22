package junittesting;
import static org.junit.Assert.assertEquals;

import org.junit.*;

public class TestMathsLogic {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
		System.out.println("Before Class");
	}
	
	@Before
	public void setUp() throws Exception{
		System.out.println("Before");
	}
	
	@Test
	public void testFindMax() {
		assertEquals(6,JunitExample.findMax(new int[] {1,2,5,4,6}));
		assertEquals(-1,JunitExample.findMax(new int[] {-12,-1,-4,-8}));
	}
	
	@Test
	public void testCube() {
		System.out.println("Cube Testing");
		assertEquals(27,MathsLogic.cube(3));
		assertEquals(8,MathsLogic.cube(2));
	}
	
	@Test
	public void testReverseWord() {
		System.out.println("Reverse work");
		assertEquals("ym eman si taknev ",MathsLogic.reverseWord("my name is venkat"));
	}
	
	@After
	public void tearDown() throws Exception{
		System.out.println("after");
	}
	@AfterClass
	public static void tearDownAfter() throws Exception{
		System.out.println("After Class");
	}
	
	
	
}
