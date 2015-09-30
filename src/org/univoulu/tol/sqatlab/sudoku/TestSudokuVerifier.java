package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSudokuVerifier {

	@Test
	public void test_zerovalue() {
		SudokuVerifier s = new SudokuVerifier();
		assertEquals(1, s.verify("0"));
	}

}
