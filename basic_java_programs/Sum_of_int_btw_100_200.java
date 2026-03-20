package basic_java_programs;

public class Sum_of_int_btw_100_200 {
	
	

	public static void main(String[] args) {   
		
		int sum=0;
		
		for(int i=101;i<200;i++) {
			
			if(i%7==0)
				sum=sum+i;
		}
		System.out.println("Sum of numbers divisible by 7 between 100 and 200= " + sum);
	}

}
