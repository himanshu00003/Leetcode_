class Solution {
    public int longestConsecutive(int[] nums){
        int count = 1;
        int max = 1;
        Arrays.sort(nums);
        if(nums.length == 0 ){
            return 0;
        }  
        for(int i = 0 ; i < nums.length-1 ; i++){
            if(nums[i] == nums[i+1]){
                continue;
            }
            if(nums[i] - nums[i+1] == -1){
                count++;
            }
            else{
                max = Math.max(max , count);
                    count = 1;
                }
            }
        return max = Math.max(max , count);
    }
}
