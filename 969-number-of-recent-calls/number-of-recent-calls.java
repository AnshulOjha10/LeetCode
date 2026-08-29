class RecentCounter {

    Queue <Integer> que;

    public RecentCounter() {
        que = new ArrayDeque<>();

    }
    
    public int ping(int t) {
        
        que.offer(t);
        int margin = t - 3000;

        while(que.size() != 0 && que.peek() < margin){
            que.poll();
        }

        return que.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */