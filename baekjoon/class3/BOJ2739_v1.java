package baekjoon.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 25.05.11
// 문제 번호: BOJ 2739
// 문제 제목: 구구단
// 풀이 내용: 
// (1) BufferedReader + InputStreamReader 클래스를 사용하여 입력값 받기.
// (2) 입력 받은 값은 int N에 저장.
// (3) for문을 사용하여 구구단 완성
public class BOJ2739_v1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int N = Integer.parseInt(br.readLine());

    for (int i = 1; i < 10; i++) {
      int result = N * i;

      System.out.println(N + " * " + i + " = " + result);
    }
  }
}