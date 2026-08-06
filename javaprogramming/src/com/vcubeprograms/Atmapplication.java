package com.vcubeprograms;

public class Atmapplication {
	static String bankName="SBI";
	static long accNumber=648673846432L;
	{
		accNumber++;
	}
	String name;
	int balance=50000;
	void deposit(int val) {
		balance+=val;
	}
	void withdraw(int value){
		if(balance<value) {
			System.out.println("Cannot withdraw");
		}
		else {
			System.out.println("Amount withdrawn successful: "+value);
			balance-=value;
		}
	}
	void checkBalance(){
		System.out.println("Total Amount: "+balance);
		System.out.println("-----------------------------------");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Atmapplication a=new Atmapplication();
		a.name="Uday";
		System.out.println(a.accNumber+" :=> "+a.name);
		a.deposit(1000);
		a.withdraw(100);
		a.checkBalance();
		Atmapplication b=new Atmapplication();
		b.name="Sai Manoj";
		System.out.println(b.accNumber+" :=> "+b.name);
		b.deposit(5000);
		b.withdraw(500);
		b.checkBalance();	
		
	}

}
