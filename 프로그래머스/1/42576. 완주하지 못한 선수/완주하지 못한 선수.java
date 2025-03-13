import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
    	Map<String, Integer> pMap = new HashMap<>();

        // 참가자 카운팅
        for (String name : participant) {
            pMap.put(name, pMap.getOrDefault(name, 0) + 1);
        }

        // 완주자 카운팅
        for (String name : completion) {
            pMap.put(name, pMap.get(name) - 1);
        }

        // 값이 0이 아닌 사람이 완주하지 못한 선수
        for (String name : pMap.keySet()) {
            if (pMap.get(name) != 0) {
                answer = name;
                break;
            }
        }
        
        return answer;
    }
}