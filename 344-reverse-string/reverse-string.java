class Solution {
    public void reverseString(char[] s) {
        int k = s.length - 1;
        search(s, 0, k);
    }

        private void search(char[] s, int start, int end){

            if(start >= end){
                return;
            }
            
            char first = s[start];
            char last = s[end];

            if(Character.toLowerCase(first) == Character.toLowerCase(last)){

                if(Character.isLowerCase(first) != Character.isLowerCase(last)){
                    s[start] = last;
                    s[end] = first;
                }
            }else{
                s[start] = last;
                s[end] = first;
                
            }

            search(s, start + 1, end -1);
    }
}