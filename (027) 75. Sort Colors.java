
//Solution 1      1ms
class Solution {
    public int[] sortColors(int[] nums) {
        Arrays.sort(nums);
        return nums;
    }
}

//Solution 2      2ms
class Solution {
    public void sortColors(int[] nums) {
        Arrays.sort(nums);
         System.out.println(Arrays.toString(nums));
         
    }
}

//Solution 3    3ms
class Solution {
    public void sortColors(int[] nums) {
        //int pt = 0;
        int temp;
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = i+1 ; j < nums.length ; j++){
                if(nums[i] > nums[j]){
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp; 
                }
            }
        }
        System.out.print(Arrays.toString(nums));
    }
}
