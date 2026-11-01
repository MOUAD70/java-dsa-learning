package Solution;

import java.util.HashSet;

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

        for (int i = 0; i < nums.length; i++) {
            actualSum += nums[i];
        }
        return rangeSum - actualSum;
    }
}
