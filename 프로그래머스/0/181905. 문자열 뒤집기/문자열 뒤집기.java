class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        
        String str = new StringBuilder(my_string.substring(s,e+1)).reverse().toString();
        answer = my_string.substring(0,s) + str + my_string.substring(e+1);
        
        return answer;
    }
}