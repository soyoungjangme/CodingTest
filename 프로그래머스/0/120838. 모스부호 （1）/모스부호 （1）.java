class Solution {
    public String solution(String letter) {
        String answer = "";
        char c = 'a';
        String[] lett = letter.split(" ");
        String[] mos = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        
        for(String s : lett){
            for(int i=0; i<mos.length; i++){
                if(s.equals(mos[i])){
                    c=(char)('a'+i);
                    answer += c;
                }
            }
        }
        
        return answer;
    }
}