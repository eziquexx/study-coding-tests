package baekjoon.class5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 25.06.15
// 문제 번호: BOJ 11718
// 풀이 내용: 
// (1) BufferedReader 객체 생성
// (2) String input 선언
// (3) while문 사용해서 input값이 null이 아니면 true 이므로 계쏙 실행하도록 작성
// (4) BufferedReader .close() 하기
public class BOJ11718_v1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String input; // input 선언만

    while ((input = br.readLine()) != null) { // 입력값이 null이 아니면 true 이므로 계속 실행
      System.out.println(input);
    }

    br.close();
  }
}
