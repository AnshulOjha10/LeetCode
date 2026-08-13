class Solution {
    public int mySqrt(int x) {
       if(x<2) return x;  //w.k.t sqrt(0)=0 and sqrt(1)=1 .
        //BS
       int low=1,high=x,ans=0;
        while(low<=high)
        {
            int  mid=low+(high-low)/2;
             if (mid <= x / mid) {
                ans = mid;     // save the result
                low = mid + 1; // move right
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
}