package com.leetCodePrograms; //283
public class MoveZerostoEnd {
	static void moveZeros(int[] a) {
		int j=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				j++;
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

	public static void main(String[] args) {
		int a[]= {2,0,7,4,0,8,7,0};
		moveZeros(a);
	}

}
