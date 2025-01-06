class Solution {
    public int[] solution(int[] num_list) {
        int[] arr = new int [num_list.length+1];
        int leng = num_list.length;
        
        if(leng > 1 && leng < 11){
            for(int i=0; i<num_list.length; i++) {
                if(num_list[i] > 0 && num_list[i] < 10){
                    arr[i] = num_list[i];    
                }
            }
            
            if(num_list[leng-1] > num_list[leng-2]) {
                arr[arr.length-1] = num_list[leng-1] - num_list[leng-2];
            } else if (num_list[leng-1] <= num_list[leng-2]) {
                arr[arr.length-1] = arr[leng-1] * 2;
            }    


        }
            return arr;
        
        
    }
}