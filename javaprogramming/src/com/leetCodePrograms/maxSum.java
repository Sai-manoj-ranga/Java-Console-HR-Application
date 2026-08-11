package com.leetCodePrograms;
public class maxSum {
	static int largest(int n) {
		int max=0;
		while(n>0) {
			int digit=n%10;
			if(digit>max) {
				max=digit;
			}
			n=n/10;	
		}
		return max;
	}
	public static int maxS(int[] nums) {
        int[] larger=new int[10];
        for(int i=0;i<10;i++){
            larger[i]=-1;
        }
        int ans=-1;
        for(int num:nums){
            int digit=largest(num);
            if(larger[digit]!=-1){
                ans=Math.max(ans,larger[digit]+num);
            }
            larger[digit]=Math.max(larger[digit],num);
        }
        return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {51,71,17,24,42};
		System.out.print(maxS(nums));
	}

}
