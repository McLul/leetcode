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
        for (int i = 0 ; i < s.length(); i++) {
            resultStack.push(s.charAt(i));
            if (resultStack.peek().equals(previousChar)) {
                resultStack.pop();
                resultStack.pop();
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