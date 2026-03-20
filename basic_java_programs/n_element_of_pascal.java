package basic_java_programs;

import java.util.Scanner;

public class n_element_of_pascal {
	
	static int n_element(int n , int m){
		
		int nums= 1;
		if(n==1 && m==1) return nums;
		else {
			
		 for(int i=1; i<m ; i++){
			
			 nums=nums*(n-i);
			 nums=nums/i;
		}
		}
		
		return nums;
	}

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rows no. : ");
		int n = sc.nextInt();
		System.out.println("Enter column  no. : ");
		int m = sc.nextInt();
		
		System.out.println(n_element(n,m));

	}

}
