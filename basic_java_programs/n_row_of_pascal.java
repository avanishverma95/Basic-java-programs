package basic_java_programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class n_row_of_pascal {

	static List<Integer> n_row(int n){
		
		List<Integer> list = new ArrayList<>();
		
		int nums = 1;
		list.add(nums);
		
		for(int i = 1; i<n ; i++) {
			
			nums= nums*(n-i);
			nums= nums/i;
			list.add(nums);
		}
		return list;
		
		
		
	}
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter row no : ");
		int n = sc.nextInt();
		
		System.out.println(n_row(n));

	}

}
