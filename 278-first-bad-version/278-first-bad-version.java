/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if (n == 1) {
            if (isBadVersion(n)) {
                return 1;
            } else {
                return 0;
            }
        } else if (n == (int)Math.pow(2,31)) {
            if (isBadVersion((int)Math.pow(2,31) - 1)){
                n = (int)Math.pow(2,31)-1;
            } else {
                return n;
            }
        }
        int min = 1;
        int max  = n;
        int index = (int)Math.floor(n/2);
        while (isBadVersion(index) != true || isBadVersion(index-1) != false || isBadVersion(index+1) != true ) {
            if (isBadVersion(index)) {
                max = index-1;
            } else {
                min = index+1;
            }
            index = (int)Math.floor((max-min)/2 + min);
        }
        return index;
     }
}