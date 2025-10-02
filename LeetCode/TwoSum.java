// Given an array of integers, "return indices" of the two nubers such that they add up to a specific target.

// You may assusme that each input world have "exactly one" solution and you may not use the same element twice.


// EXAMPLE : 
// Given nums = [2,7,11,15], target = 9,

// Because nums[0] + nums[1] = 2+7 = 9,
// return [0,1].

import java.util.*;

public class TwoSum{

    public static int logic(int[] arr, int x){

        int[] new ;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == x){
                    new = {i,j};
                    return new;
                }
            }
        }

    }
    public static void main(String[] args){
        int[] nums = [2,7,11,15];
        int target = 9;
        int[] resultArray = logic(nums, target);
    }
}