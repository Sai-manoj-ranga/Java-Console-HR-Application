package com.vcubeprograms;

import java.util.Scanner;

public class ShoppingCart {
	int items;
	double totalAmount=0;
	static String website="Mytri buy";
	boolean orderPlaced;
	
	void addItem() {
		if(items==0) {
			System.out.println("No items added");
		}
		for(int i=0;i<items;i++) {
			if(items<=10) {
				totalAmount+=25.25;
			}
			else {
				totalAmount+=22;
			}
		}
	}
	
	void placeOrder() {
		if(orderPlaced) {
			System.out.println("Order with items "+items+" is placed successfully");
			System.out.println("Amount credited: "+totalAmount);
		}
		else {
			System.out.println("Order still in the cart not placed successfully");
		}
	}
	void displayCart() {
		if(items<=10) {
			System.out.println("No of items: "+items);
			System.out.println("Total amount: "+totalAmount);
			System.out.println("Is order place: "+orderPlaced);
			System.out.println("Discount not added");
		}
		else {
			System.out.println("No of items: "+items);
			System.out.println("Total amount: "+totalAmount);
			System.out.println("Is order place: "+orderPlaced);
			System.out.println("Discount added");
		}
	}
	static void changeWebsite() {
		website="Budget Market ";
	}
	static void displayWebsite() {
		System.out.println("website name : "+website);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ShoppingCart sp=new ShoppingCart();
		sp.items=sc.nextInt();
		displayWebsite();
		sp.orderPlaced=true;
		sp.addItem();
		sp.displayCart();
		sp.placeOrder();	
		System.out.println("--------------------------------------");
		ShoppingCart sp1=new ShoppingCart();
		sp.items=sc.nextInt();
		changeWebsite();
		displayWebsite();
		sp.orderPlaced=false;
		sp.addItem();
		sp.displayCart();
		sp.placeOrder();	
	}

}
