
class MyLinkedList {
     public class MyLinkedListNode{
        int val;
        MyLinkedListNode next;
        public MyLinkedListNode(int val){
            this.val = val;
            this.next = null;
        }
    }

    int size; 
    MyLinkedListNode head; 
    /** Initialize your data structure here. */
    public MyLinkedList() {
        size = 0; 
        head = new MyLinkedListNode(0); 

    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        int result = -1; 
        if(index < 0 || index >= size){
            return result; 
        }else{
            MyLinkedListNode curr = head; 
            for(int i = 0; i < index+1; i++){
                curr = curr.next; 
            }
            result = curr.val; 

        }
        return result;
        
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        addAtIndex(0,val); 
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        addAtIndex(size,val); 
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        // #1 如果index 等于 size --> 则add to the end 
        // #2 如果index 大于 size --> 则无法加入 
        // #3 如果index 等于 0 --> add to the top 

        if(index > size){
            return;
        }

        if(index < 0){
            index = 0;
        }

        size++; 

        MyLinkedListNode curr = head; 
        for(int i = 0; i < index; i++){
            curr = curr.next; 
        }
        MyLinkedListNode addNew = new MyLinkedListNode(val); 
        addNew.next = curr.next; 
        curr.next = addNew; 


        
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        // index > size 
        // index < 0 
        if(index >= size || index < 0 ){
            return; 
        }
        size--; 
        MyLinkedListNode curr = head; 
        for(int i = 0; i < index; i++){
            curr = curr.next; 
        }

        // what I need to delete is curr.next 

        curr.next = curr.next.next; 




        
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */