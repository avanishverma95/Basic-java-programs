package basic_java_programs;

import java.util.Scanner;

public class Maximum_of_Two_Numbers {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers : ");
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		if(n>m)
			System.out.println("Maximum number is: " + n);
		else
			System.out.println("Maximum number is: " + m);
	}

}
