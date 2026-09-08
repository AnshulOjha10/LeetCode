import java.util.*;

class Solution {
    public int longestSubarray(int[] nums, int limit) {

        Deque<Integer> maxDeque = new ArrayDeque<>();
        Deque<Integer> minDeque = new ArrayDeque<>();

        int left = 0;
        int ans = 0;

        for (int right = 0; right < nums.length; right++) {

            // Maintain decreasing deque for maximum
            while (!maxDeque.isEmpty() &&
                   nums[maxDeque.peekLast()] <= nums[right]) {

                maxDeque.removeLast();
            }

            maxDeque.addLast(right);

            // Maintain increasing deque for minimum
            while (!minDeque.isEmpty() &&
                   nums[minDeque.peekLast()] >= nums[right]) {

                minDeque.removeLast();
            }

            minDeque.addLast(right);

            // Shrink window if invalid
            while (nums[maxDeque.peekFirst()] -
                   nums[minDeque.peekFirst()] > limit) {

                if (maxDeque.peekFirst() == left) {
                    maxDeque.removeFirst();
                }

                if (minDeque.peekFirst() == left) {
                    minDeque.removeFirst();
                }

                left++;
            }

            // Current window length
            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}