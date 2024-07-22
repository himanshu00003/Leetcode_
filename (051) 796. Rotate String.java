class Solution {
    public boolean rotateString(String s, String goal) {
        String s2;
        for(int i = 0 ; i < s.length() ; i++){
            s2 = s.substring(i) + s.substring(0 , i);
            if(s2.equals(goal)){
                return true;
            }
        }
        return false;
    }
}
