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
    //this solution could use more methods and tail-end recursion but we will keep this neatly pacakaged.
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int l1Size = 0;
        int l2Size = 0;
        ListNode secondLastNode = null;
        ListNode tempNodeHolder = l1;
        ListNode resultList = new ListNode();
        ListNode largestList = null;
        ListNode smallestList = null;
        int remainder = 0;
        int totalValNodes = 0;
        while (tempNodeHolder.next != null) {
            l1Size +=1;
            tempNodeHolder = tempNodeHolder.next;
        }
        tempNodeHolder = l2;
        while (tempNodeHolder.next != null) {
            l2Size +=1;
            tempNodeHolder = tempNodeHolder.next;
        }
        if (l1Size == l2Size) {
            largestList = l1;
            smallestList= l2;
        } else{
            largestList = l1Size > l2Size ? l1 : l2;
            smallestList = l1Size < l2Size ? l1 : l2;
        }
        tempNodeHolder = resultList;
        while (largestList != null){
            if (smallestList != null ){
                    totalValNodes = smallestList.val + largestList.val + remainder;
                if (totalValNodes > 9) {
                    totalValNodes -= 10;
                    remainder = 1;
                } else {
                    remainder = 0;
                }
                smallestList = smallestList.next;
                largestList = largestList.next;
                tempNodeHolder.val = totalValNodes;
                tempNodeHolder.next = new ListNode();
                secondLastNode = tempNodeHolder;
                tempNodeHolder = tempNodeHolder.next;
            } else if (largestList != null) {
                    totalValNodes = largestList.val + remainder;
                if (totalValNodes > 9) {
                    totalValNodes -= 10;
                    remainder = 1;
                } else {
                    remainder = 0;
                }
                largestList = largestList.next;
                tempNodeHolder.val = totalValNodes;
                tempNodeHolder.next = new ListNode();
                secondLastNode = tempNodeHolder;
                tempNodeHolder = tempNodeHolder.next;
            }
        }
        if (remainder == 1) {
            secondLastNode.next.val = 1;
        }
        else {
            secondLastNode.next = null;
        }
        return resultList;
    }
}