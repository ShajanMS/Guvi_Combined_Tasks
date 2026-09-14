package guvi_Tasks;

import java.util.Scanner;

public class PrimeNumberchacking {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a Value : ");

		int isPrime = scan.nextInt();

		if (isPrime <= 1) {

			System.out.println("Please enter a valid digit");
			
		} else {

			boolean prime = true;

			for (int i = 2; i <= Math.sqrt(isPrime); i++) {

				if (isPrime % i == 0) {

					prime = false;

					break;
				}

				if (prime) {

					System.out.println("The given value is PRIME");

				} else {

					System.out.println("The given value is NOT PRIME");

				}
			}
		}

		scan.close();
	}

}
