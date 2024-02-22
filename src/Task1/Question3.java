package Task1;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TO reverse a given number
		
		//Getting input from user 
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a value ");
		int value = obj.nextInt();
		obj.close(); //closing scanner class as we got the required input from user
		
		//declaring variables
		int afterReverse = 0, remainder;
		
		while(value!=0) //if value is not equals to 0 loop will execute
		{
			remainder = value%10; // getting remainder of value by dividing 10
			afterReverse = afterReverse*10+remainder;// adding the remainder to reverse
			value/=10;// to break from loop once value is 0
		}
		System.out.println("Reversed Value : " + afterReverse);

	}

}
