package com.kriyanshi;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {555,901,482,1771};
        System.out.println(digits(-287478));
//        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    //function to check wheather the number has even digits or not.
    static boolean even(int num){
        int numberOfDigits = digits(num);
//        if(numberOfDigits % 10 == 0){
//            return true;
//        }
//        return false;
        return numberOfDigits % 2 == 0;
    }

    static int digit2(int num){
        if(num < 0){
            num *= -1;
        }

        if(num == 0){
            return 1;
        }

        return (int)(Math.log10(num)) + 1;
    }

    static int digits(int num){
        if(num < 0){
            num *= -1;
        }

        if(num == 0){
            return 1;
        }
        int count = 0;
        while(num > 0){
            count++;
            num /= 10;
        }
        return count;
    }
}
