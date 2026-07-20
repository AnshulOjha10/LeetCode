class Solution {
    public int heightChecker(int[] heights) {
        
        int count = 0;

        int arr[] = new int[heights.length];

        for(int i = 0; i <= heights.length - 1; i++){
            arr[i] = heights[i];
        }
        
        for(int i= 0; i < heights.length - 1; i++){
            for(int j = 0; j < heights.length - i - 1; j++){
                if(heights[j] > heights[j+1]){
                    int temp = heights[j+1];
                    heights[j+1] = heights[j];
                    heights[j] = temp;
                }
            }
        }

        for(int k = 0; k < heights.length; k++){
            if(arr[k] != heights[k]){
                count++;
            }
        }

        return count;
    }
}