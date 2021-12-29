package com.kriyanshi;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/
//https://leetcode.com/problems/find-a-peak-element-ii/

public class mountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4,3,2,1,0};
        int ans = searchInMountainArray(arr);
    }

    static int searchInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]){
                    end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
