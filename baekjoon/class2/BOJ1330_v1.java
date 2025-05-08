package baekjoon.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 25.05.08
// 문제 번호: BOJ 1330
// 문제 제목: 두 수 비교하기
// 풀이 내용: 
// (1) BufferedReader + InputStreamReader 클래스를 사용하여 각각 A, B에 입력값 받아서 저장.
// (2) if문을 사용하여 두 수를 비교하여 >, <,, == 값 출력.
public class BOJ1330_v1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int A = Integer.parseInt(br.readLine());
    int B = Integer.parseInt(br.readLine());
    
    if (A > B) {
      System.out.println(">");
    } else if (A < B) {
      System.out.println("<");
    } else {
      System.out.println("==");
    }
  }
}