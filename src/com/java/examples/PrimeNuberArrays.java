package com.java.examples;

import java.util.Scanner;

public class PrimeNuberArrays {
	
		public static void main(String[] args) {  
		      int a[]= {3,4,5,6} ;
		      for(int i=0;i<a.length;i++) {
		       if (isPrime(a[i])) {  
		           System.out.println(a[i] + " is a prime number");  
		       } else {  
		           System.out.println(a[i] + " is not a prime number");  
		       }  
		   }  
}
		  
		   public static boolean isPrime(int a) {  
			 
		       if (a <= 1) {  
		           return false;  
		       }  
		       for (int i = 2; i < Math.sqrt(a); i++) {  
		           if (a % i == 0) {  
		               return false;  
		           }  
		       }  
		       return true;  
		   }  
		}