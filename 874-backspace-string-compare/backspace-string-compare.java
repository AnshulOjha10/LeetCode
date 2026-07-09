class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> w = new Stack<>();
        StringBuilder sb = new StringBuilder();
        StringBuilder sd = new StringBuilder();

        for (char k : s.toCharArray()) {

            if (k != '#') {
                w.push(k);
                sb.append(k);
            }

            if (!w.isEmpty() && k == '#') {
                w.pop();
                sb.deleteCharAt(sb.length() - 1);
            }

        }

        w.clear();

        for (char k : t.toCharArray()) {

            if ( k != '#') {
                w.push(k);
                sd.append(k);
            }

            if (!w.isEmpty() && k == '#') {
                w.pop();
                sd.deleteCharAt(sd.length() - 1);
            }

        }

        return sb.toString().equals(sd.toString());
    }
}