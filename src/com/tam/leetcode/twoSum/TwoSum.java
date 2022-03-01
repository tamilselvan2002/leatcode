package com.tam.leetcode.twoSum;

public class TwoSum {
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.twoSum(new int[]{1, 2, 3,}, 5);
    }

}

class Solution {
    public int[] twoSum(int[] nums, int target) {


        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if( nums[i]+nums[j]==target){
                    //System.out.println("("+nums[i]+","+nums[j]+"+)="+(nums[i]+nums[j]));
                    return  new int[] {nums[i],nums[j]} ;
                }
            }
        }
        return nums;
    }
}

