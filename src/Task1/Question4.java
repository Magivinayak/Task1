package Task1;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// To find the smallest of three numbers
		
				//Getting input from user 
				Scanner obj = new Scanner(System.in);
				System.out.println("Enter a First value ");
				int firstValue = obj.nextInt();
				
				System.out.println("Enter a Second value ");
				int secondValue = obj.nextInt();
				
				System.out.println("Enter a Third value ");
				int thirdValue = obj.nextInt();
				obj.close(); //closing scanner class as we got the required input from user
				
				//checking for is smallest number 
				
				if (firstValue < secondValue && firstValue < thirdValue)//comparing first value with 2 and 3
				{
					System.out.println("The FirstValue is smaller " + firstValue);
				}
				else if (secondValue < firstValue && secondValue < thirdValue)//comparing second value with 1 and 3
				{
					System.out.println("The secondValue is Smaller " + secondValue);
				}
				else //print 3 value 
				{
					System.out.println("The ThirdValue is smaller " +thirdValue);
				}
	}

}
