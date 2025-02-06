
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt(); //자연수 입력
		int inputleng = Integer.toString(i).length(); //입력 정수길이
		int result = 0;
		
		for(int a=i-(inputleng*9); a<i; a++) { //최소값부터 생성자 확인하기
			int k = a;
			int n = 0;
			int aleng = Integer.toString(a).length(); 
			
			while(aleng>0) {
				int j = k/(int)(Math.pow(10, aleng-1)); 
				n += j; 
				k = k%(int)(Math.pow(10, aleng-1));
				aleng--;
				
				if(aleng == 1) { // 한자릿 수만 남을 경우 더하고 break
					n += k;
					break;
				}
			}
			if((n+a) == i) {
				result += a;
				System.out.println(a);
				break;
			}
		}
		
		if(result == 0) {
			System.out.println(0);
		}
		
		sc.close();
		
	}

}
