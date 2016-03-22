package linkedlists;

public class RemoveDups {

		Node RemoveDuplicates(Node head) {
		
			    Node cur = head;

			    if(head==null || head.next==null)
			        return head;
			    
			    while(cur.next != null){
			        while(cur.next.data == cur.data && cur.next.next!=null)
			        {
			            cur.next = cur.next.next;
			        }   
			        
			        cur = cur.next;
			    }

			    if(head.next.data == cur.data && head.next != cur)
			        head = head.next;
			    
			    return head;
			}
	
		int FindMergeNode(Node headA, Node headB) {
		    // Complete this function
		    // Do not write the main method. 
		    Node cur = headA;
		    Node curB = headB;

		    int countA = 0;
		    int countB = 0;
		    int diff = 0;
		    
		    while(cur!=null){
		        cur = cur.next;
		        countA++;
		    }

		    while(curB!=null){
		        curB = curB.next;
		        countB++;
		    }
		    
		    if(countA > countB)
		    {
		        diff = countA - countB;
		        for(int i=0;i<diff;i++)
		            headA = headA.next;
		    }
		    else{
		        diff = countB - countA;
		        for(int i=0;i<diff;i++)
		            headB = headB.next;
		    }
		    while(headA.data != headB.data){
		        headA = headA.next;
		        headB = headB.next;
		    }
		    return (int) headA.data;
		}
}
