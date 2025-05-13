package baekjoon.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 25.05.13
// 문제 번호: BOJ 25304
// 문제 제목: 영수증
// 풀이 내용: 
// (1) BufferedReader + InputStreamReader 클래스를 사용하여 입력값 받기.
// (2) int X, int N에 각 총 구매 금액, 총 구매 개수 입력 받아서 저장.
// (3) 총 구매 금액과 비교할 실제 총 구매 금액을 담을 int sum 생성.
// (4) for문을 사용해서 총 구매 개수 만큼 반복.
// (5) 구매 물건 각격은 int a에, 구매 물건 개수는 int b에 입력 값 받아서 저장.
// (6) 실제 총 구매한 가격의 총 합을 int sum에 덧셈 대입 연산자로 차곡 차곡 저장.
// (7) if문을 사용해서 int X와 int sum을 비교하여 금액이 같으면 "Yes", 다르면 "No"
public class BOJ25304_v1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int X = Integer.parseInt(br.readLine()); // 총 구매 금액
    int N = Integer.parseInt(br.readLine()); // 총 구매 개수
    int sum = 0;

    for (int i = 1; i <= N; i++) {
      String[] strs = br.readLine().split(" ");
      int a = Integer.parseInt(strs[0]); // 구매 물건 가격
      int b = Integer.parseInt(strs[1]); // 구매 물건 개수

      int price = a * b; // 구매 물건 총 금액
      sum += price; // 구매 물건 금액 총 합
    }

    if (X == sum) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}