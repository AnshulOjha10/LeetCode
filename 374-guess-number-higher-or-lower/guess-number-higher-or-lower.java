public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int start = 1;
        int end = n;
        int mid  = start + (end - start) / 2;
        int answer = guess(mid);

        int result = BinarySearch(start, end, mid, answer);
        System.out.print(result);

        return result; // Don't forget to return the result
    }

    public int BinarySearch(int start, int end, int mid, int answer) {
        while(start <= end){
            if(answer == 0){
                return mid;
            } else if(answer == -1){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = start + (end - start) / 2;
            answer = guess(mid); // update answer each time
        }
        return -1;
    }
}