import java.util.*;

class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        
        List<String> list = prefix(my_string);
        if(list.contains(is_prefix)){
            answer = 1;
        } else {
            answer = 0;
        }
        
        return answer;
    }
    
    public List<String> prefix(String my_string){
        List<String> list = new ArrayList<>();
        String[] str = my_string.split("");
        String st = "";
        
        for(String s : str){
            st+=s;
            list.add(st);
        }
        return list;
    }
}