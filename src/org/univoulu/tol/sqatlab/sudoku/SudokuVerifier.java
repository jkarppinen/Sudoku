package org.univoulu.tol.sqatlab.sudoku;

public class SudokuVerifier {

	public int verify(String candidateSolution) {
		SudokuVerifier s = new SudokuVerifier();
		if(candidateSolution.length() != 81){
			return 0;
		}
		return 1;
	}
	
	
}
