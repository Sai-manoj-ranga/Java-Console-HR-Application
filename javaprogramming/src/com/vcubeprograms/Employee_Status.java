/*This Java program, Employee_Status, is designed to manage and display an employee's details and 
update their designation, salary, and work location based on their promoted designation.

The program demonstrates important Java concepts such as classes, objects, instance variables, static variables, static blocks, methods, conditional statements, and user input using Scanner.

Key Features
Employee Details
Stores employee name, employee ID, designation, department, salary, and location.
The EmployeeDetails() method displays all employee information.

Company Details
compName and compLoc are static variables because they are common to all employees.
A static block displays the company name and location when the class is loaded.

Employee Promotion
The promoteEmployee() method changes the employee's current designation to the newly entered designation.

Salary Update
The updateSalary() method uses if-else-if conditions to assign a salary according to the promoted designation.
Different designations such as Analyst, Developer, DevOps Engineer, Cloud Engineer, Java Developer, and Python Developer have different salary values.

Location Update
The updateEmpLoc() method changes the employee's location based on their new designation.
For example, an Analyst is assigned to Bangalore, a Developer to Chennai, and a Cloud Engineer to Goa. */
package com.vcubeprograms;
import java.util.Scanner;

public class Employee_Status {
	String empName;
	String empId;
	String designation;
	String dept;
	double salary;
	String remoteLoc;
	String promotedes;
	static String compName="SunTech Solutions";
	static String compLoc="Hi-Tech City";
	static {
		System.out.println("--------"+compName+"--------");
		System.out.println("Location: "+compLoc);
	}
	void EmployeeDetails() {
		System.out.println("");
		System.out.println("Employee Name: "+empName);
		System.out.println("Employee Id: "+empId);
		System.out.println("Designation: "+designation);
		System.out.println("Department: "+dept);
		System.out.println("Salary: "+salary);
		System.out.println("Remote Loc: "+remoteLoc);
	}
	void promoteEmployee() {
		designation=promotedes;
		
	}
	void updateSalary() {
		if(promotedes.equals("Analyst")) {
			salary=60000;
		}
		else if(promotedes.equals("Developer")) {
			salary=65000;
		}
		else if(promotedes.equals("Devops Engineer")) {
			salary=80000;
		}
		else if(promotedes.equals("Cloud Engineer")) {
			salary=90000;
		}
		else if(promotedes.equals("Graduate Trainee")) {
			salary=35000;
		}
		else if(promotedes.equals("Software Engineer")) {
			salary=75000;
		}
		else if(promotedes.equals("Java Developer")) {
			salary=100000;
		}
		else if(promotedes.equals("Python Developer")) {
			salary=40000;
		}
		else {
			salary+=5000;
		}
	}
	void updateEmpLoc() {
		if(promotedes.equals("Analyst")) {
			remoteLoc="Banglore";
		}
		else if(promotedes.equals("Developer")) {
			remoteLoc="Chennai";
		}
		else if(promotedes.equals("Devops Engineer")) {
			remoteLoc="Hydreabad";
		}
		else if(promotedes.equals("Cloud Engineer")) {
			remoteLoc="Goa";
		}
		else if(promotedes.equals("Graduate Trainee")) {
			remoteLoc="Pune";
		}
		else if(promotedes.equals("Software Engineer")) {
			remoteLoc="Pune";
		}
		else if(promotedes.equals("Java Developer")) {
			remoteLoc="Madras";
		}
		else if(promotedes.equals("Python Developer")) {
			remoteLoc="Nellore";
		}
		else {
			remoteLoc="Nandyal";
		}
	}
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee_Status e=new Employee_Status();
		System.out.print("Enter Employee name:");
		e.empName=sc.nextLine();
		System.out.print("Enter employee id: ");
		e.empId=sc.nextLine();
		System.out.print("Enter the department: ");
		e.dept=sc.nextLine();
		System.out.print("Enter the role: ");
		e.designation=sc.nextLine();
		System.out.print("Enter the Salary: ");
		e.salary=sc.nextDouble();
		System.out.print("Employee Location: ");
		e.remoteLoc=sc.next();
		sc.nextLine();
		System.out.println();
		System.out.print("Promoted role: ");
		e.promotedes=sc.nextLine();
		e.EmployeeDetails();
		e.promoteEmployee();
		e.updateSalary();
		e.updateEmpLoc();
		e.EmployeeDetails();
	}

}
