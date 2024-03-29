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
        if (head.next == null) {  // case 1 : have to remove 1 and list length = 1 
            return null;
        }
        n = countNodes(head) - n;
        if (n == 0) {     // case 2:  first position is selected for deletion so just move head to next position
            return head.next;    
        }
        ListNode headPtr = head;
        ListNode beforePtr = head;
        while (n != 0) { // case 3 : node is somewhere in the middle
            beforePtr = head;
            head = head.next;
            n--;
        }
        if (head.next == null) {  // handling exceptions for either rejoining the list or removing from the end
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