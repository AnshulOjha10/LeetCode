class Solution {
    public void reverseString(char[] s) {
        reverse(s, 0, s.length-1);
    }

    public void reverse(char[] arr, int start, int end){

        //base condition

        if(start >= end){
            return;
        }

        char temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

         reverse(arr, start + 1, end - 1);
    }
}