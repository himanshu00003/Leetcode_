class Solution {
    public String getSmallestString(String s) {
        char  chars[] = s.toCharArray();
        char temp;
        int n = chars.length;
    
        for(int i = 0 ; i < n - 1; i++){
            if(chars[i] > chars[i+1] && sameparity(chars[i] , chars[i+1])){
                    temp = chars[i];
                    chars[i] = chars[i+1];
                    chars[i+1] = temp;
                    break;
            }
        }
        return new String(chars);
    }




    private boolean sameparity(char a  , char b){
        return  (a - '0') % 2 == (b - '0') % 2;
    }
}
