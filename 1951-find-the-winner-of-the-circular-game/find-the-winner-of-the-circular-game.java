class Solution {
    public int findTheWinner(int n, int k) {
        return findTheIndex(n ,k) + 1;
    }

    public int findTheIndex(int n, int k){
        if(n==1){
            return 0; //yeh index hai jitne wle ka kyuki obv jitne wla 0 index pe hi hoga kyuki wo akhri bacha hai
        }

        int index = findTheIndex(n-1, k);
        index = (index + k) % n;
        // 
        return index;
    }
}