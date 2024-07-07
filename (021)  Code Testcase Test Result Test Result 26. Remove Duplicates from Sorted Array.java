class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        
        int a = 1; // Initialize count of unique elements, starting with the first element
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[a++] = nums[i]; // Move unique element to the correct position
            }
        }
        
        return a; // Return the count of unique elements
    }
}
