class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            // Ensure mid is even
            if (mid % 2 == 1) {
                mid--;
            }

            // If the pair is valid, move right
            if (nums[mid] == nums[mid + 1]) {
                low = mid + 2;
            } else {
                high = mid;
            }
        }

        // low will point to the single element
        return nums[low];
    }
}