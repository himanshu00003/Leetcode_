class Solution {
    public int search(int[] nums, int target) {
        // boolean flag = false;
        for(int i = 0 ; i < nums.length ; i++ ){
            if(nums[i] == target){
                return i;
                // System.out.println(i);
                // flag = true;
                // break;
            }
        }
        // if(flag == false) {
            return -1;
            // System.out.println(-1);
        // }
        // return 1;
    }
}
