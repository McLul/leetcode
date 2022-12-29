import java.lang.Math.*;
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
    public ListNode middleNode(ListNode head) {
        int nodes = countNodes(head);
        ListNode nodePointer = head;
        int result;
        for (int i = 0; i < Math.ceil(nodes/2); i++) {
            nodePointer = nodePointer.next;
        }
        return nodePointer;
    }
    private int countNodes(ListNode node) {
        int result = 0;
        if (node != null) {
            result +=1 + countNodes(node.next);
        }
        return result;
    }
}