import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = "";
        
        str = String.valueOf(n);
        String[] arrStr = str.split("");
        
        for(String st : arrStr){
            answer += Integer.parseInt(st);
        }
        
        return answer;
    }
}