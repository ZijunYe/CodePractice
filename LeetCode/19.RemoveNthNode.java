/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class RemoveNthNode{
    public ListNode removeNthFromEnd(ListNode head, int n) {

    	// we count how many element we have
    	// size of the list minus n 
    	//then loop again to remove the element

    	//calculate size 
    	int count = 0; 
    	ListNode curr = head; 
    	while(curr != null){
    		count++; 
    		curr = curr.next; 
    	}


    	ListNode dummy = new ListNode(0, head); 
    	ListNode prev = dummy; 
    	for(int i = 1; i < count - n + 1; i++){
    		prev = prev.next; 
    	}

    	prev.next = prev.next.next; 
    	ListNode ans = dummy.next; 
    	return ans; 
        
    }


    //using double link 
     public ListNode removeNthFromEnd2(ListNode head, int n) {
     	ListNode dummy = new ListNode(0,head); 
     	ListNode first = head; 
     	ListNode second = dummy; 

     	for(int i = 0; i < n; i++){
     		first = first.next; 
     	}


     	while(first != null){
     		first = first.next; 
     		second = second.next; 
     	}


     	second.next = second.next.next; 
     	ListNode ans = dummy.next; 
     	return ans; 
    }
}













