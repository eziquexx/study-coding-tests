package baekjoon.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 25.05.08
// 문제 번호: BOJ 1330
// 문제 제목: 두 수 비교하기
// 풀이 내용: 
// (1) BufferedReader + InputStreamReader 클래스를 사용하여 입력값 한 줄로 받기.
// (2) 입력 받는 값은 String타입에 배열로 공백 기준으로 나누어 두 개의 값을 저장.
// (3) int타입의 A, B 변수에 각각 배열로 받은 값들을 1개씩 저장.
// (4) if문을 사용하여 두 수를 비교하여 >, <,, == 값 출력.
public class BOJ1330_v2 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] strs = br.readLine().split(" ");

    int A = Integer.parseInt(strs[0]);
    int B = Integer.parseInt(strs[1]);
    
    if (A > B) {
      System.out.println(">");
    } else if (A < B) {
      System.out.println("<");
    } else {
      System.out.println("==");
    }
  }
}