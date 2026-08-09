package com.leetCodePrograms;

import java.util.Arrays;
import java.util.HashSet;

public class UnionofTwoArrays {
	static void union(int[] num1,int[] num2) {
		HashSet<Integer>set=new HashSet<>();
		for(int i=0;i<num1.length;i++) {
			set.add(num1[i]);
		}
		for(int i=0;i<num2.length;i++) {
			set.add(num2[i]);
		}	
		for(int num:set) {
			System.out.print(num+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num1= {1,2,3,4,5,6};
		int[] num2= {2,7,8,9,10,99,3,4,5,7};
		union(num1,num2);
	}

}
