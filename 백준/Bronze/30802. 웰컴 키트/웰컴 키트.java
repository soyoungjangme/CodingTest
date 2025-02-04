
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); //참가자 수 입력
		int[] arr = new int[6]; //사이즈별 인원
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int T = sc.nextInt(); //티셔츠 묶음 기준
		int P = sc.nextInt(); //펜 묶음 기준
		
		/////////////////////////////////
		
		int Tcount = 0; //티셔츠 묶음 당 개수
		int Pcount = 0; //펜 묶음 당 개수
		int Pplus = 0; //펜 추가 개수
		
		for(int i=0; i<arr.length; i++) {
			Tcount += arr[i]/T;
			if(arr[i]%T > 0) {
				Tcount++;
			}
		}
		
		Pcount = N/P;
		Pplus += (N - P*Pcount);
		
		System.out.println(Tcount);
		System.out.println(Pcount + " " + Pplus);
		
		sc.close();
		
	}

}
