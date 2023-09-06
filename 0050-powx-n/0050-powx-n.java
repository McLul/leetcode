class Solution {
    public double myPow(double x, int n) {
        if (n==0) {
            return 1;
        } else if (n==-1) {
            return 1/x;
        }  else if (n==1) {
            return x;
        } 
        double half = myPow(x, n/2); // cut our calculations down by half
        double result = half * half * myPow(x, n%2);
        
        return result;
    }
}