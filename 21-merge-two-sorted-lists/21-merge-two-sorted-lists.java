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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode();
        ListNode resultHead = new ListNode();
        if (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                result = list1;
                list1 = list1.next;
            } else {
                result = list2;
                list2 = list2.next;
            }
            
        } else if (list1 != null) {
            result = list1;
            list1 = list1.next;
        } else if (list2 != null) {
            result = list2;
            list2 = list2.next;
        } else {
            return null;
        }
        resultHead = result;
        while (list1 != null || list2 != null) {
            if (list1 != null && list2 != null) {
                if (list1.val <= list2.val) {
                    result.next = list1;
                    list1 = list1.next;
                } else {
                    result.next = list2;
                    list2 = list2.next;
                }
            } else if (list1 != null) {
                result.next = list1;
                list1 = list1.next;
            } else if (list2 != null) {
                result.next = list2;
                list2 = list2.next;
            }
            result = result.next;
        }
        return resultHead;
    }
}