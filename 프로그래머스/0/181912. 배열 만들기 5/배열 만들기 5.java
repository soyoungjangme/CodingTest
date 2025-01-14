import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> intList = new ArrayList<>();
        int[] answer = {};
        
        for(int i=0; i<intStrs.length; i++){
            String str = intStrs[i].substring(s,s+l);
            int intStr = Integer.parseInt(str);
            if(intStr > k){
                intList.add(intStr);
            }
        }
        
        answer = intList.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}