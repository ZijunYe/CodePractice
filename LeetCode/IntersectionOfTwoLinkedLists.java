/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode currA = headA;
        ListNode currB = headB; 
        int lenA=0,lenB = 0; 

        while(currA != null){// Get A length
        	lenA++; 
        	currA =currA.next; 
        }

        while(currB != null){
        	lenB++; 
        	currB = currB.next; 
        }

        currA = headA;
        currB = headB; 

        if(lenB > lenA){ // set A is longest 
        	int tmpl = lenA;
        	lenA = lenB; 
        	lenB = tmpl;

        	ListNode tmpN = currA;
        	currA =currB;
        	currB = tmpN; 
        }

        int differ = lenA - lenB; 

        while(differ-- > 0 ){//A pointer should same as pointer B
        	currA = currA.next; 
        }

        while(currA != null){
        	if(currA == currB){
        		return currA;
        	}
        	currA = currA.next; 
        	currB = currB.next; 
        }

        return null; 
       
    }
}