import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		int sum=0;
		int j=0;
		while(i>sum) {
			j++;
			sum+=j;
		}
		int a=0;
		int b=0;
		if(j%2==0) {
			//행: (j-1)-(sum-j)
			//열: (sum-j)
			a=(j-1)-(sum-i);
			b=(sum-i);
		}else {
			//행: (sum-j)
			//열: (j-1)-(sum-j)
			a=(sum-i);
			b=(j-1)-(sum-i);			
		}
		
		System.out.println((a+1)+"/"+(b+1));
		sc.close();
	}

}