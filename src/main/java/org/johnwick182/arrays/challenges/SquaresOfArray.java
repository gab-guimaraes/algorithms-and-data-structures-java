package org.johnwick182.arrays.challenges;

//https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3240/

/*
Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
 */


import java.util.Arrays;

public class SquaresOfArray {
    public int[] sortedSquares(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        Arrays.sort(nums);
        return nums;

    }
}
