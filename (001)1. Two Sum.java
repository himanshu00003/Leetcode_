// 1ST WAY USING HASHMAPS
class Solution {
    public int[] twoSum(int[] nums, int target) {
         HashMap<Integer , Integer> map = new HashMap<>();
         for(int i = 0 ; i < nums.length ; i++){
            int diff = (target - nums[i]);
            if(map.containsKey(diff)){
                return new int[]{map.get(diff) , i};
            }
            map.put(nums[i] ,i);
         }
        return null;
    }
}


// 2ND  WAY USING 2 POINTERS
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[] = new int[2];
        for(int i = 0 ; i < nums.length-1 ; i++){
            for(int j = i+1 ; j < nums.length ; j++){
            if((nums[i] + nums[j]) == target){
            arr[0] = i;
            arr[1] = j; 
        }
            }   
        }
        return arr;
    }
}
