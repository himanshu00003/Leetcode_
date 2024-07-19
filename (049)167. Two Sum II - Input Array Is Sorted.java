class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int arr[] = new int[2];
        int pt1 = 0;
        int pt2 = numbers.length-1;
        
        while(pt1< pt2){
            int sum = numbers[pt1] + numbers[pt2];
            if(sum == target){
                arr[0] = pt1 + 1;
                arr[1] = pt2 + 1;
                return arr;
            }
            else if(sum < target){
                pt1++;
            }
            else{
                pt2--;
            }
        }
        return arr;
    }
}
