class Solution {
    public int countStudents(int[] students, int[] sandwiches) {

        if(students.length == 0){
            return 0;
        }

        
        Queue <Integer> q = new ArrayDeque<>();

        for( int a : students){
            q.offer(a);
        }

        int Size = q.size();
        int i = 0;
        int counter = 0;

        while( i < students.length){
            
            if(sandwiches[i] == q.peek()){
                q.poll();
                i++;
                counter = 0;
            }else{
                int addBehind = q.poll();
                q.offer(addBehind);
                counter++;

                if(counter == Size){
                    break;
                }
            }
        }

        return q.size();
    }   
}