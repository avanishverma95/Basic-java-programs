package basic_java_programs;

import java.util.Scanner;

public class Swap_the_values {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number num1  : ");
		int n = sc.nextInt();
		
		System.out.println("Enter number num2  : ");
		int m = sc.nextInt();
		
		System.out.println("Before the swaping : " );
		System.out.println("num1= "+ n  +" num2= " + m);
		
		int temp=n;
		n=m;
		m=temp;
		
		System.out.println("After the swaping : " );
		System.out.println("num1= "+ n  +" num2= " + m);

	}

}
