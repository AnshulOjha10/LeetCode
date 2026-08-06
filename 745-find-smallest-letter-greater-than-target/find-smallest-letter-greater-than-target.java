class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length -1;
        char ans = Search(start, end, letters, target);

        return ans;
    }

    public char Search (int start, int end, char[] arr, char target){
        while(end >= start){
            int mid = start + (end -start) /2;
            if(arr[mid] > target){
                end = mid -1;
            }else{
                start = mid +1;
            }
        }

        return arr[start % arr.length];
    }
}