package com.taskthree;

import java.util.Scanner;


public class DriverMain{
		
		public static void main(String[] args) {
			
			Scanner userInput = new Scanner(System.in);
			
			//Employee class object
			System.out.println("Enter Employee Details ID,Name,Salary");
			int empId = userInput.nextInt();
			String empName = userInput.next();
			double empSalary = userInput.nextDouble();
			
			Employee empObject = new Employee(empId,empName,empSalary);
			empObject.calTax();
			
			
			//Product class object
			System.out.println();
			System.out.println("Enter Product Details ID,Price,Quantity");
			int prdId = userInput.nextInt();
			double prdPrice = userInput.nextDouble();
			int prdQuantity = userInput.nextInt();
			
			Product productObject = new Product(prdId ,prdPrice,prdQuantity );
			productObject.calTax();
			
			userInput.close();
			
		}
	}


/*

------------------------------------output--------------------------------------

Enter Employee Details ID,Name,Salary
23564
Magesh
560000
Employee ID : 23564 Name : Magesh Salary : 560000.0
Yearly Income Tax is : 58800.0

Enter Product Details ID,Price,Quantity
101
562.3
3
ProductID : 101 ProductPrice : 562.3 ProductQuantity : 3
Product Sales Tax is : 13.120333333333333

*/