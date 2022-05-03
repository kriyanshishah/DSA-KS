package com.kriyanshi;
// https://leetcode.com/problems/richest-customer-wealth/
public class richestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(accounts));
    }
    static int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for(int[] i : accounts){
            int total = totalOfUser(i);
            if(max < total){
                max = total;
            }
        }
        return max;
    }
    static int totalOfUser(int[] account){
        int sum = 0;
        for(int i : account){
            sum += i;
        }
        return sum;
    }
}
