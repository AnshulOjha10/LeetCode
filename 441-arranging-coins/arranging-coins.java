class Solution {
    public int arrangeCoins(int n) {
                int completeRows = 0; // Kitni complete rows banengi

        int row = 1; // Pehli row ke liye 1 coin chahiye

        // Jab tak coins bache hue hain aur wo current row banane ke liye kaafi hain
        while (n >= row) {
            n = n - row;     // Current row banane ke baad utne coins kam ho jayenge
            completeRows++;  // Ek row complete ho gayi
            row++;           // Agli row ke liye requirement +1
        }

        return completeRows;
    }
}