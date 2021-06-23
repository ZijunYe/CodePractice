/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class LinkedListCycle {
    public ListNode detectCycle(ListNode head) {
    		ListNode slow = head; 
    		ListNode fast = head; 
    		while(fast!= null && fast.next!= null){
    			fast = fast.next.next; 
    			slow = slow.next; 

    			if(fast == slow){//counted, there is a circle 
    				ListNode index1 = head;
    				ListNode index2 = slow; 

    				while(index2 != index1){
    					index2 =index2.next; 
    					index1 = index1.next;
    				}
    				return index1; 


    			}
    		}
    		return null; 

    }
}