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
    public ListNode swapPairs(ListNode head) {
        int counter = 1;
        ListNode result = head == null || head.next == null ? head : head.next;
        ListNode odd = null;
        ListNode pairEnd = null;
        while (head != null) {
            if (counter % 2 == 0)
            {
                odd.next = head.next;
                head.next = odd;
                if (pairEnd != null) {
                    pairEnd.next = head;
                }
                pairEnd = odd;
                head = head.next;
                
                
            } else {
                odd = head;

            }
            counter++;
            head = head.next;
            
        }
        return result;
    }
}