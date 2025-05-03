package baekjoon.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 25.05.03
// 문제 번호: BOJ 10998
// 문제 제목: AxB
// 풀이 내용: 
// (1) BufferedREader + InputStreamReader 사용하여 문제를 풀었다.
public class BOJ10998_v2 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 두 정수 입력값 받기.
    int A = Integer.parseInt(br.readLine());
    int B = Integer.parseInt(br.readLine());

    // 입력 받은 정수 값 곱하기.
    int sum = A * B;

    // 출력하기.
    System.out.println(sum);
  }
}