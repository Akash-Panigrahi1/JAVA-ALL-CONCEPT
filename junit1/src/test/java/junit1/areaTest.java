package junit1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class areaTest {
	Shapes shape=new Shapes();
	@Test
	public void testcomputeSquareArea(){
		assertEquals(576, shape.computeSquareArea(24));
	}
	@Test
	public void testcomputeCircleArea() {
		assertEquals(78.5,shape.computeCircleArea(5),0);
	}
}
