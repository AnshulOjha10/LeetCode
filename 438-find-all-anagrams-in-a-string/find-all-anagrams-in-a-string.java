class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        if (p.length() > s.length()) {
            return new ArrayList<>();
        }
        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> map = new HashMap<>();

        ArrayList<Integer> list = new ArrayList<>();

        for (char ch : p.toCharArray()) {
            need.put(ch, need.getOrDefault(ch, 0) + 1);
        }

        int k = p.length();
        int i = 0;
        int j = 0;

        while (j < k) {
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
            j++;
        }

        if (need.equals(map)) {
            list.add(i);
        }

        //agar equal nhi hai toh piche se nikalo and aage se daalo 

        while (j < s.length()) {
            //yeh nikala piche se

            char ch = s.charAt(i);

            map.put(ch, map.get(ch) - 1);
            if (map.get(ch) == 0) {
                map.remove(ch);
            }

            i++;

            //ab aage se dalenge

            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);

            if (need.equals(map)) {
                list.add(i);
            }

            j++;

        }

        return list;
    }

}