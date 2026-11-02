import Solution.Solution;


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
        int[] nums = {3, 0, 1, 5};
        System.out.println(solution.findDisappearedNumbers(nums));

    }
}