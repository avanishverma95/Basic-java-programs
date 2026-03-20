package basic_java_programs;

import java.util.Scanner;

public class List_of_even_numbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the limit : ");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			
			if(i%2==0) 
				
				System.out.println(i);
		}
	}

}
