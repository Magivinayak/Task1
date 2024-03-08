package com.taskfour;

import java.util.Scanner;


@SuppressWarnings("serial")
class UserDefinedException extends Exception{
	
	public UserDefinedException(String message) {
		super(message);
	}
}

class Voter{
	
	private int voterID;
	private String name;
	private int age;
	
	public Voter(int voterID, String name, int age) {
		super();
		this.voterID = voterID;
		this.name = name;
		this.age = age;
	}
	
	public void voting()throws UserDefinedException{

			if (age>=18) {				
				System.out.println("Voter eligible : " + "Name -" +name +" ID" + voterID);
			}
			else {
				throw new UserDefinedException("Invalid age for Voter");
			}
		}
}

public class Question2 {

	public static void main(String[] args) {

			Scanner userInput = new Scanner(System.in);
			System.out.println("Enter voter ID , Name and Age");
			int voterId=userInput.nextInt();
			String name = userInput.next();
			int age = userInput.nextInt();
			
			//object
			Voter vote = new Voter(voterId , name ,age );
			
			try {
				
				vote.voting();
				
			} catch (UserDefinedException e) {
				
				System.out.println(e.getMessage());
			}
			
			userInput.close();
	}
}

/*
 ----------------------------output--------------------------------------
 
 Enter voter ID , Name and Age
12354
Magesh
17
Invalid age for Voter


*/

