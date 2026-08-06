package com.vcubeprograms;

public class TestDemo1 {
	static TestDemo1 t=new TestDemo1();
	static void add(int a,int b){
		System.out.println("Addition"+(a+b));
		sub(a,b);
	}
	static void sub(int a,int b){
		System.out.println(a-b);
		t.multiply(a,b);
	}
	void multiply(int a,int b){
		System.out.println(a*b);
		divide(a,b);
	}
	void divide(int a,int b){
		System.out.println(a/b);
		percentile(a,b);
	}
	void percentile(int a,int b){
		System.out.println(a%b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Arithmetic operations");
		int a=11;
		int b=22;
		add(a,b);
		System.out.println("-------------------------");
		System.out.println("Operations done Successfully");
	}

}
