package com.taskfive;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		
		List <String> studentNames = new ArrayList<String>();
		
		Scanner userInput = new Scanner(System.in);		
		System.out.println("Enter no of students");
		int noOfStudents = userInput.nextInt();
		System.out.println("Enter the Students name");
		
		for (int i=1;i<=noOfStudents;i++) {
			
			studentNames.add(userInput.next());// Loop to get input and adding to list
		}
		
		userInput.close();
		List <String> filterNames = studentNames.stream()
				                    .filter(strList->strList.toUpperCase().startsWith("A"))//Filter the names starts with A
				                    .toList();
		
		System.out.println("The Filterd NameList is :\n" +filterNames);//output

	}

}

/*
 ---------------------output-----------------------------
Enter no of students
10
Enter the Students name
raja
abi
aravind
akash
ravi
magesh
deva
lalit
ahamed
zoro
The Filterd NameList is :
[abi, aravind, akash, ahamed]

 */
