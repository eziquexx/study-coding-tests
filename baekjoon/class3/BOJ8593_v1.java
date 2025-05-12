package baekjoon.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 25.05.13
// 문제 번호: BOJ 8593
// 문제 제목: 합
// 풀이 내용: 
// (1) BufferedReader + InputStreamReader 클래스를 사용하여 입력값 받기.
// (2) 입력 받은 값은 int n에 저장.
// (3) 최종 값을 담을 변수 생성 및 초기화. int result = 0;
// (4) for문을 사용하여 1부터 n까지의 합을 result에 담는다.
// (5) for문 밖에서 result의 값을 출력한다.
public class BOJ8593_v1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int result = 0;

    for (int i = 1; i <= n; i++) {
      result = result + i;
    }
    System.out.println(result);
  }
}