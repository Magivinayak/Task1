package Task1;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// To find the given number is positive or negative
		
		//Getting input from user 
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a value ");
		int value = obj.nextInt();
		obj.close(); //closing scanner class as we got the required input from user
		
		//checking for is either positive or negative
		
		if (value < 0)//if value is less than 0 then the value is negative
		{
			System.out.println("The Value is Negative ");
		}
		else if (value == 0)//if value is 0 then it is nor positive and negative
		{
			System.out.println("The Value is neither Positive nor Negative");
		}
		else //if both conditions are false then the value is Positive  
		{
			System.out.println("The Value is Positive ");
		}

	}

}
