package CountingChange;

import java.util.Scanner;

//CountingChange lab assignment for 
//Venus Ho
//CIS084 Java Programming
//Feb 21 to Feb 26 2023 Lab Assignment

public class CountingMoney {

	public static final double QUARTER_VALUE = 0.25;
	public static final double DIME_VALUE = 0.10;
	public static final double NICKEL_VALUE = 0.05;
	public static final double PENNY_VALUE = 0.01;

	public static void main(String[] args) {

		double quarters, dimes, nickels, pennies;
		double totalAmount;

		Scanner userInput = new Scanner(System.in);

		System.out.println("Counting Change Machine\n");

		System.out.println("Please enter the number of quarters: ");
		quarters = userInput.nextDouble();
		System.out.println("Please enter the number of dimes: ");
		dimes = userInput.nextDouble();
		System.out.println("Please enter the number of nickels: ");
		nickels = userInput.nextDouble();
		System.out.println("Please enter the number of pennies: ");
		pennies = userInput.nextDouble();

		totalAmount = (quarters * QUARTER_VALUE) + (dimes * DIME_VALUE) + (nickels * NICKEL_VALUE)
				+ (pennies * PENNY_VALUE);

		System.out.printf("Your total amount of change is: $%.2f\n", totalAmount);

		userInput.close();

	}
}

//Git: Innominate-Majesty