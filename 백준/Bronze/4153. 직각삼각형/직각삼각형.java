import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();
			
			int[] arr = {x,y,z};
			Arrays.sort(arr); // 오름차순
			
			double others = Math.pow(arr[0], 2) + Math.pow(arr[1], 2);
			double most = Math.pow(arr[2], 2);
			
			if(x==0 && y==0 && z==0) {
				break;
			}
			
			if(most == others) {
				System.out.println("right");
			}else {
				System.out.println("wrong");
			}
		}
		
		sc.close();
		
	}

}
