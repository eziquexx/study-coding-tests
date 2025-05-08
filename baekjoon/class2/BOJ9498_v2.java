package baekjoon.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 25.05.08
// 문제 번호: BOJ 9498
// 문제 제목: 시험 성적
// 풀이 내용: 
// (1) BufferedReader + InputStreamReader 클래스를 사용하여 입력 값 받아서 int score에 저장.
// (2) if문과 switch문을 사용하여 각 점수 범위에 맞는 학점을 출력하기.
public class BOJ9498_v2 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int score = Integer.parseInt(br.readLine());

    if (0 > score || score > 100) {
      System.out.println("0~100 사이의 점수를 입력해주세요.");
    } else {
      switch(score / 10) {
        case 10:
        case 9:
          System.out.println("A");
          break;
        case 8:
          System.out.println("B");
          break;
        case 7:
          System.out.println("C");
          break;
        case 6:
          System.out.println("D");
          break;
        default:
          System.out.println("F");
          break;
      }
    }
  }
}