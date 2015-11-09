package fr.uvsq.coo.ex3_1;

import org.junit.Test;
import static org.junit.Assert.*;

public class MyUnitTest
{
	@Test
	public void testConcatenate()
	{
		MyUnit myUnit = new MyUnit();
		
		String result = myUnit.concatenate("one", "two");
		
		assertEquals("onetwo", result);
	}
}
