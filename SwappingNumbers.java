package guvi_Tasks;

import java.util.Scanner;

public class SwappingNumbers {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the first digit for A : ");
		
		int num1 = scan.nextInt();
		
		System.out.print("Enter the second digit for B : ");
		
		int num2 = scan.nextInt();
		
		int temp = num1;
		
		num1 = num2;
		
		num2 = temp;
		
		System.out.print("Swapped the digits are A : " + num1 + " and B : " + num2);
		
		scan.close();
	
	}

}
