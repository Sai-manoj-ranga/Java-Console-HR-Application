package com.leetCodePrograms;

public class MaxminArray {
	public static void main(String[] args) {
		int arr[]= {22,33,44,1181,23,5,7,8,10};
		int n=arr.length;
		int min=arr[0];
		int max=arr[0];
		for(int i=0;i<n;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			else if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("minimum value: "+min);
		System.out.println("maximum value: "+max);

	}

}
