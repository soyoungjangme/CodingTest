import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] arr = {a,b,c,d};
        List<Integer> cntList = new ArrayList<>();
        
        
        for(int i=0; i<arr.length; i++){
            int count = 0;
            for(int j=0; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            cntList.add(count);
        }
        
        int p = 0;
        int q = 0;
        int r = 0;
        int min = 7;
        int max = 0;
        
        for(int i=0; i<cntList.size(); i++){
            if(max < cntList.get(i)){
                max = cntList.get(i);
            }
        }
        
        for(int i=0; i<cntList.size(); i++){ 
            if(max == cntList.get(i)){
                if(max == 4){
                    p = arr[i];
                    answer = 1111 * p;
                    break;
                }else if(max == 3){// 2,1,1,1
                    p = arr[i];

                    for(int j=0; j<cntList.size(); j++){
                        if(cntList.get(j) == 1){
                            q = arr[j];
                        }
                    }
                    answer = (int) Math.pow((10 * p) + q, 2);
                    break;
                } else if(max==2 && !cntList.contains(1)){
                    p = arr[i];
                    for(int j=0; j<cntList.size(); j++){
                        if(arr[j] != p){
                            q = arr[j];
                        }
                    }
                    answer = (p+q) * Math.abs(p-q);
                    break;
                } else if(max==2 && cntList.contains(1)){ // 1,2,2,3
                    p = arr[i];
                    for(int j=0; j<cntList.size(); j++){
                        if(cntList.get(j) == 1){
                            q = arr[j];
                        }
                    }
                    for(int k=0; k<cntList.size(); k++){
                        if(cntList.get(k) == 1 && arr[k] != q){
                            r = arr[k];
                        }
                    }
                    answer = q * r;
                    break;
                }else{
                    for(int j=0; j<arr.length; j++){
                        if(min > arr[j]){
                           min = arr[j]; 
                        }    
                    }

                    answer = min;
                    break;
                }   
            }
        }
        
        
        return answer;
    }
}