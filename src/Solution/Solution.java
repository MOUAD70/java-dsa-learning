package Solution;

import java.util.*;

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

    // 1. Two Sum
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numbers = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (numbers.containsKey(diff)) {
                return new int[] {numbers.get(diff), i};
            }
            numbers.put(nums[i], i);
        }
        return new int[] {0, 0};
    }

    // 1365. How Many Numbers Are Smaller Than the Current Number
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = nums.clone();
        HashMap<Integer, Integer> numbers = new HashMap<>();
        Arrays.sort(result);

        for (int i = 0; i < result.length; i++) {
            numbers.putIfAbsent(result[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            result[i] = numbers.get(nums[i]);
        }
        return result;
    }

    // 242. Valid Anagram
    public boolean isAnagram(String s, String t) {
        // MTH 1:
        // String toLowerS = s.toLowerCase();
        // String toLowerT = t.toLowerCase();

        if (s.length() != t.length()) return false;

        char[] first = s.toCharArray();
        char[] second = t.toCharArray();

        Arrays.sort(first);
        Arrays.sort(second);

        return Arrays.equals(first, second);
        // MTH 2:
        // if (s.length() != t.length()) return false;

        // int[] chars = new int[26];
        // for (int i = 0; i < s.length(); i++) {
        //     chars[s.charAt(i) - 'a']++;
        //     chars[t.charAt(i) - 'a']--;
        // }

        // for (int c : chars) {
        //     if (c != 0) {
        //         return false;
        //     }
        // }

        // return true;
    }

    // 1929. Concatenation of Array
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 * nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }

        return ans;
    }

    // 704. Binary Search
    public int search(int[] nums, int target) {
        if (nums.length == 0) return -1;

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    // Using Recursion
    public int searchRec(int[] nums, int target, int start, int end) {
        if (start > end) return -1;
        int mid = (start + end) / 2;

        if (nums[mid] == target) return mid;
        if (target > nums[mid]) return searchRec(nums, target, mid + 1, end);
        return searchRec(nums, target, start, mid - 1);
    }

    // 14. Longest Common Prefix
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }

        return prefix;
    }

    // 27. Remove Element
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;

        int valid_size = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[valid_size] = nums[i];
                valid_size++;
            }
        }

        return valid_size;
    }


}
