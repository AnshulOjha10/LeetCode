class Solution {
    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        StringBuilder sb = new StringBuilder(String.valueOf(x));
        String Check = sb.reverse().toString();

        return Check.equals(String.valueOf(x));
    }
}