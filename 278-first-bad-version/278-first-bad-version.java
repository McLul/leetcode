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
        } else if (n == 2147483647) {
            if (isBadVersion(2147483646)){
                n = 2147483646;
            } else {
                return n;
            }
        }
        int min = 1;
        int max  = n;
        int index = (int)Math.floor(n/2);
        boolean currIndex = isBadVersion(index);
        while (currIndex == false || isBadVersion(index-1) == true || isBadVersion(index+1) == false ) {
            if (currIndex) {
                max = index-1;
            } else {
                min = index+1;
            }
            index = (int)Math.floor((max-min)/2 + min);
            currIndex = isBadVersion(index);
        }
        return index;
     }
}