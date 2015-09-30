package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSudokuVerifier {

	@Test
	public void test_zerovalue() {
		SudokuVerifier s = new SudokuVerifier();
		assertEquals(-1, s.verify("0"));
	}
	
	@Test
	public void test_validValue() {
		SudokuVerifier s = new SudokuVerifier();
		String testValue = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
		assertEquals(0, s.verify(testValue));
	}
	
	@Test
	public void test_invalidValue() {
		SudokuVerifier s = new SudokuVerifier();
		String testValue = "123456789912345678891234567789123456678912345567891234456789123345678912234567891";
		assertEquals(-1, s.verify(testValue));
	}
	
	

}
