package test.java;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.java.Calculator;

public class CalculatorTest {

	Calculator calc;	
	@Before
	public void setUp() throws Exception {
		calc = new Calculator();
	}

	@Test
	public void add() {		
		int e = calc.add(12, 6);
		assertEquals(e, 18);
	}

	@Test
	public void sub() {		
		int e = calc.sub(12, 6);
		assertEquals(e, 6);
	}

	@Test
	public void mult() {		
		int e = calc.mult(12, 6);
		assertEquals(e, 72);
	}

	@Test
	public void div() {		
		int e = calc.div(12, 6);
		assertEquals(e, 2);
	}

}
