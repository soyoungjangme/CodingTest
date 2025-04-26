

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        sc.nextLine();  // 버퍼 비우기

        for (int j = 0; j < i; j++) {
            String VPS = sc.next();
            int cnt = 0;
            boolean isValid = true;

            for (int k = 0; k < VPS.length(); k++) {
                char ch = VPS.charAt(k);

                if (ch == '(') {
                    cnt++;
                } else if (ch == ')') {
                    cnt--;
                }

                if (cnt < 0) {
                    isValid = false;
                    break;
                }
            }

            if (cnt == 0 && isValid) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
