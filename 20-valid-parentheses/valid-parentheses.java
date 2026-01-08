import java.util.ArrayList;

class Solution {
    public boolean isValid(String s) {
        char charTested;
        ArrayList<Character> lastBracket = new ArrayList<Character>();
        for (int i = 0; i < s.length(); i++) {
            charTested = s.charAt(i);
            switch (charTested) {
                case '(':
                    lastBracket.add('(');
                    break;
                case ')':
                    if (lastBracket.size() == 0 || lastBracket.remove(lastBracket.size()-1) != '(') {return false;}
                    break;
                case '{':
                    lastBracket.add('{');
                    break;
                case '}':
                    if (lastBracket.size() == 0 || lastBracket.remove(lastBracket.size()-1) != '{') {return false;}
                    break;
                case '[':
                    lastBracket.add('[');
                    break;
                case ']':
                    if (lastBracket.size() == 0 || lastBracket.remove(lastBracket.size()-1) != '[') {return false;}
                    break;
            }

        }
        return lastBracket.size() > 0 ? false : true;
    }
}