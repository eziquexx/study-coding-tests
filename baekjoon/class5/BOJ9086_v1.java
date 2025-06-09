package baekjoon.class5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 25.06.09
// 문제 번호: BOJ 9086
// 풀이 내용: 
// (1) BufferedReader 클래스를 사용하여 입력값 받기.
// (2) int T에 테스트 숫자 입력 받기.
// (3) for문 사용하여 계산.
//     : int i = 0; i < T 번 반복
//     : String word에 단어 입력 받기.
//     : char first에 .charAt() 사용해서 첫번째 글자 저장.
//     : char last에 .charAt() 사용해서 마지막 글자 저장.
//     : first와 last 출력.
public class BOJ9086_v1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());

    for (int i = 0; i < T; i++) {
      String word = br.readLine();
      char first = word.charAt(0);
      char last = word.charAt(word.length() - 1);

      System.out.println(first + "" + last);
    }

    br.close();
  }
}