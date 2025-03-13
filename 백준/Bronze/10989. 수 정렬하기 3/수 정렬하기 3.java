
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
    	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
                
        int N = Integer.parseInt(br.readLine());        
        int[] numArr = new int[N];

        for(int i=0; i<N; i++) {
        	int num = Integer.parseInt(br.readLine());
        	numArr[i] = num;
        }
        br.close();
        
        Arrays.sort(numArr);
        for(int i : numArr) {
        	sb.append(i).append("\n");
        }
        
        System.out.println(sb);
        
        
    }
}
