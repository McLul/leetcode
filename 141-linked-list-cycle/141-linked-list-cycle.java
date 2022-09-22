/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode one = head;
        ListNode two = head.next;
        while (two != null && one != two) {
            if (two == one) {
                return true;
            }
            if (one.next != null && two.next != null && two.next.next != null) {
              one = one.next;
              two = two.next.next;  
            } else {
                return false;
            }
            System.out.println(one);
            System.out.println(two);
        }
        return true;
    }
}