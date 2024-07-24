class Solution {
    public int lengthOfLongestSubstring(String s) {
        String str = "";
        int max_length = 0;

        for(int i = 0 ; i < s.length() ; i++){
            char currentchar = s.charAt(i);

            while(str.indexOf(currentchar) != -1){
               str = str.substring(1);
            }
            str = str + currentchar;
            max_length = Math.max(max_length , str.length());
        }
        return max_length;
    }
}
