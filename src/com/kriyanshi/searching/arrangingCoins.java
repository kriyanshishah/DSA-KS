package com.kriyanshi;
//https://leetcode.com/problems/arranging-coins/
public class arrangingCoins {
    public static void main(String[] args) {

    }

    public int arrangeCoins(int n) {
        long start = 0;
        long end = n;
        long curr, mid;
        while(start <= end){
            mid = start + (end - start)/2;
            curr = mid *(mid+1)/2;
            if(curr == n){
                return (int)mid;
            }
            if(curr > n){
                end = mid -1;
            }else{
                start = mid + 1;
            }
        }
        return (int)end;
    }
}
