class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String[] str = my_string.split("");
        
        answer += my_string.substring(str.length-n);
        
        return answer;
    }
}