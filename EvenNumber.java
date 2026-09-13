package guvi_Tasks;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a Value : ");

		int num = scan.nextInt();

		if (num % 2 == 0) {

			System.out.println("The given number is EVEN");
		}

		else {

			System.out.println("The given number is ODD");
		}

		scan.close();
	}

}
