class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[] = new int[nums.length];
        int x = 0;// this is i
        int y = nums.length / 2; // this is j
        int z = 0;
        while(x < nums.length/2){
            ans[z] = nums[x]; // adding value at i to the ans
            z++;
            x++;
            ans[z] = nums[y]; // adding value at j to the ans
            z++;
            y++;
        }
        return ans;
    }
}
