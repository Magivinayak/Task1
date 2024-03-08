package com.taskfour;

import java.util.HashMap;
import java.util.Scanner;

public class Question4{
	
	
	      Scanner userInput = new Scanner(System.in);
	      HashMap <String ,Integer> hashmap = new HashMap<String ,Integer>();
	
	//add method
	public void addStudent() {
		
		try {	
			
			System.out.println("Enter number of  Students ");
			int noofStudents = userInput.nextInt() ;
			for (int i =0 ;i<noofStudents;i++) {
				System.out.println("Enter the  student Details Name and grades " +(i+1));	
				hashmap.put(userInput.next(), userInput.nextInt());
			}		
		} catch (Exception e) {
			System.out.println("Exception Occurred at addStudent");
			e.printStackTrace();

		}	
	}
	
	//remove method
	public void removeStudent() {
		
		try {
			
			System.out.println();
			System.out.println("Enter the student  Name  to remove");
			String name = userInput.next();
			hashmap.remove(name);
			System.out.println(name + " - details have been removed successfully");
			
		} catch (Exception e) {
			System.out.println("Exception Occured at removeStudent");
			e.printStackTrace();
		}
	}
	
	//display method
	public void displayStudent() {
		
		System.out.println();
		System.out.println("All Student details");
		System.out.println(hashmap);
	}
	
	
	public static void main(String[] args) {
		
		       Question4 stdObject = new Question4();//object
		       
		       stdObject.addStudent();//add details to hashmap
		       
		       stdObject.removeStudent();//remove details from hashmap
		       
		       stdObject.displayStudent();//display details of hashmap

		
	}
}

/*
----------------output-----------------------

Enter number of  Students 
4
Enter the  student Details Name and grades 1
Magesh
80
Enter the  student Details Name and grades 2
Ramesh
90
Enter the  student Details Name and grades 3
Kimura
95
Enter the  student Details Name and grades 4
Raja
65

Enter the student  Name  to remove
Ramesh
Ramesh - details have been removed successfully

All Student details
{Raja=65, Kimura=95, Magesh=80}

*/