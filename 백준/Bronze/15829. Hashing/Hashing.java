
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //문자열 길이
        String S = sc.next(); //문자입력
        
        int sum = 0;
        
        if(S.length() == N) {
        	
        	char[] cArr = S.toCharArray();
        	int cnt = 0;
        	
        	for(char c : cArr) {
            	int num = (int)c-96;
        		sum += (num * Math.pow(31, cnt));
        		cnt++;
        	}
        	
        }
        System.out.println(sum);
        
        sc.close();
    }
}
