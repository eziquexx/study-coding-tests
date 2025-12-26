package baekjoon.class10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 25.12.26
// 문제 번호: BOJ 27323
// 풀이 내용: 
// 1. BufferedReader로 입력값 받기.
// 2. 가로, 세로를 A, B로 입력 받아 넓이 계산하여 출력.

public class BOJ27323 {
  public static void main(String[] args) throws IOException {
    // 입력
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int A = Integer.parseInt(br.readLine());
    int B = Integer.parseInt(br.readLine());

    // 계산&출력
    int result = A * B;
    System.out.println(result);
  }
}
