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
class SwapPairs {
    public ListNode swapPairs(ListNode head) {
    	//we need a dummy node that before the head 
    	ListNode dummyNode = new ListNode(0); 
    	dummyNode.next = head; 
    	ListNode tmp = dummyNode; // the element before the switched elem 
    	while(tmp.next != null && tmp.next.next != null){
    		ListNode node1 = tmp.next; //the head, or the first element
    		ListNode node2 = tmp.next.next; //the second element need to switch



    		tmp.next = node2; 
    		node1.next = node2.next; 
    		node2.next = node1; 

    		tmp = node1; 

    	}
        return dummyNode.next; //dummyNode.next is the first element in the array
    }
     public ListNode swapPairs2(ListNode head) {//recursion 
    	if(head == null || head.next == null){
    		return head; 
    	}

    	ListNode newHead = head.next; 
    	head.next = swapPairs2(newHead.next); 
    	newHead.next = head; 

    	return newHead;

    }












}