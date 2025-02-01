import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		String result = "";
		char[] cArr = str.toCharArray();
		
		for(char c : cArr) {
			if(c >= 'a' && c <= 'z') { //소문자라면
				String s = String.valueOf(c);
				result+=s.toUpperCase();
			}else if(c >= 'A' && c <= 'Z'){ //대문자라면
				String s = String.valueOf(c);
				result+=s.toLowerCase();
			}
		}
		
		System.out.println(result);
		
		sc.close();
		
	}

}
