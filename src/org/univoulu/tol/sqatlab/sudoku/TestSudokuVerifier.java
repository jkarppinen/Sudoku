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
		assertEquals(-5, s.verify(testValue));
	}

	
	@Test
	public void test_invalid_alphanumerics() {
		SudokuVerifier s = new SudokuVerifier();
		String testValue = "A17369825632158947958724316825437169791586432346912758289643571573291684164875293";
		assertEquals(-1, s.verify(testValue));
	}
	
	
	@Test
	public void test_invalid_column_and_row() {
		SudokuVerifier s = new SudokuVerifier();
		String testValue = "123456789132158947958724316825437169791586432346912758289643571573291684164875293";
		assertEquals(-3, s.verify(testValue));
	}
	
	
	@Test
	public void test_invalidRow() {
		SudokuVerifier s = new SudokuVerifier();
		String testValue = "444369825632158947958724316825437169791586432346912758289643571573291684164875293";
		assertEquals(-3, s.verify(testValue));
	}
	
	
	
	
	

}
