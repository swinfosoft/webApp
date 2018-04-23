package demo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Dummy {

	Adder adder;
	@Before
	public void setup()
	{
		adder=new Adder();
	}
	@Test
	public void test() {
		assertEquals(5,adder.add(2, 3));
		assertEquals(-4, adder.add(-2, -2), -4);
		
	}

}
