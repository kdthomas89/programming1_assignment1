/*
 * The BRMCalculator program is a program that calculates the basal metabolic rate of the user. The program first asks the user to input their age, height, weight, whether
 * they are male or female, and their activity level. The program then executes an if statement with a nested switch statement to calculate the metabolic rate based on the 
 * user's inputs. The if statement is based on whether the user input male or female. The switch statement nested within the if statement is based on what the user input as their
 * level of activity. After the program has calculated it displays the result to the user in the console window.
 * 
 * Kyle Thomas, Eclipse 4.7, program last updated 9/20/17 at 2:23pm.
 */

import java.util.Scanner;

public class BMRCalculator {

	public static void main(String[] args) {
		
		//create new scanner
		Scanner input = new Scanner(System.in);
		//declare variables
		int age, height, weight, maleFemale, activity;
		double metabolicRate;
		
		System.out.println("This program will calculate your basal metabolic rate or BMR");
	
		//gather inputs from user, storing values in appropriate variables
		System.out.println("What is your age in years?");
		age = input.nextInt();
	
		System.out.println("What is your total height in inches?");
		height = input.nextInt();
	
		System.out.println("What is your weight in pounds?");
		weight = input.nextInt();
	
		System.out.println("Enter '1' for male calculation or '2' for female calculation");
		maleFemale = input.nextInt();
	
		System.out.println("Are you:");
		System.out.println("1. Sedentary");
		System.out.println("2. Somewhat active (exercise occasionally)");
		System.out.println("3. Active (exercise 3-4 days per week)");
		System.out.println("4. Highly active (exercise every day)");
		System.out.println("Enter 1, 2, 3, or 4.");
		activity = input.nextInt();
	
		//metabolic rate calculation for when the user has identified as female
		if (maleFemale == 2) {
			//switch statement that will increase calculated metabolic rate by a certain percentage based on activity levels
			switch (activity) {
				//when the user inputs activity level as sedentary, case 1 increases the BMR by 20 percent
				case 1:
					metabolicRate = 655 + (4.3 * weight) + (4.7 * height) - (4.7 * age);
					metabolicRate = metabolicRate + (metabolicRate * 0.2);
					System.out.println("The BMR of a female with those measurements is " + metabolicRate);
					break;
				//when the user inputs activity level as somewhat active, case 2 increases the BMR by 30 percent
				case 2:
					metabolicRate = 655 + (4.3 * weight) + (4.7 * height) - (4.7 * age);
					metabolicRate = metabolicRate + (metabolicRate * 0.3);
					System.out.println("The BMR of a female with those measurements is " + metabolicRate);
					break;
				//when the user inputs activity level as active, case 3 increases the BMR by 40 percent
				case 3:
					metabolicRate = 655 + (4.3 * weight) + (4.7 * height) - (4.7 * age);
					metabolicRate = metabolicRate + (metabolicRate * 0.4);
					System.out.println("The BMR of a female with those measurements is " + metabolicRate);
					break;
				//when the user inputs activity level as highly active, case 4 increases the BMR by 50 percent
				case 4:
					metabolicRate = 655 + (4.3 * weight) + (4.7 * height) - (4.7 * age);
					metabolicRate = metabolicRate + (metabolicRate * 0.5);
					System.out.println("The BMR of a female with those measurements is " + metabolicRate);
					break;
				//in case the user inputs a value other than 1-4 for activity level
				default:
					System.out.println("Error: Invalid value given for activity");
					System.exit(1);	
				}
		}
		//metabolic rate calculation for when the user has identified as male
		else if (maleFemale == 1) {
			//switch statement that will increase calculated metabolic rate by a certain percentage based on activity levels
			switch (activity) {
				//when the user inputs activity level as sedentary, case 1 increases the BMR by 20 percent
				case 1:
					metabolicRate = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);
					metabolicRate = metabolicRate + (metabolicRate * 0.2);
					System.out.println("The BMR of a male with those measurements is " + metabolicRate);
					break;
					//when the user inputs activity level as somewhat active, case 2 increases the BMR by 30 percent
				case 2:
					metabolicRate = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);
					metabolicRate = metabolicRate + (metabolicRate * 0.3);
					System.out.println("The BMR of a male with those measurements is " + metabolicRate);
					break;
				//when the user inputs activity level as active, case 3 increases the BMR by 40 percent
				case 3:
					metabolicRate = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);
					metabolicRate = metabolicRate + (metabolicRate * 0.4);
					System.out.println("The BMR of a male with those measurements is " + metabolicRate);
					break;
				//when the user inputs activity level as highly active, case 4 increases the BMR by 50 percent
				case 4:
					metabolicRate = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);
					metabolicRate = metabolicRate + (metabolicRate * 0.5);
					System.out.println("The BMR of a male with those measurements is " + metabolicRate);
					break;
				//in case the user inputs a value other than 1-4 for activity level
				default:
					System.out.println("Error: Invalid value given for activity");
					System.exit(1);	
			}
		}

	}

}
