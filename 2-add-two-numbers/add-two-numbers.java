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
        int sizeDifference = 0;
        ListNode endNodel1 = null;
        ListNode endNodel2 = null;
        ListNode tempNodeHolder = l1;
        ListNode tempNodeNextHolder = null;
        ListNode resultList = new ListNode();
        ListNode largestList = null;
        ListNode smallestList = null;
        ListNode smallestEndNode = null;
        int remainder = 0;
        int totalValNodes = 0;
        while (tempNodeHolder.next != null) {
            l1Size +=1;
            tempNodeHolder = tempNodeHolder.next;
        }
        endNodel1 = tempNodeHolder;
        tempNodeHolder = l2;
        while (tempNodeHolder.next != null) {
            l2Size +=1;
            tempNodeHolder = tempNodeHolder.next;
        }
        endNodel2 = tempNodeHolder;
        smallestEndNode = l1Size <= l2Size ? endNodel1 : endNodel2;
        //System.out.println(smallestEndNode.val);
        if (l1Size == l2Size) {
            largestList = l1;
            smallestList= l2;
        } else{
            largestList = l1Size > l2Size ? l1 : l2;
            smallestList = l1Size < l2Size ? l1 : l2;
        }
        sizeDifference = Math.abs(l1Size - l2Size);
        tempNodeHolder = null;
        while(sizeDifference > 0) {
            smallestEndNode.next = new ListNode(0);
            smallestEndNode = smallestEndNode.next;
            sizeDifference -=1;
        }
        tempNodeHolder = smallestList;
        //while (tempNodeHolder != null) {System.out.println(tempNodeHolder.val); tempNodeHolder = tempNodeHolder.next;}
        tempNodeHolder = resultList;
        while (smallestList != null || remainder != 0){
            if (smallestList != null) {
                totalValNodes = smallestList.val + largestList.val + remainder;
                if (totalValNodes > 9) {
                    totalValNodes -= 10;
                    remainder = 1;
                } else {
                    remainder = 0;
                }
                smallestList = smallestList.next;
                largestList = largestList.next;
            } else {
                totalValNodes = remainder;
                remainder = 0;
            }
            tempNodeHolder.val = totalValNodes;
            tempNodeHolder.next =  smallestList != null || remainder > 0 ? new ListNode() : null;
            tempNodeHolder = tempNodeHolder.next;
        }
        return resultList;
    }
}