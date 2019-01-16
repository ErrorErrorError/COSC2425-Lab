package lab1;

import java.util.Scanner;

public class Lab1Test1 {
	public static void main(String[] args) 
	{
	Scanner scanner = new Scanner(System.in);
	System.out.print("What is your favorite color? ");
	String name = scanner.nextLine(); //reads entire input line
	System.out.println("Your favorite color is: " + name);

	System.out.print("Enter an integer: ");
	int number1 = scanner.nextInt();

	scanner.nextLine(); // throws away the enter key after number is entered.
	System.out.println("The number is: " + number1);

	System.out.print("Enter a double number: ");
	double number2 = scanner.nextDouble();

	scanner.nextLine(); // throws away the enter key after number is typed.
	System.out.println("The number is: " + number2);

	// simple output

	System.out.println("Your favorite color: " + name.toUpperCase() + " is perfect");
	
	
	// HW Part 1 output
	String major; 
	String homeTown;
	
	System.out.println("\nHello! Please enter your hometown: ");
	homeTown = scanner.nextLine();
	
	System.out.println("Now enter your major: ");
	major = scanner.nextLine();
	
	//Output
	System.out.println("Your home town is " + homeTown + " and your major is " + major + ".");;
	} // end of main method for Lab1Test
	
	
}
