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
        ListNode result = null;
        ListNode tempPointer = null;
        if (list1 == null || list2 == null) {
            return list1 == null ? list2 : list1;
        }
        while (list1 != null || list2 != null) {
            if (tempPointer == null) {
                if (list1.val < list2.val ) {
                    tempPointer = list1;
                    list1 = list1.next;
                } else {
                    tempPointer = list2;
                    list2 = list2.next;
                }
                result = tempPointer;
            } else if (list1 == null) {
                tempPointer.next = list2;
                tempPointer = tempPointer.next;
                list2 = list2.next;
            } else if (list2 == null) {
                tempPointer.next = list1;
                tempPointer = tempPointer.next;
                list1 = list1.next;
            } else {
                if (list1.val < list2.val ) {
                    tempPointer.next = list1;
                    tempPointer = list1;
                    list1 = list1.next;
                } else {
                    tempPointer.next = list2;
                    tempPointer = list2;
                    list2 = list2.next;
                }
            }
        }
        return result;

        
    }
}