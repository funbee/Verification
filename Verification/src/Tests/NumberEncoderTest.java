/**
 * 
 */
package Tests;

import static org.junit.Assert.*;

import org.junit.*;

import code.NumberEncoder;

/**
 * @author Oded
 *
 */
public class NumberEncoderTest {

	
	private NumberEncoder classTested;
	
	@Before
	public void set(){
		classTested = new NumberEncoder("4518902316");
	}
	
	
	@Test
	public void test1() {
		String inNum ="1234567890";
		char[] forTest = inNum.toCharArray();
		
		assertTrue(" does not give expected result", classTested.isNumeric(forTest));
	}
	
	@Test
	public void test2() {
		String inNum ="5867098567";
		
		assertEquals(" does not give expected result", classTested.decode(classTested.encode(inNum)), inNum);
	}

}
