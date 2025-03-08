import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		int k = sc.nextInt();
		
		int num = (k-i)/(i-j)+1;
		if((k-i)%(i-j)==0) {
			System.out.println(num);
		}else {
			System.out.println(num+1);
		}
		
		sc.close();
	}

}