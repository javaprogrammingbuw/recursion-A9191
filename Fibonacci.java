

import java.util.Scanner;


public class Fibonacci {
		
	public static int Fibonaccir(int n){    
		  if (n<=0)
		      return 0;   
		  else if(n == 1)
		      return 1;
		  else    
		       return Fibonaccir(n - 1) + Fibonaccir(n - 2);   
		 }  
		 
	 public static void main(String args[]){ 
			Scanner in = new Scanner(System.in);
		    System.out.print("Enter a number: ");
			 int number;
		    number = in.nextInt();
    	 int fr = Fibonaccir(number);  
     	 int fnr = Fibonaccinr(number);  

	  System.out.println("Fibonacci of "+number+" is: "+fr);   
	  System.out.println("Fibonacci of "+number+" is: "+fnr);    

	 }  	
	 
	// non recursive 

	 public static int Fibonaccinr(int n){ //5
		 if (n<=0)
			    return 0;   
			  else if(n == 1)
			     return 1;
		 else{
		 int a = 0;
		 int b = 1;
		 int c = 0; //result
		 for(int i = 2; i < n; i++){ //i=2
			  c = a+b;
			  a = b; 
			  b = c;
			  c = a+b;
			 
//			 c = a+b;	//1
//			 int temp = b; //1
//			 b = c; //1
//			 a = temp; //
	     } 
		 return c; 
		 } 
	 }
}

	
	
	
	
	
	//todo: The Fibonacci sequence is a sequence where the current number is the sum of the previous numbers. You can read it up here:
	//https://en.wikipedia.org/wiki/Fibonacci_number
	//Write an iterative method fib which takes an integer as parameter. This integer corresponds to the position in the Fibonacci sequence.
	//fib should return the fibonacci number at this position. For example, fib(4) should return 3.
	//Now, write a second methond fibRek. fibRek does exactly the same like fib, but it works recursive.

