package basic_java_programs;

import java.util.Scanner;

public class Generate_prime_numbers {
	
	static boolean isprime(int n){
		
		for(int i=2;i<=n/2;i++) {
			
			if(n%i==0) return false;
			
		}
		
		return true;
		
	}

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the limit : ");
		int n = sc.nextInt();
		
		if(n==0)
			System.out.println("0 is neither prime nor composite");
		
		for(int  i=1;i<=n;i++){
			
			if(isprime(i))
				System.out.println(i);
				
		}
			

	}

}
