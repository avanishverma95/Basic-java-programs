package basic_java_programs;

import java.util.Scanner;

public class Minimum_of_Two_Numbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers : ");
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		if(n<m)
			System.out.println("Minimum number is: " + n);
		else
			System.out.println("Minimum number is: " + m);


	}

}
