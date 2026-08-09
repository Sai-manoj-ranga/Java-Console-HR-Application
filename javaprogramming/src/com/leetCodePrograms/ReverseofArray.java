package com.leetCodePrograms;

import java.util.Arrays;

public class ReverseofArray {
	//target sum along with reverse 2 codes
	public static void targetSum(int[] arr,int target) {
		int low=0,right=arr.length-1;
		boolean status=false;
		while(low<right) {
			int sum=arr[low]+arr[right];
			if(sum==target) {
				System.out.println(arr[low]+"  +  "+arr[right]+"  =>>  "+sum);
				status=true;
				low++;
				right--;
			}
			else if(sum<target){
				low++;
			}
			else {
				right--;
			}
		}
		if(!status) {
			System.out.println("Target not found !!!!");
		}
	}

	public static void main(String[] args) {
		//Using two pointer approach
		int a[]= {1,2,3,4,5,6,7,8,9};
		int target=13;
		int n=a.length;
		int l=0,r=n-1;
		while(l<r) {
			int temp=a[l];
			a[l]=a[r];
			a[r]=temp;
			l++;
			r--;
		}
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		targetSum(a,target);
	}

}
