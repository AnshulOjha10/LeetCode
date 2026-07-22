class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
        int i = 0;
        int e = nums.length-1;

        while(i < e){
            
            if(nums[i] % 2 == 1 && nums[e] % 2 == 0){
                swap(i, nums, e);
                i++;
                e--;

            }else if(nums[i] % 2 == 0){
                i++;
            }else{
                e--;
            }
        }

        return nums;
            

    }

    void swap(int i, int[] nums, int e){
        int temp = nums[e];
                    nums[e] = nums[i];
                    nums[i] = temp;
    }
}