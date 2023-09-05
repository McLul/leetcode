class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x < 10 || (x < 100 && x%10 == x/10) ) {
            return true;
        } 
     ArrayList<Integer> intArray = new ArrayList<Integer>();
       while (x > 9){
           intArray.add(x%10);
           x /= 10;
       }
        intArray.add(x); 
        int arraySize = intArray.size();
        int arrayEnd = arraySize-1;
        for (int i = 0; i<arraySize/2; i++) {
            if (intArray.get(i) != intArray.get(arrayEnd-i)) {
                return false;
            }
        }
    return true;
    }
}