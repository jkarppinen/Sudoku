package org.univoulu.tol.sqatlab.sudoku;

import java.util.ArrayList;

public class SudokuVerifier {

	public int verify(String candidateSolution) {
		if(candidateSolution.length() != 81){
			return -1;
		}
		if(! digitsOnly(candidateSolution)) {
			return -1;
		}
		if(! validSubGrids(candidateSolution)){
			return -2;
		}
		
		return 0;
	}
	
	private boolean digitsOnly(String val) {
		String regex = "\\d+";
		return val.matches(regex);
	}
	
	private boolean validSubGrids(String val){
		for(int i=0;i<9;i++){
			List<String> l = new ArrayList<>();
			
		}
		return true;
	}
	
}
