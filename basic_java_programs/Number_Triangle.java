package basic_java_programs;

import java.util.Scanner;

public class Number_Triangle {

	public static void main(String[] args) {
		
		
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of N : ");
		int n = sc.nextInt();
		
		int m=1;
		
		for(int i=1;m<=n;i++) {
			
			for(int  j=1;j<=i && m<=n;j++) {
				
				System.out.print(m + " ");
				
				m++;
			}
			
			System.out.println();
			
		}
		
		

	}

}
