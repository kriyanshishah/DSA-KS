package com.kriyanshi;

public class searchInMountain {
    public static void main(String[] args) {

    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return end+1;
    }

    static int searchInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]){
                //this  means that we are in dec part of the array.
                end = mid;
            } else {
                //this means that we are in asc part of the array
                start = mid + 1;
            }
        }
        return start;
    }

}
