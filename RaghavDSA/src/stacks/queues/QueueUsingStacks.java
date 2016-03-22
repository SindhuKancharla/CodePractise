package stacks.queues;

public class QueueUsingStacks {

	SinStack s1 = new SinStack(10);
	SinStack s2 = new SinStack(10);
	
	public void enQueue(int data){
		
		s1.push(data);
	}
	
	public int deQueue(){
		
		if(!s2.isEmpty()){
			return s2.pop();
		}
		else{
			while(s1.top==0){
				s2.push(s1.pop());
			}
			return s1.pop();
		}
	}
	
	public static void main(String[] args){
		
		QueueUsingStacks q = new QueueUsingStacks();
		
		q.enQueue(1);
		q.enQueue(2);
		

		q.enQueue(3);
		q.enQueue(4);
		q.enQueue(5);
		
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());

		q.enQueue(10);
		System.out.println(q.deQueue());

	}
}
