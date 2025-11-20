package junit1;

import static org.junit.Assert.*;
import org.junit.Test;


public class test {

	@Test
	public void test() {
//		Calc c = new Calc();
//		int actual=c.divide(12,5);
//		int exceptation=2;
//		assertEquals(actual,exceptation);
		Reverse r=new Reverse();
		String exceptation1="hsakA";
		assertEquals(r.reverse("Akash"),exceptation1);
		
	}
	@Test
	public void testReverse_multiple(){
		Reverse r = new Reverse();
		assertEquals("em si hsakA",r.reverse("Akash is me"));
	}

}
