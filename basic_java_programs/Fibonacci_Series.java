package basic_java_programs;

import java.util.Scanner;

public class Fibonacci_Series {

	public static void main(String[] args) {
		
         Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the limit : ");
		int n = sc.nextInt();
		
		int term1=0;
		int term2=1;
		int nextterm;
		
		for(int i=0;i<n;i++) {
			
			System.out.println(term1 + " ");
			
			nextterm = term1 + term2;
			term1 = term2;
			term2 = nextterm;
			
		}
		
	     

	}

}
