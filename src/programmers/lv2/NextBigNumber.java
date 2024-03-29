package programmers.lv2;

public class NextBigNumber {
    public static void main(String[] args) {

//        조건 1. n의 다음 큰 숫자는 n보다 큰 자연수 입니다.
//        조건 2. n의 다음 큰 숫자와 n은 2진수로 변환했을 때 1의 갯수가 같습니다.
//        조건 3. n의 다음 큰 숫자는 조건 1, 2를 만족하는 수 중 가장 작은 수 입니다.

        int n = 78;

        String s = Integer.toBinaryString(n);
        long count = Integer.bitCount(n);

        while (true) {
            n += 1;
            String temp = Integer.toBinaryString(n);

            if (Integer.bitCount(n) == count) {
                System.out.println(n);
                return;
            }
        }
    }
}

