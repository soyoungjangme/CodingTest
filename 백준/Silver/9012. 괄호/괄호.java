
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		sc.nextLine();
		
		for(int j=0; j<i; j++) {
			String VPS = sc.next();
			int cnt=0;
			
			for(int k=0; k<VPS.length(); k++){
				char ch = VPS.charAt(k);
				
				if(ch=='(') {
					cnt++;
				}else if(ch==')') {
					cnt--;
				}
				
				if(cnt<0) {
					break;
				}
			}
			if(cnt==0 ) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
			
		}
		sc.close();
	}
}