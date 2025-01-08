import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {};
        List<Integer> arr = new ArrayList<>();
        Character num = '5';
        Character num2 = '0';
        
        for(int i=l; i<r+1; i++){
            if(i%5 == 0){
                if(String.valueOf(i).chars().allMatch(ch -> ch == num || ch == num2)){
                    arr.add(i);
                }
            }
        }
        
        if(arr.isEmpty()){
            arr.add(-1);
        }
        
        answer = arr.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}