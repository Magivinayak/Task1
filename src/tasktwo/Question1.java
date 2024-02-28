package tasktwo;

import java.util.Scanner;

class Person{
	
	//instance variable
	int age  ; String name;
	
	//constructor
	Person(String name , int age){
		this.name = name;
		this.age = age;
	}
	//instance method
	void display() {
		System.out.println("Name : "+ name + "  Age : "+age);
	}
}

public class Question1 {

	public static void main(String[] args) {
		
		//input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your Name ");
		String name = input.nextLine();//input 
		input.close();
		
		//object
		Person obj = new Person(name ,18);
		obj.display();// default age 18 and method call using object

	}

}
