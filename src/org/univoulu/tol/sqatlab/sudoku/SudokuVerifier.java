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
		if(! validRows(candidateSolution)){
			return -3;
		}

		if(! validColumns(candidateSolution)){
			return -4;
		}
		return 0;
	}
	
	private boolean digitsOnly(String val) {
		String regex = "\\d+";
		return val.matches(regex);
	}
	
	private boolean validColumns(String val){
		String[] arr = val.split("");
		int depth = 9;

		for(int i=1;i<=depth;i++){

			List<String> tempArray = new ArrayList<String>();
			for(int j=0;j<depth;j++){
				String letter = arr[i + j * depth];
				if(tempArray.contains(letter)){
					return false;
				}

				tempArray.add(letter);
			}
		}
		
		return true;
	}	
	private boolean validRows(String val){
		String[] arr = val.split("");
		int depth = 9;

		for(int i=0;i<depth;i++){

			List<String> tempArray = new ArrayList<String>();
			for(int j=0;j<depth;j++){
				String letter = arr[1 + (i*depth) + j];
				
				if(tempArray.contains(letter)){
					return false;
				}

				tempArray.add(letter);
			}
			System.out.println("A"+tempArray);
		}
		
		return true;
	}
	
}
