/**
Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.

 * Definition for singly-linked list.

 */
 
public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
  
class MiddleLinkedList {
    public ListNode middleNode(ListNode head) {
            ArrayList <ListNode> array = new ArrayList<>();
			
			int length =0;
			
			while (head != null) {
				array.add(head);
				head = head.next;
				length++
			}
        return array.get(length/2);
    }
}