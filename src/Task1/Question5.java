package Task1;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// to give discount based on amount value
		
		//Getting total value from user 
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the total puchase amount ");
		int price = obj.nextInt();
		obj.close(); //closing scanner class as we got the required input from user
		
		int finalPrice;
		//checking the price range
		
		if (price<500)//less than 500
		{
			System.out.println("No discount applied " + price);
		}
		else if (price > 1000)//greater than 1000
		{
			finalPrice = price - price/20; 
			System.out.println(" 20% discount applied " +finalPrice);
		}
		else //between 500 to 1000
		{
			finalPrice = price - price/10 ;			
			System.out.println("10% discount applied " + finalPrice);
		}

	}

}
