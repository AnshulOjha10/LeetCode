class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length -1;

        boolean ans = SearchBinary(matrix, target, row, col);

        return ans;
    }


    public boolean SearchBinary(int[][] arr, int target, int row, int col){
        
        while(row < arr.length && col >=0){
            // int mid = start + (end - start) /2;

            if(arr[row][col] == target){
                return true;
            }

            if(arr[row][col] > target){
                col--;
            }else{
                row++;
            }
        }
        return false;
    }
}