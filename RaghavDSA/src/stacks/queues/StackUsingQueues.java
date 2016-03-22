package stacks.queues;

public class StackUsingQueues {

	SinQueue q1 = new SinQueue();
	SinQueue q2 = new SinQueue();
	
	public void push(int data){
		
		if(q1.isEmpty())
		{
			q2.enQueue(data);
		}
		else
		{
			q1.enQueue(data);
		}
	}
	
	public int pop(){
	
		int val = 0;
		if(!q1.isEmpty()){
			while(q1.size()>1){
				q2.enQueue(q1.deQueue());
			}
			val = q1.deQueue();
		}
		else{
			while(q2.size()>1){
				q1.enQueue(q2.deQueue());
			}
			val = q2.deQueue();
		}
		System.out.println("Popped : "+val);
		return val;
	}
	
	public static void main(String[] args){
		
		StackUsingQueues st = new StackUsingQueues();
		st.push(1);
		st.push(2);
		st.push(3);
		
		st.pop();
		st.pop();
		
		st.push(4);
		st.pop();
	}
}
