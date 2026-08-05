class Solution {

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u';
    }

    public int maxVowels(String s, int k) {
        int count = 0;
        int maxLen = 0;

        for(int i = 0; i < k; i++){

            if(isVowel(s.charAt(i))){
                count++;
            }
        }

        maxLen = count;

        for(int i = 1; i < s.length() - k + 1; i++){

            if(isVowel(s.charAt(i-1))){
                count--;
            }

            if(isVowel(s.charAt(i + k - 1))){
                count++;
            }

            maxLen = Math.max(maxLen, count);
        }


        return maxLen;
    }
}