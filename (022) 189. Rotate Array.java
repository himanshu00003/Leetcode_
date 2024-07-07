class Solution {
    public void rotate(int[] nums, int k) {
         k = k % nums.length; 
        if(k<nums.length)
        {
            int arr[] = new int[nums.length];
        int a = 0;
        for(int i = nums.length-k ; i < nums.length; i++){
            arr[a] = nums[i];
            a++;
        }
       
        for(int i = 0 ; i < nums.length-k ; i++){
            arr[a] = nums[i];
            a++;
        
        }
        for(int i = 0 ; i < nums.length ; i++){
            nums[i] = arr[i];
        }
        }
    }
}
