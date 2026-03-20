package basic_java_programs;

import java.util.Scanner;

public class Palindrome_Number {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		
        int n = sc.nextInt();
        int temp = n;
        int m=0;
        
        while(temp>0) {
        	
        	int a=temp%10;
        	m= (m*10) + a;
        	temp=temp/10;
        }
		
        if(n==m)
        	System.out.println(n + " is palindrome");
        else
        	System.out.println(n + " is not palindrome");
        	

	}

}
