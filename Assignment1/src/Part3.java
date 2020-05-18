/*
 * Part3 is a modified version of the DayOfWeek program. They key differences are that Part3 figures in the possibility of leap years. It includes a formula to calculate
 * whether the given year is a leap year or not, and will display the correct number of days for February when prompting an input for a day of the month. The other noteable
 * inclusion in Part3 is the addition of if statements to catch invalid month or day of the month inputs from the user. Should this happen, the program will notify the user
 * of their error before terminating.
 * 
 * Kyle Thomas, Eclipse 4.7, program last updated 9/22/17 at 11:33pm.
 */

import java.util.Scanner;
public class Part3 {
	
	
	//jdoan1@memphis.edu
	public static void main(String args[]) {
		
		//declare variables
		int year, month, dayOfMonth, dayOfWeek, century, yearOfCentury;
		boolean leapYear;
		
		//create new scanner
		Scanner input = new Scanner(System.in);
		
		//prompts user for input of a year and stores that value in 'year' variable
		System.out.println("Enter year (e.g., 2008):");
		year = input.nextInt();
		
		//calculates whether the year that was input is a leap year or not
		leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		
		
		//prompts user to input a month, and stores value in 'month' variable
		System.out.println("Enter month (1-12):");
		month = input.nextInt();
		
		//if statement to catch invalid month values and terminate the program if one is entered
		if (month > 12 || month < 1) {
			System.out.println("Error: Invalid Month Value");
			System.exit(1);
		}
		
		//multiway if statement to prompt the user to input the day of the month, with the range of days displayed based on the month input previously, includes nested if statements to catch invalid values
		if (month == 4 || month == 6 || month == 9 || month == 11) {
			System.out.println("Enter the day of the month (1-30):");
			dayOfMonth = input.nextInt();
			if (dayOfMonth > 30 || dayOfMonth < 1) {
				System.out.println ("Error: Invalid Day Value Given");
				System.exit(1);
			}
		}
		else if (month == 2 && leapYear == false) {
			System.out.println("Enter the day of the month (1-28):");
			dayOfMonth = input.nextInt();
			if (dayOfMonth > 28 || dayOfMonth < 1) {
				System.out.println ("Error: Invalid Day Value Given");
				System.exit(1);
			}
		}
		else if (month == 2 && leapYear == true) {
			System.out.println("Enter the day of the month (1-29):");
			dayOfMonth = input.nextInt();
			if (dayOfMonth > 29 || dayOfMonth < 1) {
				System.out.println ("Error: Invalid Day Value Given");
				System.exit(1);
			}
		}
		else {
			System.out.println("Enter the day of the month (1-31):");
			dayOfMonth = input.nextInt();
			if (dayOfMonth > 31 || dayOfMonth < 1) {
				System.out.println ("Error: Invalid Day Value Given");
				System.exit(1);
			}
		}
		//if statement to convert values for january and february to 13 and 14, respectively, as well as change the year to the previous year, as per the instructions
		if (month == 1) {
			month = 13;
			year = year - 1;
		}
		else if (month == 2) {
			month = 14;
			year = year - 1;
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
