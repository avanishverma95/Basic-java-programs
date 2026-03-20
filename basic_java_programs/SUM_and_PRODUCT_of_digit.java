package basic_java_programs;

import java.util.Scanner;

public class SUM_and_PRODUCT_of_digit {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int sum=0;
		int prod=1;
		
		while(n>0) {
			
			int temp=n%10;
			
			sum=sum+temp;
			
			prod=prod*temp;
			
			n=n/10;
		}
		
		System.out.println("Sum of digit is : " + sum);
		System.out.println("Product of digit : " + prod);

	}

}
