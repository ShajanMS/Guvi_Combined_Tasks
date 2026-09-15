package guvi_Tasks;

import java.util.Scanner;

public class SeniorCitizen {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the age of a person : ");

		int age = scan.nextInt();

		if (age == 0) {
			
			System.out.println("Please enter a valid digit");
			
		}
			if (age >= 60) {

				System.out.println("The Person is a Senior Citizen");

			} else {

				System.out.println("The Person is a not a Senior Citizen");
			}

		scan.close();
	}

}
