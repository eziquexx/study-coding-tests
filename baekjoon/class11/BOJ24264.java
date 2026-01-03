package baekjoon.class11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 26.01.03
// 문제 번호: BOJ 24264
// 풀이 내용: 
// 1. 입력값의 크기가 1<=n<=500,000 이다.
// 2. 총 실행 횟수는 i와 j의 곱이다. 즉 각각 i~n, j~n번이기 때문에 n*n이다.
//    여기서 입력값 크기를 고려하여 long 타입으로 형변환 시켜줘야한다.
// 3. 두번째는 실행 횟수를 다항식으로 나타내었을 때에는
//    n * n은 n의 2제곱이기 때문에 무조건 2가 답이다.

public class BOJ24264 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 입력값
    int n = Integer.parseInt(br.readLine());

    // 계산&출력
    // 첫번째는 i는 1~n까지 j도 1~n까지 반복이기 때문에 n*n의 값.
    // 그리고 출력 시 long형타입 변환 시켜줘야함.
    // 두번째는 n의 2제곱이기 때문에 무조건 2
    System.out.println((long) n * n);
    System.out.println(2);
  }
}
