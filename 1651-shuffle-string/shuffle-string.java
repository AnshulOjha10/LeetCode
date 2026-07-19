class Solution {
    public String restoreString(String s, int[] indices) {


        int i  = 0;
        char[] arr = new char[s.length()];

        for(i=0; i < s.length(); i++){

          arr[indices[i]] = s.charAt(i);

        }

        return new String(arr);
    }
}