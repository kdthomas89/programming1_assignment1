/*
 * The DayOfWeek program takes the input from the user and will calculate the day of the week for any given day of any given month of any given year.
 * The program first prompts the user to input a year, a month, and a day of the month. The program then runs the inputs through a formula designed to calculate the
 * day of the week and outputs the result to the console.
 * 
 * Kyle Thomas, Eclipse 4.7, program last updated 9/22/17 at 4:15am.
 */

import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[] args) {
		
		//declare variables
		int year, month, dayOfMonth, dayOfWeek, century, yearOfCentury;
		
		//create new scanner
		Scanner input = new Scanner(System.in);
		
		//prompts user to input a year, and stores value in 'year' variable
		System.out.println("Enter year (e.g., 2008):");
		year = input.nextInt();
		
		//prompts user to input a month, and stores value in 'month' variable
		System.out.println("Enter month (1-12):");
		month = input.nextInt();
		
		//if statement to convert values for january and february to 13 and 14, respectively, as well as change the year to the previous year, as per the instructions
		if (month == 1) {
			month = 13;
			year = year - 1;
		}
		else if (month == 2) {
			month = 14;
			year = year - 1;
		}	
		
		//switch statement to display the appropriate number of days in the corresponding month
		switch (month) {
			case 3:
				System.out.println("Enter the day of the month (1-31):");
				dayOfMonth = input.nextInt();
				break;
			case 4:
				System.out.println("Enter the day of the month (1-30):");
				dayOfMonth = input.nextInt();
				break;
			case 5:
				System.out.println("Enter the day of the month (1-31):");
				dayOfMonth = input.nextInt();
				break;
			case 6:
				System.out.println("Enter the day of the month (1-30):");
				dayOfMonth = input.nextInt();
				break;
			case 7:
				System.out.println("Enter the day of the month (1-31):");
				dayOfMonth = input.nextInt();
				break;
			case 8:
				System.out.println("Enter the day of the month (1-31):");
				dayOfMonth = input.nextInt();
				break;
			case 9:
				System.out.println("Enter the day of the month (1-30):");
				dayOfMonth = input.nextInt();
				break;
			case 10:
				System.out.println("Enter the day of the month (1-31):");
				dayOfMonth = input.nextInt();
				break;
			case 11:
				System.out.println("Enter the day of the month (1-30):");
				dayOfMonth = input.nextInt();
				break;
			case 12:
				System.out.println("Enter the day of the month (1-31):");
				dayOfMonth = input.nextInt();
				break;
			case 13:
				System.out.println("Enter the day of the month (1-31):");
				dayOfMonth = input.nextInt();
				break;
			case 14:
				System.out.println("Enter the day of the month (1-28):");
				dayOfMonth = input.nextInt();
				break;
			//had to put this default dayOfMonth value in here so dayOfMonth would register as initialized in the formula below
			default:
				dayOfMonth = 0;
				
		}
		
		//initialize century variable
		century = year / 100;
		
		//initialize yearOfCentury variable
		yearOfCentury = year % 100;
		
		//formula that will calculate the day of the week with the given inputs
		dayOfWeek = (dayOfMonth + ((26 * (month + 1)) / 10) + yearOfCentury + (yearOfCentury / 4) + (century / 4) + 5 * century) % 7;
		
		//switch statement that will output the resulting day of the week to the user
		switch (dayOfWeek) {
			case 0:
				System.out.println("The day of the week is Saturday.");
				break;
			case 1:
				System.out.println("The day of the week is Sunday.");
				break;
			case 2:
				System.out.println("The day of the week is Monday.");
				break;
			case 3:
				System.out.println("The day of the week is Tuesday.");
				break;
			case 4:
				System.out.println("The day of the week is Wednesday.");
				break;
			case 5:
				System.out.println("The day of the week is Thursday.");
				break;
			case 6:
				System.out.println("The day of the week is Friday.");
				break;
			
		
	
		}
		
		
		
		
	}
		

}


