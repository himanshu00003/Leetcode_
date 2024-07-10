// 1st Solution using while loop
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return ""; // Return empty string if array is empty or null
        }
        
        Arrays.sort(strs); // Sort the array of strings
        
        String first = strs[0]; // First string after sorting
        String last = strs[strs.length - 1]; // Last string after sorting
        
        // Find the common prefix between first and last string
        int i = 0;
        while (i < first.length() && i < last.length() && first.charAt(i) == last.charAt(i)) {
            i++;
        }
        
        return first.substring(0, i); // Return the common prefix found
    }

 }

// 2nd Solution using for loop
class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1 ];

        int i = 0;
    for( i = 0 ; i < first.length() && i < last.length() && first.charAt(i) == last.charAt(i) ; i++){
     
        }
        return first.substring(0 , i);
    }
}
