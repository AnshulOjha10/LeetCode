class Solution {
    public String removeDuplicates(String s) {
        
        Stack<Character> sc = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for(char k : s.toCharArray()){
                if(!sc.isEmpty()){
                    if(sc.peek() == k){
                        sc.pop();
                    }else{
                        sc.push(k);
                    }
                }else{
                    sc.push(k);
                }
            }
            for(char ch : sc){
                ans.append(ch);
        }
        return ans.toString();
}
}