import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(int[] numbers) {
        boolean bool = true;
        for(int i : numbers){
            if(i != 0){
                bool=false;
                break;
            }
        }
        
        if(!bool){
            String[] strArr = Arrays.stream(numbers)
                                    .mapToObj(String::valueOf)
                                    .toArray(String[]::new);

            Arrays.sort(strArr, (a,b) -> (b+a).compareTo(a+b));

            String answer = String.join("",strArr);

            return answer;
        }else{
            return "0";
        }
    }
}