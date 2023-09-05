class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
     ArrayList<Integer> intArray = new ArrayList<Integer>();
       while (x > 9){
           intArray.add(x%10);
           x /= 10;
       }
        intArray.add(x); 
        int arraySize = intArray.size();
        for (int i = 0; i<arraySize/2; i++) {
            if (intArray.get(i) != intArray.get(arraySize-1-i)) {
                return false;
            }
        }
    return true;
    }
}