package com.kriyanshi;
//https://leetcode.com/problems/search-in-rotated-sorted-array/

public class searchInRotated {
    public static void main(String[] args) {
        int[] arr = {};
    }

    public int search(int[] arr, int target){
        int pivot = searchPivot(arr);
        //if you did not find the pivot then the array is not rotated
        if(pivot == -1){
            //just do normal binary search.
            return binarySearch(arr, target, 0, arr.length - 1);
        }
        //if pivot is found, you have 2 asc arrays.
        if(arr[pivot] == target){
            return pivot;
        }else if(target < arr[0]){
            return binarySearch(arr, target, 0, pivot - 1);
        }
        return binarySearch(arr, target, pivot + 1, arr.length - 1);
    }

    public int binarySearch(int[] arr, int target, int start, int end){
        //just do normal binary search.
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target == arr[mid]){
                return mid;
            }else if(target < arr[mid]){
                end = mid - 1;
            }else{
                start = end + 1;
            }
        }
        return -1;
    }
    //this will not work with duplicate values
    static int searchPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(mid < end && arr[mid] >arr[mid + 1]){
                return mid;
            } if(arr[mid] < arr[mid - 1] && mid > start){
                return mid - 1;
            } if(arr[mid] <= start){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
    //For duplicate elements.
    static int searchPivotWithDuplicateValues(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(mid < end && arr[mid] >arr[mid + 1]){
                return mid;
            } if(arr[mid] < arr[mid - 1] && mid > start){
                return mid - 1;
            }
            //if middle, end and start is duplicate then we can simply skip them
            if(arr[start] == arr[mid] && arr[end] == arr[mid]){
                if(arr[start] > arr[start + 1]){
                    return start;
                }
                start++;
                if(arr[end] > arr[end - 1]){
                    return end;
                }
                end--;
            }
            if(arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }

}
