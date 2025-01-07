class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        int num = 0;
        int num2 = 0;
        int[] temp = new int[1];
        
        for(int i=0; i<queries.length; i++){
            num = queries[i][0];
            num2 = queries[i][1];
            
            temp[0] = arr[num];
            arr[num] = arr[num2];
            arr[num2] = temp[0];
        }
        
        return arr;
    }
}