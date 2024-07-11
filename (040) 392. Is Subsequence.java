class Solution {
    public boolean isSubsequence(String s, String t) {
        int Sindex = 0;
        int Tindex = 0;
        while(Sindex < s.length() && Tindex < t.length() ){
            if(s.charAt(Sindex) == t.charAt(Tindex)){
                Sindex++;
            }
            Tindex++;
        }
        return Sindex == s.length();
    }
}
