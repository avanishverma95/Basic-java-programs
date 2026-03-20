package basic_java_programs;

import java.util.Scanner;

public class switch_case_demo {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers : ");
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		System.out.println("Choose operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        
        int  i=sc.nextInt();
        
        switch (i){
              case 1:
                  System.out.println("Addition= "+(n+m));
                  break;
              case 2:
                 System.out.println("Subtraction= " + (n-m));
                 break;
              case 3:
                 System.out.println("Multiplication= " + (n*m));
                 break;
              case 4:
                System.out.println("Division= " + (n/m));
                break;
              default:
                System.out.println("Invalid choice");
    }

	}

}
