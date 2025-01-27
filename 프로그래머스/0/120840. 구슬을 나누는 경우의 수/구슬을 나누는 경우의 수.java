class Solution {
    public double solution(int balls, int share) {
        double answer = 1;

        // share만큼 곱셈과 나눗셈을 동시에 수행
        for (int i = 0; i < share; i++) {
            answer *= (balls - i);
            answer /= (i + 1);
        }

        return answer;
    }
}
