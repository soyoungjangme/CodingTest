class Solution {
    public String solution(String rsp) {
        //가위2 바위0 보5
        String answer = "";
        String[] arr = rsp.split("");
        
        // 2 > 0
        // 0 > 5
        // 5 > 2
        for(int i=0; i<arr.length; i++){
            if(arr[i].equals("2")){
                answer += "0";
            }else if(arr[i].equals("0")){
                answer += "5";
            }else if(arr[i].equals("5")){
                answer += "2";
            }
        }
        
        
        return answer;
    }
}