package taskone;

import java.util.Scanner;

public class QuestionFive {

	public static void main(String[] args) {
		// to give discount based on amount value
		
		//Getting total value from user 
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the total puchase amount ");
		double purchaseValue = obj.nextDouble();//input 
		obj.close(); //closing scanner class as we got the required input from user
		
		double finalPrice;
		
		//checking the price range	
		
		if (purchaseValue < 500)//less than 500
		{
			System.out.println("No discount applied   - 0");
			System.out.println("Final payable amount  -" + purchaseValue);
		}
		else if (purchaseValue > 1000)//greater than 1000
		{
			 
			double discountValue = purchaseValue*0.20; // 20% value
			finalPrice = purchaseValue - discountValue; // calculating final amount
			
			System.out.println(" 20% discount applied  - " + discountValue);
			System.out.println(" Final payable amount  -" + finalPrice);
		}
		else //between 500 to 1000
		{
			
			double discountValue = purchaseValue*0.10;// 10% value
			finalPrice = purchaseValue - discountValue;// calculating final amount
			
			System.out.println(" 10% discount applied  - " + discountValue);
			System.out.println(" Final payable amount  -" + finalPrice);
		}

	}

}
