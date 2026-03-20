

package basic_java_programs;

import java.util.Scanner;

public class Armstrong_number {
	
static int power(int a, int b) {
		
		int res=1;
		for(int i=1;i<=b;i++) {
			
			res=res*a;
			
		}
	   return res;
	}
	
static boolean isarmstrong(int n, int m) {
	
		  int temp=n;
		  int sum=0;
		  
		  while(temp>0) {
			  
			  int a=temp%10;
			  
			  sum=sum+power(a,m);
			  
			  temp=temp/10;
		  }
		return sum==n;
		
	}

public static void main(String[] args) {
		
		
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		
        int n = sc.nextInt();
        
        int digit=0;
        int temp=n;
        
        while(temp>0) {
        	digit++;
        	temp=temp/10;
        }

        if(isarmstrong(n,digit))
        	System.out.println(n +" is Armstrong number");
        else
        	System.out.println(n +" is not Armstrong number");

        	
        
	}

}
