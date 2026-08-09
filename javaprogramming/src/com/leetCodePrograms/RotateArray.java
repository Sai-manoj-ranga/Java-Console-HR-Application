package com.leetCodePrograms;
import java.util.*;
public class RotateArray {
	//With creating a new array
	public static void rotates(int[] aa,int ke) {
		int size=aa.length;
		ke=ke%size;
		int[] tem=new int[size];
		for(int i=0;i<size;i++) {
			tem[(i+ke)%size]=aa[i];
		}
		for(int i=0;i<size;i++) {
			aa[i]=tem[i];
		}
	}
	//optimized way without creating new array
	public static void reverse(int[] a,int s,int e) {
		while(s<e) {
			int temp=a[s];
			a[s]=a[e];
			a[e]=temp;
			s++;
			e--;
		}
	}
	public static void rotate(int[] arr,int k) {
		int n=arr.length;
		k=k%n;
		reverse(arr,0,n-1); //Reverse entire Array
		reverse(arr,0,k-1); //Reverse first k elements
		reverse(arr,k,n-1); //Reverse remaining elements
		
	}

	public static void main(String[] args) {
		int[] arr= {9,8,7,6,5,4,3,2,1};
		int k=8;
		// for optimized approach
		rotate(arr,k);
		for(int num:arr) {
			System.out.print(num+" ");			
		}
		//Easy way approach
		rotates(arr,k);
		System.out.println(Arrays.toString(arr));
	}

}
