class Solution {
    public int missingNumber(int[] nums) {
        int temp;
        int arr[] = new int[nums.length+1];
        //Bubble sort 
        for(int i = 0 ; i < nums.length-1 ; i++){
            for(int j = 0 ; j < nums.length-i-1 ; j++){
                if(nums[j] > nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
            // comparison
            for(int i = 0 ; i < nums.length  ; i++){
                if(nums[i] != i ){
                    return i;
                }
            }
        
        return nums.length;
    }
}
