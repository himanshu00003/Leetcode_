class Solution {
    public int mySqrt(int x) {
        double num = Math.sqrt(x); // Calculate square root, returns double
        int number = (int) num; // Convert double to int (truncates decimal part as it converts double to int)
        return number; 
    }
}
