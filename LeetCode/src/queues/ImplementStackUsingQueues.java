package queues;

import java.util.LinkedList;

public class ImplementStackUsingQueues {

	public static void main(String[] args) {

		MyStack s = new MyStack();
		s.push(1);
		s.push(2);
		System.out.println(s.top());
		System.out.println(s.pop());
		System.out.println(s.pop());
		//System.out.println(s.pop());
		System.out.println(s.empty());
	}

}
class MyStack {
    // Push element x onto stack.
    MyQueues q1 = new MyQueues();
    MyQueues q2 = new MyQueues();
    
    public void push(int x) {
        if(!q1.isEmpty())
            q1.enq(x);
        else
            q2.enq(x);
    }

    // Removes the element on top of the stack.
    public int pop() {
        if(q1.isEmpty()){
            while(q2.size()>1){
                int x = q2.deq();
                q1.enq(x);
            }
            return q2.deq();
        }
        else{
            while(q1.size()>1)
            {
                int x = q1.deq();
                q2.enq(x);
            }
            return q1.deq();
        }
    }

    // Get the top element.
    public int top() {
    	int x = 0;
        if(q1.isEmpty()){
        	
            while(!q2.isEmpty()){
                x=q2.deq();
                System.out.println(" q2 top = "+x);

                q1.enq(x);
            }
           
            return x;
        }
        else{
            while(!q1.isEmpty())
            {
                x = q1.deq();
                System.out.println(" q1 top = "+x);
                q2.enq(x);
            }
            
            return x;
        }
    }

    // Return whether the stack is empty.
    public boolean empty() {
        if(q1.isEmpty() && q2.isEmpty())
            return true;
        else
            return false;
    }
}

class MyQueues{
    
    LinkedList<Integer> list = new LinkedList<>();
    int cnt = 0;
    public void enq(int x)
    {
        list.add(x);
        cnt++;
    }
    
    public int size()
    {
    	return cnt;
    }
    
    public int deq(){
        int x = list.get(0);
        list.remove(0);
        cnt--;
        return x;
    }
    
    public int peek(){
        return list.get(0);
    }
    
    public boolean isEmpty(){
        if(list.isEmpty())
            return true;
        else
            return false;
    }
}