class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Character> q = new ArrayDeque<>();
        int Dcount = 0;
        int Rcount = 0;
        for (char c : senate.toCharArray()) {
            q.offer(c);

            if (c == 'R') {
                Rcount++;
            } else {
                Dcount++;
            }
        }

        int Dban = 0;
        int Rban = 0;

        while (Rcount > 0 && Dcount > 0) {

            char current = q.poll();

            if (current == 'R') {
                if (Rban > 0) {
                    Rban--;
                    Rcount--;
                } else {

                    Dban++;
                    q.offer('R');
                }

            } else {

                if (Dban > 0) {
                    Dban--;
                    Dcount--;
                } else {

                    Rban++;
                    q.offer('D');
                }
            }
        }

        return q.peek() == 'R' ? "Radiant" : "Dire";

    }
}