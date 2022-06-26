package org.johnwick182.arrays.challenges;

/*
https://leetcode.com/problems/two-sum/
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

*/

public class SumTwoNumbersInArray {

        public int[] twoSum(int[] nums, int target) {
            int[] ret = new int[2];

            for (int i = 0; i < nums.length; i++) {
                for (int j = i+1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        ret[0] = i;
                        ret[1] = j;
                        return ret;
                    }
                }
            }
            return null;
        }

}
