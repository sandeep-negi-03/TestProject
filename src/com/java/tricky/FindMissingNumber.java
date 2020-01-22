package com.java.tricky;

//Java program to find missing Number 
//using xor 
public class FindMissingNumber {

	
	public static void main(String[] args) {int a[] = { 1, 2, 4, 5, 6 }; 
    int miss = getMissingNo(a, 5); 
    System.out.println(miss); 
    
	}
	
	static int getMissingNo(int a[], int n) 
    { 
        int x1 = a[0]; 
        int x2 = 1; 
  
        /* For xor of all the elements  
           in array */
        for (int i = 1; i < n; i++) 
            x1 = x1 ^ a[i]; 
  
        /* For xor of all the elements  
           from 1 to n+1 */
        for (int i = 2; i <= n + 1; i++) 
            x2 = x2 ^ i; 
  
        System.out.println("x1 : "+ x1 + " :: x2 : "+ x2 + " :: x1^x2 : " + (x1^x2));
        
        return (x1 ^ x2); 
    } 
  
}
