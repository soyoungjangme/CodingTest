class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        int num = numLog[0];
        
        for(int i=1; i<numLog.length; i++){
            int diff = numLog[i] - num;
            
            if(diff == 1){
                answer+="w";
            }else if(diff == -1){
                answer+="s";
            }else if(diff == 10){
                answer+="d";
            }else if(diff == -10){
                answer+="a";
            }
            
            num = numLog[i];
        }
        
        
        return answer;
    }
}