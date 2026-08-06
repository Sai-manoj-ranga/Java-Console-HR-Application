package com.vcubeprograms;

public class Test1 {
	//Static variables
	static int age;
	static String name;
	
	//Instance variables
	int clgno;
	String location;
	//Static block
	static {
		System.out.println("Static block");
	}
	public static void main(String[] args) throws ClassNotFoundException {
		Test1 obj=new Test1();
		System.out.println(age);
		System.out.println(name);
		System.out.println(obj.location);
		System.out.println(Class.forName("com.vcubecourseprograms.sum_of_two_numbers"));
		System.out.println(Class.forName("java.lang.System"));
		System.out.println(Class.forName("java.lang.String"));
	}
	//Instance Block
	{
		System.out.println("Instance Block");
	}
}
