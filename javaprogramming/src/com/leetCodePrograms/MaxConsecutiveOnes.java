package com.leetCodePrograms;

public class MaxConsecutiveOnes {
	static int maxOnes(int[] a) {
		int count=0;
		int max=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==1) {
				count++;
			}
			else if(a[i]!=1) {
				count=0;
			}
			max=Math.max(max,count);
		}
		return max;
	}
	

	public static void main(String[] args) {
		int a[]= {1,1,0,1,1,1,1,1};
		System.out.println(maxOnes(a));
	}

}
