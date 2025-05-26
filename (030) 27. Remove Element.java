// Method 1
class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] != val ) {
                arr.add(nums[i]);
            }
        }
        for(int i = 0 ; i < arr.size() ; i++){
            nums[i] = arr.get(i);
        }
        return arr.size();
    }
}

// Method 2
class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Pointer for position to overwrite

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
