package com.wisely.arith;

public class arithDemo {
    public static void main(String[] args) {
        int [] a=getNums2(new int[]{2, 7, 11, 15},9);
        System.out.println(a[0]+":"+a[1]);
    }
    //一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
    public static  int[] getNums(int [] nums,int target){
        for (int i = 0; i <nums.length ; i++) {
            for (int j = 0; j <nums.length ; j++) {
                if(nums[i]+nums[j]==target){

                    return new int[]{i,j};
                }
            }
        }
        return null;
    }


    //一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
    public static  int[] getNums2(int [] nums,int target){
        for (int i = 0; i <nums.length ; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                if(nums[j]+nums[i]==target){

                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}
