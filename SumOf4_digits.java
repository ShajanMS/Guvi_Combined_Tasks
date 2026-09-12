package guvi_Tasks;

public class SumOf4_digits {

	public static void main(String[] args) {

		int a = 100;

		int b = 20;

		int c = 30;

		int d = 40;
		
		int AB = a+b;
		
		int CD = c+d;
		
		if (AB>CD) {
			
			System.out.println("Sum of a and b is greater than the sum of c and d");
		}
		
		else {
			
			System.out.println("Sum of c and d is greater than the sum of a and b");
		}
	}

}
