class Solution {
    public boolean isValid(String s) {
        Stack<Character> sc = new Stack<>();

        for (char a : s.toCharArray()) {

            if (a == '(' || a == '{' || a == '[') {
                sc.push(a);

            } else if (sc.isEmpty()) {
                    return false;
                }

            else{
                char top = sc.pop();
                if (a == '}' && top == '{' || a == ')' && top == '(' || a == ']' && top == '[') {
                    continue;
                }else{
                    return false;
                }
            }
        }

        return sc.isEmpty();
    }
}