import java.util.Stack;
import java.util.Iterator;
class Solution {
    String result;
    public String removeDuplicates(String s) {
        Stack<Character> resultStack = new Stack<>();
        Iterator resultIterator;
        this.result = new String();
        Character previousChar = null;
        // edge case length 1;
        if (s.length() < 1) {
            return s;
        }
        resultStack.push(s.charAt(0));
        for (int i = 1 ; i < s.length(); i++) {
            if (resultStack.size() != 0 && resultStack.peek().equals(s.charAt(i))) {
                resultStack.pop();
            } else {
                resultStack.push(s.charAt(i));
            }
            previousChar = resultStack.size() > 0 ? resultStack.peek() : null;
        }
        resultIterator = resultStack.iterator();
        while (resultIterator.hasNext()) {
            result += resultIterator.next();
        }
        return result;
    }
}