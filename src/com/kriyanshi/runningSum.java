package com.kriyanshi;
//https://leetcode.com/problems/running-sum-of-1d-array/submissions/
public class runningSum {
    public static void main(String[] args) {

    }
    public int[] runningSum(int[] nums) {
        int sum = 0;
        for(int i =0;i<nums.length; i++){
            sum += nums[i];
            nums[i] = sum;
        }
        return nums;
    }
}
