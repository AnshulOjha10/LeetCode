class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        return Search(start, end, target, numbers);
    }

    public int[] Search(int start, int end, int target, int[] nums) {
        while (start < end) {
            int TotalSum = nums[start] + nums[end];

            if (TotalSum == target) {
                return new int[]{start + 1, end + 1};  // 1-indexed answer
            }

            if (TotalSum > target) {
                end--;  // move right pointer left
            } else {
                start++;  // move left pointer right
            }
        }

        return new int[]{-1, -1}; // should never reach if one solution exists
    }
}