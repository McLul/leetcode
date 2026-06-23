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
    public int pairSum(ListNode head) {
        // make copy of the list references, easiest is an array 
        int result = 0;
        int listLength = 1;
        ListNode listChecker = head;
        while (listChecker.next != null) { // first we need a count
            listLength += 1;
            listChecker = listChecker.next;
        }
        int[] valArray = new int[listLength];
        listChecker = head;
        for(int i=0; i<valArray.length;i++) { // first we need a count
            valArray[i] = listChecker.val;
            listChecker = listChecker.next;
        }

        // go through the array and check the front and back until the middle
        for(int i=0; i<valArray.length/2;i++) {
            if (valArray[i] + valArray[valArray.length-1-i] > result ) {
                result = valArray[i] + valArray[valArray.length-1-i];
            }
        }
        return result;
    }
}