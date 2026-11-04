import Solution.Solution;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // 217. Contains Duplicate
        // int[] nums = {1, 2, 3, 1};
        // System.out.println(solution.containsDuplicate(nums));

        // 268. Missing Number
        // int[] nums = {3, 0, 1};
        // System.out.println(solution.missingNumber(nums));

        // 448. Find All Numbers Disappeared in an Array
        // int[] nums = {3, 0, 1, 5};
        // System.out.println(solution.findDisappearedNumbers(nums));

        // 1. Two Sum
        // int[] nums = {1, 2, 3};
        // int target = 3;
        //System.out.println(Arrays.toString(solution.twoSum(nums, target)));

        // 1365. How Many Numbers Are Smaller Than the Current Number
        // int[] nums = {8, 1, 2, 2, 3};
        // System.out.println(Arrays.toString(solution.smallerNumbersThanCurrent(nums)));

        // 242. Valid Anagram
        String s = "mouad";
        String t = "admou";

        System.out.println(solution.isAnagram(s, t));

    }
}