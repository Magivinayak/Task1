package tasktwo;

import java.util.Scanner;

//Parent class
class Persons{
	
	//instance variable
	int age ; 
	String name ;
	
	//Parent class constructor
	Persons(String name , int age){
		this.name=name;
		this.age=age;
		System.out.println("*** Base class ***");
	}
}

//child class
class Employee extends Persons{
	
	int employeeId ; int salary;
	
	//child class constructor
	    Employee(String name , int age ,int employeeId ,int salary){
		super(name,age);//Parent class constructor call using super 
		this.employeeId = employeeId;
		this.salary = salary;
		System.out.println("*** Child class ***");
	}
	void display() {
		
		System.out.println("Name : "+ name + "  Age : "+ age + "  Employee ID : "+employeeId + "  Salary : "+salary);
	}
}

//Main class
public class Question4 {

	public static void main(String[] args) {
		
		//input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your Name ");
		String name=input.nextLine();//input 
		System.out.print("Enter your Age ");
		int age = input.nextInt();
		System.out.print("Enter your Emp Id ");
		int employeeId = input.nextInt();
		System.out.print("Enter your Salary ");
		int salary = input.nextInt();
		input.close();
		System.out.println();
		//object for child class
		Employee obj = new Employee(name,age,employeeId ,salary);
		obj.display();//output

	}

}