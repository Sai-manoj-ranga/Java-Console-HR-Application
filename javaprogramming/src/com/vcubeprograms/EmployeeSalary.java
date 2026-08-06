package com.vcubeprograms;
public class EmployeeSalary {
	static String employeeName="Sai Manoj";
	double monthlySalary=140000;
	double monthlyGst;
	double monthlyPF;
	double monthlyNetSalary;
	double annualGST;
	double annualPF;
	double annualNetSalary;
	void calculateMonthlyPF() {
		monthlyPF=(monthlySalary*2)/100;
	}
	void calculateAnnualPF() {
		annualPF=monthlyPF*12;
		
	}
	void calculateMonthlyGST() {
		monthlyGst=(monthlySalary*3)/100;
		
	}
	void calculateAnnualGST() {
		annualGST=monthlyGst*12;
		
	}
	void calculateNetMonthlysalary() {
		monthlyNetSalary=monthlySalary-monthlyPF-monthlyGst;
		
	}
	void calculateAnnualNetSalary() {
		annualNetSalary=monthlyNetSalary*12;
		
	}
	void display() {
		System.out.println("   Salary receipt of MicroSoft Company");
		System.out.println("------------------------------------------");
		System.out.println("Name: "+employeeName);
		System.out.println("monthly Salary: "+monthlySalary);
		System.out.println("Monthly details: ");
		System.out.println("------------------------------------------");
		System.out.println("Monthly PF: "+monthlyPF);
		System.out.println("Monthly GST: "+monthlyGst);
		System.out.println("Monthly Net Salary: "+monthlyNetSalary);
		System.out.println("Annual Details");
		System.out.println("------------------------------------------");
		System.out.println("Annual PF: "+annualPF);
		System.out.println("Annual GST: "+annualGST);
		System.out.println("Annual Net Salary: "+annualNetSalary);
		System.out.println("            Thank you!           ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub  
		EmployeeSalary emp=new EmployeeSalary();
		emp.calculateMonthlyPF();
		emp.calculateAnnualPF();
		emp.calculateMonthlyGST();
		emp.calculateAnnualGST();
		emp.calculateNetMonthlysalary();
		emp.calculateAnnualNetSalary();
		emp.display();
	}
}
