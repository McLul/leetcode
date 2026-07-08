class Solution {
    public int bitwiseComplement(int n) {
        int result = 0;
        if (n == 0) {
            return 1;
        }
        int place = 0;
        while (n != 0) {
            if ( (n/2) * 2 != n) {
                n = n >> 1;
            } else {
                result += Math.pow(2, place);
                n = n >> 1;
            }
            place += 1;
        }
        return result;
    }
}