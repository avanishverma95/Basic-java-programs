package basic_java_programs;

public class Random_number {

	public static void main(String[] args) {
		
		System.out.println("random numbers are : ");
		
		for (int i=1;i<=5;i++){
			
            int num=(int)(Math.random()*100)+1;
            
            System.out.println(num);
        }

	}

}
