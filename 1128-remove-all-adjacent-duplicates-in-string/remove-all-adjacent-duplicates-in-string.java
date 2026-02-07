
class LinkedNode {
    char val;
    LinkedNode next;
    LinkedNode previous;
    LinkedNode (char val) {
        this.val = val;

    }
}
class DblLinkedList {
    LinkedNode head;
    LinkedNode tail;
    int count;
    DblLinkedList () {
        this.head = null;
        this.tail = null;
        this.count = 0;
    }
    public void addNode (char val) {
        if (this.count == 0) {
            this.head = new LinkedNode(val);
            this.tail = this.head;
        } else {
            this.tail.next = new LinkedNode(val);
            this.tail.next.previous = this.tail;
            this.tail = this.tail.next;
        }
        this.count +=1;
    }
    public int size() {
        return this.count;
    }
    public void removeNode () {
        //typically we would define this however since we want direct object manipulation we will perform this directly in the loop to remove duplicates
    }
    
    }
class Solution {
    DblLinkedList linkedResult;
    String result;
    public String removeDuplicates(String s) {
        LinkedNode currNode = null;
        this.result = new String();
        // edge case length 1;
        if (s.length() < 1) {
            return s;
        }
        // linked list for O(n) updating
        this.linkedResult = new DblLinkedList();
        for (int i = 0 ; i < s.length(); i++) {
            linkedResult.addNode(s.charAt(i));
        }
        currNode = linkedResult.head;
        for (int i = 0 ; i < linkedResult.size()-1; i++) {
            // edge case duplicate is on first
            if (i == 0 && currNode.val == currNode.next.val){
                //System.out.println(currNode.val + ", " + currNode.next.val + i);
                currNode = currNode.next.next;
                linkedResult.head = currNode;
                linkedResult.count -= 2;
                i -= 1;
            } else if (currNode.val == currNode.next.val) {
                //System.out.println(currNode.val + ", " + currNode.next.val + i);
                currNode = currNode.previous;
                if (currNode.next.next.next != null) {
                    currNode.next.next.next.previous = currNode;
                }
                currNode.next = currNode.next.next.next;
                linkedResult.count -= 2;
                i -= 2;
            } else {
                currNode = currNode.next;
            }
        }
        currNode = linkedResult.head;
        for (int i = 0; i < linkedResult.size(); i++) {
            this.result += currNode.val;
            currNode = currNode.next;
        }
        return result;
    }
}