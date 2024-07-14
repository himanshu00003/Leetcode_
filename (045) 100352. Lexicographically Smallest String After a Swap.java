//SOLUTION 1 DONE BY CONVERSION (CHAR ARRAY)
class Solution {
    public String getSmallestString(String s) {
        char  chars[] = s.toCharArray();
        char temp;
        int n = chars.length;
    
        for(int i = 0 ; i < n - 1; i++){
            if((chars[i] % 2 == chars[i+1] % 2) && (chars[i] > chars[i+1])){
                    temp = chars[i];
                    chars[i] = chars[i+1];
                    chars[i+1] = temp;
                    break;
            }
        }
        return new String(chars);
    }
}

//SOLUTION DONE BY STRINGBUILDER

public class Solution {
    public String getSmallestString(String s) {
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < sb.length() - 1; i++) {
            if ((sb.charAt(i) % 2 == sb.charAt(i + 1) % 2) && (sb.charAt(i) > sb.charAt(i + 1))) {
                char temp = sb.charAt(i);
                sb.setCharAt(i, sb.charAt(i + 1));
                sb.setCharAt(i + 1, temp);
                break;
            }
        }

        return sb.toString();
    }
}






//SOLUTION 2 ALSO DONE BY CONVERSION (TO CHAR ARRAY BUT WITH THE HELP OF FUNCTION)
// class Solution {
//     public String getSmallestString(String s) {
//         char  chars[] = s.toCharArray();
//         char temp;
//         int n = chars.length;
    
//         for(int i = 0 ; i < n - 1; i++){
//             if(chars[i] > chars[i+1] && sameparity(chars[i] , chars[i+1])){
//                     temp = chars[i];
//                     chars[i] = chars[i+1];
//                     chars[i+1] = temp;
//                     break;
//             }
//         }
//         return new String(chars);
//     }




//     private boolean sameparity(char a  , char b){
//         return  (a - '0') % 2 == (b - '0') % 2;
//     }
// }
