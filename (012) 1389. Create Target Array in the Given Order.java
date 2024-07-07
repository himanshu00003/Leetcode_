class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> arr = new ArrayList<>();
        int idx = 0;
        int val = 0;
        for(int i = 0 ; i<index.length ; i++){
            idx = index[i];
            val = nums[i];
            arr.add(idx,val);
        }

        int[] arr1 = new int[index.length];

        for(int i = 0 ; i < nums.length ; i++){
            arr1[i] = arr.get(i); 
        }
        return arr1;
    }
}
