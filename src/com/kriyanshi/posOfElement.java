package com.kriyanshi;
//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

public class posOfElement {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        int ans = findingRange(arr, target);
        System.out.println(ans);
    }

    static int findingRange(int[] arr, int target){
        // first find the range
        // first start with a box of size 2
        int start = 0;
        int end = 1;
        //condition of the target to lie in the range
        while(target > arr[end]){
            int newStart = end + 1;
            end = end + 2 * (end - start + 1);
            start = newStart;
        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        while(start < end){
            int mid = start + (end - start) / 2;
            if(target > arr[mid]){
                start = mid + 1;
            } else if(target < arr[mid]){
                end = mid - 1;
            } else{
                return mid;
            }
        }
        return -1;
    }
}
