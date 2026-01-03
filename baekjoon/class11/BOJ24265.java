package baekjoon.class11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 26.01.03
// 문제 번호: BOJ 24265
// 풀이 내용: 
// 1. 입력값의 크기가 1<=n<=500,000 이다.
// 2. 총 실행 횟수는 n * (n-1) / 2 이다.
//    (n-1)+(n-2)+(n-3) ... 이렇게 되기 때문에.
// 3. 두번째는 O(n2)이기 때문에 무조건 2가 출력.

public class BOJ24265 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 입력
    int n = Integer.parseInt(br.readLine());

    // 실행횟수 계산 & 출력
    System.out.println((long) n * (n - 1) / 2);

    // O(n2) 이므로 무조건 2
    System.out.println(2);
  }
}
