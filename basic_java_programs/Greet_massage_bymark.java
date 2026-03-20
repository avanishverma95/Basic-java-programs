package basic_java_programs;

import java.util.Scanner;

public class Greet_massage_bymark {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your marks : ");
		
        int marks = sc.nextInt();
        
        if(marks>=90) 
            System.out.println("Excellent");
        
        else if(marks>=70) 
            System.out.println("Very Good");
        
        else if(marks>=50) 
            System.out.println("Good");
        
        else if(marks>=40) 
            System.out.println("Pass");
        
        else 
            System.out.println("Fail");
        


	}

}
