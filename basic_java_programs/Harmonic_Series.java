package basic_java_programs;

import java.util.Scanner;

public class Harmonic_Series {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		
        int n = sc.nextInt();
        
        System.out.println("Harmonic  Series is : "); 

        for(int i=1;i<=n;i++) {
        	
        	System.out.print("1/" + i + " , ");
        }
	}

}
