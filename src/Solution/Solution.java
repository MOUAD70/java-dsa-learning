package Solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Solution {

    // 217. Contains Duplicate
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numbers = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (numbers.contains(nums[i])) return true;
            numbers.add(nums[i]);
        }
        return false;
    }

    // 268. Missing Number
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int rangeSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int i = 0; i < n; i++) {
            actualSum += nums[i];
        }
        return rangeSum - actualSum;
    }

    // 448. Find All Numbers Disappeared in an Array
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> numbers = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            numbers.add(nums[i]);
        }

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i <= nums.length; i++) {
            if (!numbers.contains(i)) {
                result.add(i);
            }
        }

        return result;
    }
}
