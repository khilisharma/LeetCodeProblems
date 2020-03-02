package main.java;

/*
 *  Leetcode - 1. TwoSum
 *
 *  Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *  You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 *  Example:
 *
 *  Given nums = [2, 7, 11, 15], target = 9,
 *
 *  Because nums[0] + nums[1] = 2 + 7 = 9,
 *  return [0, 1].
 */

import java.util.HashMap;
import java.util.Map;

public final class TwoSum {
  public static int[] solution(final int[] nums, final int target) {
    if (nums.length == 0) {
      return new int[1];
    }
    Map<Integer, Integer> indexMap = new HashMap<>();

    for (int index = 0; index < nums.length; index++) {
      indexMap.put(target - nums[index], index);
    }

    for (int index = 0; index < nums.length; index++) {
      if (indexMap.containsKey(nums[index]) && indexMap.get(nums[index]) != index) {
        return new int[] {index, indexMap.get(nums[index])};
      }
    }

    return new int[1];
  }
}
