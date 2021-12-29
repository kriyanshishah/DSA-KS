package com.kriyanshi;
//https://leetcode.com/problems/concatenation-of-array/submissions/
public class concatenationArray {
    public static void main(String[] args) {

    }

    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];
        for(int i =0 ; i<2*n; i++){
            ans[i] = nums[i % n];
        }
        return ans;
    }
}
