package lab1;

import java.util.Scanner;

public class Lab1Test2 {

	public static void main(String[] args) 
	{
		//Initializes scanner for input
		Scanner scanner = new Scanner(System.in);
		
		int userNum = 0;
		
		System.out.print("Hello! Please enter a number between 1 to 10: ");
		userNum = scanner.nextInt();
	

		if(userNum > 10 || userNum < 1)
		{
			System.out.println("The number input, " + userNum + " is not in range 1-10 which is not valid");
		}
		else
		{
			// put code to decide output for numbers in range 1-10 here
			
			System.out.println("Good Number");
			
			
			if(userNum == 3)
			{
				System.out.println("That's a lucky number....");
			}
			else
			{
				System.out.println("That's a nice number");
			}
			
			if (userNum > 6) 
			{
				System.out.println("larger");
			}
			else 
			{
				System.out.println("smaller");
			}
			
			if (userNum == 10)
			{
				System.out.println("last number");
			}
			
			else
			{
				System.out.println("not last");
			}
			
			if (userNum < 3)
			{
				System.out.println("Really Small");
			}
			
			else 
			{
				System.out.println("not really small");
			}
			
			
			
			
			
			// more code here

		} // end of else value userNum is in range 1-10.
		
		
	}
}
