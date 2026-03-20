package basic_java_programs;

import java.util.Scanner;

public class Average_of_N_even_odd_numbes {

	static int even_sum(int n) {

		int sum = 0;
		int num = 2;

		while (n > 0) {

			sum = sum + num;
			num = num + 2;
			n--;
		}

		return sum;
	}

	static int odd_sum(int n) {

		int sum = 0;
		int num = 1;

		while (n > 0) {

			sum = sum + num;
			num = num + 2;
			n--;
		}

		return sum;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of N : ");
		int n = sc.nextInt();

		int evensum = even_sum(n);
		int oddsum = odd_sum(n);

		double even_avg = (double) evensum / n;
		double odd_avg = (double) oddsum / n;

		System.out.println("Average of N even numbers : " + even_avg);
		System.out.println("Average of N odd numbers : " + odd_avg);

	}

}
