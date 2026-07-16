class Solution {
    public int fib(int n) {
        
        return search(n);
        
    }

    private int search(int n){
        
        if(n < 2){
            return n;
        }

         return search(n-1) + search(n-2);
    }
}