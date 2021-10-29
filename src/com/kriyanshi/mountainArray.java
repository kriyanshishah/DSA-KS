package com.kriyanshi;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/

public class mountainArray {
    public static void main(String[] args) {

    }

    static int binarySearch(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]){
                if(arr[mid] > arr[mid - 1]) return arr[mid];// checking from the descending part of the array
                else {
                    end = mid;
                }
            } else if(arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }
        }
        return -1;
    }
}
