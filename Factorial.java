package recursion;

import java.util.Scanner;
public class Factorial {
		 static int factorial(int n){    
		  if (n == 0)    
		    return 1;    
		  else    
		    return(n * factorial(n-1));    
		 }  

		 
		 public static void main(String args[]){ 
					Scanner in = new Scanner(System.in);
				    System.out.print("Enter a number: ");
					 int number;
				    number = in.nextInt();
		        	 int f = factorial(number);   
			  System.out.println("Factorial of "+number+" is: "+f);    
			 }  
			}  

	//todo: implement a recursive functions whicht gives you the factorial value of a given number
	

