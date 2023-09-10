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
        int timesToRotate = k%listLength;
        ListNode firstNode = head;
        ListNode placeHolder = null;
        for (int i = 0; i < timesToRotate; i++) {
            // add for loop to go through list length and change head
            for (int ii = 0; ii < listLength-2; ii++) { 
                head = head.next;
            }
            placeHolder = head;
            System.out.println(head.next.val);
            head.next.next = firstNode;
            head = head.next;
            placeHolder.next = null;
            firstNode = head;
            
        }
        return head;
    }
    public int findListLength(ListNode head) {
        int result = 1;
        ListNode nodePosition = head;
        while (head.next != null) {
            head = head.next;
            result++;
        }
       
        return result;
    }
}