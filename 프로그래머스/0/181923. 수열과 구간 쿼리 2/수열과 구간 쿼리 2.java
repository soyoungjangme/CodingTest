class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for(int i=0; i<queries.length; i++){
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            
            int min = Integer.MAX_VALUE;
            boolean found = false;
            
            for(int x=s; x<e+1; x++){
                if(arr[x] > k){
                    min = Math.min(min, arr[x]);
                    found = true;
                } 
            }
            
            answer[i] = found ? min : -1;
            
            
        }
        
        return answer;
    }
}