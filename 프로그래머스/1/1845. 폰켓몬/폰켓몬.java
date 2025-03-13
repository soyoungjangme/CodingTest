import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        int maxLeng = nums.length/2;
    	List<Integer> list = new ArrayList<>();
    	
    	for(int i : nums) {
    		if(!list.contains(i)) {
    			list.add(i);
    		}
    	}
    	
    	if(list.size() > maxLeng) {
    		answer = maxLeng;
    	}else {
    		answer = list.size();
    	}
        
        return answer;
    }
}