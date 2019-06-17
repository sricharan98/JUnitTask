package EPAMTASK.epamtaskpackage;

import static org.junit.Assert.*;

//import org.junit.Before;
import org.junit.Test;

public class CheckTheFirstTwoCharsOfStringTest {

	/*
	 * Check For character 'A' in First Two Characters in String
	 * 1)ABCD - BCD --done
	 * 2)AACD - CD --done
	 * 3)BACD - BCD --done
	 * 4)BBAA - BBAA --done
	 * 5)AABAA - BAA --done
	 */
	CheckTheFirstTwoCharsOfString chkstr;
	void setup()
	{
		chkstr=new CheckTheFirstTwoCharsOfString();
	}
	@Test
	public void test1() {
		setup();
		assertEquals("BCD",chkstr.verify("ABCD"));
	}
	@Test
	public void test2() {
		setup();
		assertEquals("CD",chkstr.verify("AACD"));
	}
	@Test
	public void test3() {
		setup();
		assertEquals("BCD",chkstr.verify("BACD"));
	}
	@Test
	public void test4() {
		setup();
		assertEquals("BBAA",chkstr.verify("BBAA"));
	}
	@Test
	public void test5() {
		setup();
		assertEquals("BAA",chkstr.verify("AABAA"));
	}
	

}
