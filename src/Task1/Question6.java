package Task1;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// To print given pattern
		
		
		//Getting total value from user 
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the rows and column ");
		int noofRowsandColumns = obj.nextInt();
		obj.close(); //closing scanner class as we got the required input from user
		
		//declaring the output variable
		int finalValue = 0;
				
				
		for(int row = noofRowsandColumns; row > 0; --row)//row for loop
		{
			for(int column = noofRowsandColumns; column > 0; --column) // column for loop
			{
				finalValue = row > column ? row : column; // checking the value needs to be printed
				
				System.out.print("  " + finalValue);	
			}
			
			System.out.println();
			
		}
}
}
