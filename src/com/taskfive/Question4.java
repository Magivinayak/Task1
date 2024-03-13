package com.taskfive;


import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);		
		
		System.out.print("Enter your date of bith (yyyy-mm-dd):");	
		String dobUser =userInput.nextLine();
		userInput.close();
		
		LocalDate localDOB =LocalDate.parse(dobUser); //input
				
		Period totalCalculate = Period.between(localDOB, LocalDate.now());//calculate values
		
		//output
		System.out.println();
		System.out.println("Your Age is: "+totalCalculate.getYears()+" years, "+totalCalculate.getMonths()+" months, and  " + totalCalculate.getDays()+" days.");
		
	}

}

/*
 -----------------------------------------------output--------------------------------
Enter your date of bith (yyyy-mm-dd):1990-05-15

Your Age is: 33 years, 9 months, and  27 days.
 */
