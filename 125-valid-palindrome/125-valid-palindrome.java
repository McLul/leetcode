class Solution {
    public boolean isPalindrome(String s) {
        int headPtr = 0;
        int tailPtr = s.length()-1;
        while (headPtr != tailPtr) {
            int headPtrVal = (int)(Character.toLowerCase(s.charAt(headPtr)));
            int tailPtrVal = (int)(Character.toLowerCase(s.charAt(tailPtr)));
            if (!((headPtrVal >= 48 && headPtrVal <= 57) || (headPtrVal >= 97 && headPtrVal <= 122))) {
                headPtr++;
            } else if (!((tailPtrVal >= 48 && tailPtrVal <= 57) || (tailPtrVal >= 97 && tailPtrVal <= 122))){
                tailPtr--;
            } else if (((headPtrVal >= 48 && headPtrVal <= 57) || (headPtrVal >= 97 && headPtrVal <= 122)) && ((tailPtrVal >= 48 && tailPtrVal <= 57) || (tailPtrVal >= 97 && tailPtrVal <= 122)) ) {
                if (headPtrVal != tailPtrVal) {
                    return false;
                } else {
                    headPtr++;
                    if (tailPtr-headPtr < 2) {
                        return true;
                    }
                    tailPtr--;
                }
            }
        }
        return true;
    }
}