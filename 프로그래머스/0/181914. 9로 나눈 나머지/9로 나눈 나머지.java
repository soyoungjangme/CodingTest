class Solution {
    public int solution(String number) {
        int answer = 0;
        int sum = 0;
        
        String[] str = number.split("");
        for(int i=0; i<str.length; i++){
            int num = Integer.parseInt(str[i]);
            sum += num;
        }
        
        answer = sum%9;
        
        return answer;
    }
}