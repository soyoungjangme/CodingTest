import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        
        List<String> strList = addList(my_string);
        
        //사전순 정렬
        Collections.sort(strList);
        
        //배열로 변환
        answer = strList.toArray(new String[0]);
        
        return answer;
    }
    
    public List<String> addList(String my_string){
        String[] arr = my_string.split(""); // b,a,n,a,n,a
        String str = "";
        List<String> list = new ArrayList<>();
        
        for(int i=arr.length-1; i>=0; i--){
            str += arr[i]; // a,an,ana,anan,anana,ananab
            String s = new StringBuilder(str).reverse().toString();
            list.add(s);
        }
        return list;
    }
}