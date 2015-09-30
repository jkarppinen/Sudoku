package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSudokuVerifier {

	@Test
	public void test_zerovalue() {
		SudokuVerifier s = new SudokuVerifier();
		assertEquals(0, s.verify("0"));
	}
	
	@Test
	public void test_validValue() {
		SudokuVerifier s = new SudokuVerifier();
		String testValue = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
		assertEquals(1, s.verify(testValue));
	}
	
	

}
