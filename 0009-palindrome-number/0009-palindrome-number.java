class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x < 10 ) {
            return true;
        } 
     ArrayList<Integer> intArray = new ArrayList<Integer>();
       while (x > 9){
           intArray.add(x%10);
           x /= 10;
       }
        intArray.add(x); 
        int size = intArray.size();
        for (int i = 0; i<size/2; i++) {
            if (intArray.get(i) != intArray.get(size-1-i)) {
                return false;
            }
        }
    return true;
    }
}