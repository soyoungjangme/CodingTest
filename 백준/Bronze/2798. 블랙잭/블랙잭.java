
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  // 카드 개수
        int M = sc.nextInt();  // 제시값
        int[] cards = new int[N];

        for (int i = 0; i < N; i++) {
            cards[i] = sc.nextInt();  // 카드 숫자 입력
        }

        int maxSum = 0;

        // 3장의 카드를 모두 선택하는 모든 경우의 수 탐색
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    int sum = cards[i] + cards[j] + cards[k]; // 3장의 합
                    if (sum <= M && sum > maxSum) {  // M을 넘지 않으면서 최댓값 갱신
                        maxSum = sum;
                    }
                }
            }
        }

        System.out.println(maxSum);
        
        sc.close();
    }
}
