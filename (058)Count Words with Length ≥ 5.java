import java.util.*;
public class CountWordsGreaterThan5 {
    public static void main(String[] args) {
    int totalCount = 0;
    int wordLength = 0;
    String str = "Hello Himanshu how are you";
    for(int i = 0 ; i < str.length() ; i++){
        char ch = str.charAt(i);
        if(ch != ' '){
            wordLength += 1;
        }
        if(ch == ' '){
            if(wordLength >= 5){
                totalCount += 1;
            }
            wordLength = 0;
        }

    }
        System.out.println(totalCount);
    }
}
