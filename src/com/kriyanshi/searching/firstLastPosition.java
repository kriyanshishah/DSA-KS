package com.kriyanshi;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

public class firstLastPosition {
    public static void main(String[] args) {

    }

    static int[] searchRange(int[] arr, int target) {
        int[] position = new int[2];
        position[0] = find(arr, target, true);
        if(position[0] != -1){
            position[1] = find(arr, target, false);
        }
        return position;
    }

     static int find(int[] arr, int target, boolean doLeft){
        int start = 0;
        int end = arr.length - 1;
        int index = -1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > target){
                end = mid - 1;
            }else if(arr[mid] < target){
                start = end + 1;
            }else {
                index = mid;
                if(doLeft){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return index;
    }
}
