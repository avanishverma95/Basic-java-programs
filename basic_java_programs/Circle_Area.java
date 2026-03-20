package basic_java_programs;

import java.util.Scanner;

public class Circle_Area {

	public static void main(String[] args) {
		
		
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Redius : ");
		
        int r = sc.nextInt();
        float pi=(float)3.141592;
        
        float area = pi*r*r;
        
        System.out.println("Area of circle is :  " + area);
	}

}
