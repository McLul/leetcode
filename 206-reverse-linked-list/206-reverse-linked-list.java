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
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode previous = head;
        head = head.next;
        previous.next = null;
        while (head.next != null) {
            ListNode next = head.next;
            head.next = previous;
            previous = head;
            head = next;
        }
        head.next = previous;
        return head;
    }
}