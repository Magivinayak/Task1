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
	
	public Voter(int voterID, String name, int age)throws UserDefinedException {
		super();
		this.voterID = voterID;
		this.name = name;
		if (age>=18) {		
			this.age = age;
		}
		else {
			throw new UserDefinedException("Invalid age for Voter -"+" Voter not eligible -->" + " Name: " +name +" ID: " + voterID +" Age: "+age);
		}
	}
	
	public void display() {
		
		System.out.println ("Voter eligible : " + "Name -" +name +" ID" + voterID +"Age : "+age);
		 
	}
}


public class Question2 {
	
	public static void main(String[] args) {

		
			Scanner userInput = new Scanner(System.in);
			System.out.println("Enter voter ID , Name and Age");
			int voterId=userInput.nextInt();
			String name = userInput.next();
			int age = userInput.nextInt();
			try {
			//object	
			Voter vote = new Voter(voterId , name ,age );
			vote.display();
			
			} catch (UserDefinedException e) {
				System.out.println(e.getMessage());
			}
			userInput.close();
	}
}

/*
 ----------------------------output--------------------------------------
 
Enter voter ID , Name and Age
657912348
Magesh
17
Invalid age for Voter - Voter not eligible --> Name: Magesh ID: 657912348 Age: 17

*/
