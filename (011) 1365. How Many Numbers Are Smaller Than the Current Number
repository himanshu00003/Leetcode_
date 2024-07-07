class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int ans[] = new int[nums.length]; // new array created 
        int count = 0; // count
        for(int i = 0 ; i < nums.length ; i++){ 
            for(int j = 0 ; j <nums.length ; j++){ 
                if(nums[i] > nums[j] && i!=j){
                    count = count + 1;           
                }
                
            }
            ans[i] =  count;
            count=0;
        }
        return ans;
    }
}
