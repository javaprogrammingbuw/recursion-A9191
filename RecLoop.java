package recursion;

import java.util.Scanner;

public class RecLoop{
	
    public static void main(String args[]){ 
    	
    	Scanner in1 = new Scanner(System.in);
    	Scanner in2 = new Scanner(System.in);
	    System.out.print("Enter a numbers: ");
		 int g;
		 int h;
		 g = in1.nextInt();
		 h = in2.nextInt();
    	double res1 = euclidRec( g, h);
    	double ans2 = euclidItr( g, h);
    	System.out.println(res1 );
    	System.out.println(ans2 );
    	double res3 = powRecursive( g, h);
    	double ans4 = powIterative( g, h);
    	System.out.println(res3 );
    	System.out.println(ans4 );
    } 
	
	 public static int euclidRec(int a, int b) {
		if (a == b) {
			return a;
			
		} 
		else if (b > a) {
			int c = a;
			a = b;
			b = c;
			return euclidRec(a, b);
		} else {
			return euclidRec(a - b, b);
		}
	}
	
	 public static int euclidItr(int a, int b) {
		 
		 for(int i=0; i< Integer.MAX_VALUE; i++) {
			 if(a==b) {	 
				 return a;
			 }
			 else if (b > a) {
				 int c = a;
				 a = b;
				 b = c;			
			 } 
			 else {
				 a = a-b;
			 }
		 }
		 return 0;
	 }
	
	 
	 	 	 
//--------------------------------------------------------------------------------------------------------------------	 
	 
	 
    public static double powIterative(final double base, final int n) {
		if (n < 0) {
			System.out.println("(Our version of) power is undefined for negative numbers.");
			return -1;
		} else {
			double result = 1; 
			for (int i = n; i > 0; --i) {
				result = result * base;
			}
			return result;
		}
	}   
    
    public static double powRecursive(final double base,final int n) {
		if (n < 0) {
			System.out.println("(Our version of) power is undefined for negative numbers.");
			return -1;
		}
		else if (n==0) {
			return 1;
		}
			else{
         return base * powRecursive( base,(n-1));
			
		}
	}   
    
}



//todo: Look at the given code and try to understand the methods.
//The first method euklidRek uses recursion to compute the euclidean algorithm.
//You can look up the algorithm here: https://en.wikipedia.org/wiki/Euclidean_algorithm
//Add another method euclidIterative that computes the euclidean algorithm iterative.
//The second method powIterative computes the the base to the power of n in a iterative way.
//Add another method powRek which does exactly the same, but by using recursion.