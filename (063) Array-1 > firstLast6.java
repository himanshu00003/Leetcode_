public boolean firstLast6(int[] nums) {
  for(int i = 0 ; i < nums.length ; i++){
    if(nums[0] == 6 || nums[nums.length-1] == 6){
      return true;
    }
  }return false;
}
