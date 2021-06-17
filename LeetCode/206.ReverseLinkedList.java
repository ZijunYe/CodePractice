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
class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
    	ListNode curr = head; 
    	ListNode prev = null;
    	ListNode tmp = null; 
    	
    	
        while(curr != null)//reach to the end of the list 
        {
        	tmp = curr.next; 
        	curr.next = prev; 
        	prev = curr; 
        	curr = tmp; 

        }
     return prev; 
        
    }
}