class Solution {
    public long maxSum(int[] nums, int k, int mul) {

        int n = nums.length;
        long totalSum = 0;

        Arrays.sort(nums);

        
        for(int i = n-1; i >= n-k; i--){
            int a = nums[i];
            if(mul != 0){
            long multiply = (1L* a * mul);
            totalSum += multiply;
            mul--;
            }else{
                totalSum += a;
            }
            
        }

        return totalSum;
    }
}