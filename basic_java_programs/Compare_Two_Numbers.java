package basic_java_programs;

import java.util.Scanner;

public class Compare_Two_Numbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers : ");
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		if(n>m)
			System.out.println(n + " is largest");
		else if(n<m) 
			System.out.println(m + " is largest");
		else
			System.out.println("Numbers are equals");
			
			
		}

}
