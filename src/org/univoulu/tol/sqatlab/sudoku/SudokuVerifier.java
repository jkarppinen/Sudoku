package org.univoulu.tol.sqatlab.sudoku;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
		String[] arr = val.split("");
		List<String> tempArray = new ArrayList<String>();
		int depth = 9;
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				if(tempArray.contains(arr [i + (j*depth)] ) ){
					System.out.println("i"+String.valueOf(i)+"j"+String.valueOf(j));
					return false;
				}
				tempArray.add(arr[i + (j*depth)]);
			}
		}
		return true;
	}
	
}
