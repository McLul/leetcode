import java.util.Stack;
import java.util.Iterator;

class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> resultStack = new Stack<>();
        Iterator resultIterator = null;
        StringBuilder stringResult = null;
        Character charTested = null;
        // edge case length 1;
        if (s.length() < 1) {
            return s;
        }
        resultStack.push(s.charAt(0));
        for (int i = 1 ; i < s.length(); i++) {
            charTested = s.charAt(i);
            if (!resultStack.isEmpty() && resultStack.peek().equals(charTested)) {
                resultStack.pop();
            } else {
                resultStack.push(charTested);
            }
        }
        resultIterator = resultStack.iterator();
        stringResult = new StringBuilder(resultStack.size());
        while (resultIterator.hasNext()) {
            stringResult.append( resultIterator.next());
        }
        return stringResult.toString();
    }
}