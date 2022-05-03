package com.kriyanshi;

public class splitArrayLargeSum {
    public static void main(String[] args) {
        int[] arr = {7,2,5,10, 8};
    }

    public int splitArray(int[] arr, int m){
        int start = 0;
        int end = 0;
        for(int i =0; i<arr.length;i++){
            start = Math.max(start, arr[i]);
            end += arr[i];
        }

        //binary search
        while(start < end){
            int mid = start + (end - start)/2;
            //try for the middle as a potential answer
            int sum = 0;
            int pieces = 1;
            for(int num : arr){
                if(sum + num > mid){
                    //you can not add this in this sub-array
                    //
                    sum = num;
                    pieces++;
                }else{
                    sum += num;
                }
            }
            if(pieces > m){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return end;
    }

}
