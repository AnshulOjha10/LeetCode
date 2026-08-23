class Solution {
    public String minWindow(String s, String t) {
        HashMap <Character, Integer> need = new HashMap<>();
        HashMap <Character, Integer> window = new HashMap<>();

        int minLen = Integer.MAX_VALUE;

        for(char ch : t.toCharArray()){
            need.put(ch, need.getOrDefault(ch, 0) + 1);
        }

        int required = need.size();        
        int formed = 0;
        int start = 0;

        //now here im writing sliding window concept


        int left = 0;
        for(int right = 0; right < s.length(); right++){
            char ch = s.charAt(right);

            window.put(ch, window.getOrDefault(ch, 0) + 1);

            if(need.containsKey(ch) && window.get(ch).equals(need.get(ch))){
                formed++;
            }

            //now consider that formed is now completely full
            //now we will remove the character from behind
            //but before that we will store the current length of window


            while(formed == required){
                
                if(right - left + 1 < minLen){
                minLen = right - left + 1;
                start = left;

                }
            
                char remove = s.charAt(left);

                window.put(remove, window.get(remove) - 1);

                if(need.containsKey(remove) && window.get(remove) < need.get(remove)){
                    formed--;
                }

                left++;
            }

            
            
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
        
    }
}