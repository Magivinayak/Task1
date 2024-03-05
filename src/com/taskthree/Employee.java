package com.taskthree;



class Employee implements Taxable{
	private int empId;
	private String empName;
	private double empSalary;
	
	
	
	//Constructor
	public Employee(int empId, String empName, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		
	}


	//tax calculate
	public void calTax() {
		
		double yearlyTax= empSalary *(incomeTax/100);
		System.out.println("Employee ID : "+empId + " Name : "+empName + " Salary : "+empSalary);
		System.out.println("Yearly Income Tax is : " +yearlyTax );
		
	}
}
