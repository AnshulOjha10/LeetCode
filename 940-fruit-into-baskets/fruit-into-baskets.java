class Solution {
    public int totalFruit(int[] fruits) {
        int result = 0;
        int left = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int right = 0; right < fruits.length; right++) {

            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);

            while (map.size() > 2) {

                int c = fruits[left];

                map.put(c, map.get(c) - 1);

                if (map.get(c) == 0) {
                    map.remove(c);
                }

                left++;
            }
            result = Math.max(result, right - left + 1);
        }

        return result;

    }
}