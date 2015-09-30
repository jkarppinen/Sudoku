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
		if(! validColumns(candidateSolution)){
			return -2;
		}
		if(! validRows(candidateSolution)){
			return -2;
		}
		
		return 0;
	}
	
	private boolean digitsOnly(String val) {
		String regex = "\\d+";
		return val.matches(regex);
	}
	
	private boolean validColumns(String val){
		String[] arr = val.split("");
		

		for(int i=1;i<=9;i++){

			List<String> tempArray = new ArrayList<String>();
			for(int j=0;j<9;j++){
				String letter = arr[i + j * 9];
				System.out.println(String.valueOf(i+j*9) + " Val: " + letter);
				if(tempArray.contains(letter)){
					return false;
				}

				tempArray.add(letter);
			}
			System.out.println(tempArray);
		}
		
		return true;
	}	
	private boolean validRows(String val){
		String[] arr = val.split("");
		

		for(int i=0;i<=9;i++){

			List<String> tempArray = new ArrayList<String>();
			for(int j=0;j<9;j++){
				String letter = arr[i*9 + j];
				System.out.println(String.valueOf(i+j*9) + " Val: " + letter);
				if(tempArray.contains(letter)){
					return false;
				}

				tempArray.add(letter);
			}
			System.out.println(tempArray);
		}
		
		return true;
	}
	
}
