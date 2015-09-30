package org.univoulu.tol.sqatlab.sudoku;

public class SudokuVerifier {

	public int verify(String candidateSolution) {
		if(candidateSolution.length() != 81){
			return -1;
		}
		return 0;
	}
	
	private boolean digitsOnly(String val) {
		
		return true;
	}
	
}
