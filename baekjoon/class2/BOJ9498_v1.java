package baekjoon.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 25.05.08
// 문제 번호: BOJ 9498
// 문제 제목: 시험 성적
// 풀이 내용: 
// (1) BufferedReader + InputStreamReader 클래스를 사용하여 입력 값 받아서 int score에 저장.
// (2) if문을 사용하여 각 점수 범위에 맞는 학점을 출력하기.
public class BOJ9498_v1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int score = Integer.parseInt(br.readLine());

    if (90 <= score && score <= 100) {
      System.out.println("A");
    } else if (80 <= score && score < 90) {
      System.out.println("B");
    } else if (70 <= score && score < 80) {
      System.out.println("C");
    } else if (60 <= score && score < 70) {
      System.out.println("D");
    } else if (0 <= score && score < 60) {
      System.out.println("F");
    } else {
      System.out.println("0~100 사이의 점수를 입력해주세요.");
    }
  }
}