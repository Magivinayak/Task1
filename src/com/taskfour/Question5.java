package com.taskfour;

import java.util.Scanner;
import java.util.Stack;

public class Question5 {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		Stack<Integer> stackObj = new Stack<Integer>();
		
		System.out.println("enter any 6 integer values");
		for (int i =0 ;i<6;i++) {
		    stackObj.push(userInput.nextInt());
	     }
		
		//all elements
		System.out.println("All Elements " +stackObj);
		
		System.out.println();
		//pop element
		System.out.println("Element Pop : " +stackObj.pop());
		
		System.out.println();
		//is empty check
		boolean emptyCheck = stackObj.isEmpty();
		System.out.println("Is Stack Empty ? " + emptyCheck);
		
		userInput.close();
	}

}

/*
 -------------------output--------------------------------
 enter any 6 integer values
7
6
3
1
9
5
All Elements [7, 6, 3, 1, 9, 5]

Element Pop : 5

Is Stack Empty ? false
 
 */
