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

		if(! validSubGrids(candidateSolution)){
			return -5;
		}
		return 0;
	}
	
	private boolean validSubGrids(String val){
		int startCell = 0;
		String letter = "";
		String[] arr = val.split("");
		
		
		for(int col=0;col<3;col++){

		startCell = 0 + (col*3);
			for(int row=0;row<3;row++){

				List<String> tempArray = new ArrayList<String>();
				// New subgrid
				for(int i=0;i<3;i++){

					for(int j=0;j<3;j++){
						letter =  arr[startCell+j] ;

						if(tempArray.contains(letter)){
							return false;
						}
						tempArray.add(letter);
					}
					
					startCell += 9;
		
				}
			}
		}
		return true;
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
			for(int j=0;j<depth-1;j++){
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
				String letter = arr[(i*depth) + j];

				
				if(tempArray.contains(letter)){
					return false;
				}

				tempArray.add(letter);
			}
			
		}
		
		return true;
	}
	
}
