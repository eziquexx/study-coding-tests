package baekjoon.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 25.05.09
// 문제 번호: BOJ 14681
// 문제 제목: 사분면 고르기
// 풀이 내용: 
// (1) BufferedReader + InputStreamReader 클래스를 사용하여 입력 값 받아서 각각 int타입의 x, y에 저장.
// (2) if문을 사용하여 식 계산
//     x와 y가 양수면 1, x가 음수이고 y가 양수면 2, 
//     x와 y가 음수면 3, x가 양수이고 y가 음수이면 4
//     혹실도 x와 y가 0이 입력될 수도 있으니 0이 출력되도록 작성. 
public class BOJ14681_v1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int x = Integer.parseInt(br.readLine());
    int y = Integer.parseInt(br.readLine());

    if (x > 0 && y > 0) {
      System.out.println(1);
    } else if (x < 0 && y > 0) {
      System.out.println (2);
    } else if (x < 0 && y < 0) {
      System.out.println(3);
    } else if (x > 0 && y < 0) {
      System.out.println(4);
    } else {
      System.out.println(0);
    }
  }
}