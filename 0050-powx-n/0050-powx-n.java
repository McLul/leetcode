class Solution {
    public double myPow(double x, int n) {
        //int halfN = n/2; // this will deal with overflow when converting 
        if (n==0) {
            return 1;
        } else if (n==-1) {
            return 1/x;
        }  else if (n==1) {
            return x;
        } 
        double half = myPow(x, n/2);
        double result = half * half * myPow(x, n%2);
        
        return result;
    }
}