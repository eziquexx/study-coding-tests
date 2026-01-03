package baekjoon.class11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 26.01.03
// 문제 번호: BOJ 24266
// 풀이 내용: 
// 1. 입력값의 크기가 1<=n<=500,000 이다.
// 2. 총 실행 횟수는 중첩 for문이 i, j, k 가 있고 각 1~n까지 반복이기 때문에
//    n * n * n 이다. 즉, n의 3제곱.
// 3. 실행횟수를 다항식으로 바꾸어 차수를 구하면 n의 3제곱이므로 무조건 3.

public class BOJ24266 {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 입력
    int n = Integer.parseInt(br.readLine());

    // 출력
    // 첫번째는 중첩 for문으로 i, j, k이기 때문에 즉 n의 3제곱
    System.out.println((long) n * n * n);

    // 두번째는 n의 3제곱이기 때문에 무조건 3
    System.out.println(3);
  }
}
