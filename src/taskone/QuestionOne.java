package taskone;

import java.util.Scanner;

public class QuestionOne {

	public static void main(String[] args) {
		// TO print numbers from 10 to 50
		
		//Getting input from user for starting and ending value
		Scanner obj = new Scanner(System.in);		
		
		System.out.println("Enter Start value ");
		int start = obj.nextInt();
		
		System.out.println("Enter End value ");
		int end = obj.nextInt();
		
		obj.close();//closing scanner class as we got the required input from user
		
		while(start <= end)
		{
			System.out.println(start);//printing the output values
			start++; // increment
		}
		}
}
