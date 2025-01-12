class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        int i = 0;
        long l = 0;
        
        while(i < n){
            l = l + x; 
            answer[i] = l;
            i++;
        }
        
        return answer;
    }
}