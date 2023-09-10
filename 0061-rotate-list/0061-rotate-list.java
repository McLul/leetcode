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
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return head;
        }
        int listLength = findListLength(head);
        int timesToRotate = k%listLength; // if you rotate 5 times on a 5 length list youll start at the same position
        ListNode firstNode = head;
        ListNode placeHolder = null;
        for (int i = 0; i < timesToRotate; i++) {
            // add for loop to go through list length and change head and tail
            for (int ii = 0; ii < listLength-2; ii++) { // since we wont to find second to last node
                head = head.next;
            }
            placeHolder = head; // we need to keep track of this node to modify it after it is no longer head
            head.next.next = firstNode; // the last node becomes the firstNode
            head = head.next; // makes head the correct head
            placeHolder.next = null; // removes the pointer on new last node
            firstNode = head; 
            
        }
        return head;
    }
    private int findListLength(ListNode head) {
        int result = 1;
        ListNode nodePosition = head;
        while (head.next != null) {
            head = head.next;
            result++;
        }
       
        return result;
    }
}


/* optimization idea: keep track of last node instead of first node so doesnt have to loop every rotation. */