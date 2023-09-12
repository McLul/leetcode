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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) {
            return null;
        }
        ListNode headPtr = head;
        ListNode beforePtr = head;
        n = countNodes(head) - n;
        if (n == 0) {
            return head.next;
        }
        while (n != 0) {
            beforePtr = head;
            head = head.next;
            n--;
        }
        if (head.next == null) {
            beforePtr.next = null;
        } else {
            beforePtr.next = head.next;
        }
        return headPtr;
    }
    public int countNodes (ListNode head) {
        int count = 1;
        while (head.next != null) {
            count++;
            head = head.next;
        }
        return count;
    }
}