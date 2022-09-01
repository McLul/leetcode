class Solution {
    public boolean isValid(String s) {
        int length = s.length();
        if (length == 0) {
            return true;
        }
        char oB = '(';
        char cB = ')';
        char oC = '{';
        char cC = '}';
        char oS = '[';
        char cS = ']';
        ArrayList<Character> brackets = new ArrayList<Character>();
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == oB || s.charAt(i) == oC || s.charAt(i) == oS ) {
                brackets.add(s.charAt(i));
            }
            else if (s.charAt(i) == cB) {
                int size = brackets.size()-1;
                if ( size < 0 || brackets.get(size) != oB) {
                    return false;
                }
                brackets.remove(size);
            }
            else if (s.charAt(i) == cC) {
                int size = brackets.size()-1;
                if (size < 0 || brackets.get(size) != oC) {
                    return false;
                }
                brackets.remove(size);
            }
            else if (s.charAt(i) == cS) {
               int size = brackets.size()-1;
                if (size < 0 || brackets.get(size) != oS) {
                    return false;
                }
                brackets.remove(size);
            }
            
        }
        if (brackets.size() == 0) {
            return true;
        }
        return false;
    }
}