package basic_java_programs;

import java.util.Scanner;

public class pascal_triangle {

	public static void main(String[] args) {
		

        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of rows : ");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n ; i++) {
			
			int nums = 1;
			
			for(int j=1; j<=i;j++) {
				
				System.out.print(nums + " ");
				
				nums=nums*(i-j)/(j);
				
				}
			
			System.out.println();
		}

	}

}
