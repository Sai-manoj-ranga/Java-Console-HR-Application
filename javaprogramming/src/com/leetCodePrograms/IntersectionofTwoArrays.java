package com.leetCodePrograms;   //349

import java.util.HashSet;

public class IntersectionofTwoArrays {
	static void intersection(int[] num1,int[] num2) {
		HashSet<Integer>set=new HashSet<>();
		int n1=num1.length;
		int n2=num2.length;
		if(n1>=n2) {
			for(int i=0;i<n1;i++) {
				for(int j=0;j<n2;j++) {
					if(num1[i]==num2[j]) {
						set.add(num1[i]);
					}
				}
			}
		}
		else {
			for(int i=0;i<n2;i++) {
				for(int j=0;j<n1;j++) {
					if(num2[i]==num1[j]) {
						set.add(num2[i]);
					}
				}
			}
		}
		int[] res=new int[set.size()];
		int i=0;
		for(int num:set) {
			res[i++]=num;
		}
		for(int nums:res) {
			System.out.print(nums+" ");
		}
	}

	public static void main(String[] args) {
		int[] num1= {2,3,4,5,6,7,8,99,11,66};
		int[] num2= {3,4,8,9,5,11,87,66,9};
		intersection(num1,num2);
	}

}
