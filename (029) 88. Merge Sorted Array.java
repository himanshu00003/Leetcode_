class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int a = 0 ; 
        int arr[] = new int[m + n];
        
        for(int i = 0 ; i < m ; i++){
            if(nums1[i] != 0){
                arr[a] = nums1[i];
                a++;
            }
        }
        for(int i = 0 ; i < n ; i++){
            if(nums2[i] != 0){
                 arr[a] = nums2[i];
                a++;
            }
        }
        Arrays.sort(arr);
        for(int i = 0 ; i < m+n ; i++){
            nums1[i] = arr[i];
        }
        System.out.print(Arrays.toString(arr));
    }
}
