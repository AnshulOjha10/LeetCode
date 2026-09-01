class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {

        class Person{
            int index;
            int ticket;

            public Person(int index, int ticket){
                this.index = index;
                this.ticket = ticket;
            }
        }


        Queue <Person> q = new ArrayDeque<>();

        for(int i = 0; i < tickets.length; i++){
            q.offer(new Person(i, tickets[i]));
        }

        int timeTaken = 0;

        //ab agar currrent index wli ticket me ticket 0 nhi hai toh ek kam kro and time badhao

        while(!q.isEmpty()){
            
            Person current = q.poll();

            current.ticket--;
            timeTaken++;    

        
        // here i want to write a return condition so that i can track that index
            if(current.index == k && current.ticket == 0){  
                return timeTaken;
            }

        //or agar abhi bhi first wla nikalne ke baad usme ticket bachi hai toh usse piche bhej do 

        if(current.ticket != 0){
            q.offer(current);
        }


        }

        return -1;
    }
}