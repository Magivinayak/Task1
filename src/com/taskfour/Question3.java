package com.taskfour;

import java.util.Scanner;

public class Question3 {
	   
       public static void main(String[] args) {
		
		 try {
			Scanner userInput = new Scanner(System.in);
			
			String[] days = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
			
			System.out.println("Enter the value star from 0 to Print the days ");
			int indexValue = userInput.nextInt();
			System.out.println("Day at index "+ indexValue+" is " +days[indexValue]);

			userInput.close();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception occurred");
			throw new ArrayIndexOutOfBoundsException("The entered value is not in range enter values between 0-6");
		}
	}

}


/*
 output 1: exception
 
Enter the value star from 0 to Print the days 
9
Exception occurred
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: The entered value is not in range enter values between 0-6
	at com.taskfour.Question3.main(Question3.java:21)

output 2 : Normal


Enter the value star from 0 to Print the days 
5
Day at index 5 is Friday
 */
