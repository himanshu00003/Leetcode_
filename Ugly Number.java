class Solution {
    public boolean isUgly(int n) {
        if (n <= 0) return false; // Ugly numbers are positive
        while (n > 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else if (n % 3 == 0) {
                n = n / 3;
            } else if (n % 5 == 0) {
                n = n / 5;
            } else {
                return false; // If not divisible by 2, 3, or 5, it's not an ugly number
            }
        }
        return true; // If reduced to 1, it's an ugly number
    }
}
