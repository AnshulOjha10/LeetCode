class Solution {
    public int[] getConcatenation(int[] nums) {

        int f = nums.length * 2;
        int n = nums.length ;

        int[] arr = new int[f];

        for(int i = 0; i < n; i++ ){
            arr[i] = nums[i];
            arr[i + f - n] = nums[i];
        }

        return arr;
    }
}