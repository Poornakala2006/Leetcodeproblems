class MyStack {
    
    Queue<Integer> s1 = new ArrayDeque<>();
    public MyStack() {
        
    }
    
    public void push(int x) {

        s1.offer(x);
        
    }
    
    public int pop() {
        int size = s1.size()-1;
        while(size!=0)
        {
            int val=s1.peek();
            s1.poll();
            s1.offer(val);
            size--;
        }
        var ans = s1.peek();
        s1.poll();
        return ans;
        
    }
    
    public int top() {
        int size = s1.size()-1;
        while(size!=0)
        {
            int val=s1.peek();
            s1.poll();
            s1.offer(val);
            size--;
        }
        var ans = s1.peek();
        s1.poll();
        s1.offer(ans);
        return ans;
        
     }
    
    public boolean empty() {

        if(s1.isEmpty()==true)
        {
            return true;
        }
        return false;
        
    }
}

