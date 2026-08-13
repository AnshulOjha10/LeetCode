class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] hello = new int[2*n];
        for(int i = 0; i<n; i++){
            hello[2*i] = nums[i];
            hello[(2*i) + 1] = nums[i + n];
        }
        return hello;
    }
}