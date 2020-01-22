package com.test.java;

import java.util.Arrays;

public class TestMultiArray {

	public static void main(String[] args) {
		
		System.out.print("Array \n" +Arrays.deepToString(createMultiArray()));
		
	}
	
	static int[][] createMultiArray(){
		
		int [][] multiarray = new int[3][3];
		System.out.println(multiarray.length);
		for(int i=0;i<multiarray.length; i++){
			for(int j=0;j<=i;j++){
				multiarray[i][j]= j;
			}
		}
		
		System.out.println("Printing Array");
		
		for(int i=0;i<multiarray.length; i++){
			for(int j=0;j<multiarray[i].length;j++){
				System.out.print(multiarray[i][j]);
			}
			System.out.println();
		}
		
		return multiarray;
	}
	
}
