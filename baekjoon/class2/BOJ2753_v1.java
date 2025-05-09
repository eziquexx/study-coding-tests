package baekjoon.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 25.05.089
// 문제 번호: BOJ 2753
// 문제 제목: 윤년
// 풀이 내용: 
// (1) BufferedReader + InputStreamReader 클래스를 사용하여 입력 값 받아서 int year에 저장.
// (2) if문을 사용하여 윤달인지 여부 확인하여 윤달이면 1, 아니면 0 출력.
//     - 윤달: 4의 배수, 100의 배수가 아님, 400의 배수임.
public class BOJ2753_v1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int year = Integer.parseInt(br.readLine());

    int a = year % 4;
    int b = year % 100;
    int c = year % 400;

    if (a == 0) {
      // 100의 배수가 아니라서 윤년, 400의 배수라서 윤년.
      // b != 0 이면 윤년.
      // b == 0 이면 윤년 아님
      // c == 0 윤년
      if (b != 0 || c == 0) {
        System.out.println("1");
      } else {
        System.out.println("0");
      }
    } else {
      System.out.println("0");
    }
  }
}