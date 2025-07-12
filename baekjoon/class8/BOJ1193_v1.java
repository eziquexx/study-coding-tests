package baekjoon.class8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 25.07.12
// 문제 번호: BOJ 1193
// 풀이 내용: 
// 1. 입력은 BufferedReader 사용
// 2. int X에 입력값 받기. (몇번째 분수)
// 3. 분모, 분자, 횟수는 각 x, y, count로 선언하고 1로 초기화.
// 4. 지그재그 대각선으로 방향이므로 boolean 값으로 나타내기.
// 5. while문 사용해서 X가 count 보다 크면 true로 계속 반복. 작으면 false.
//    - if-else문으로 goingUp의 boolean값으로 실행.
//    - goingUp이 ture면 x--, y++ 그리고 x가 0이면 x는 1로 초기화하고,
//    - goingUp을 false로 처리.
//    - goingUp이 false면 x++, y-- 그리고 y가 0이면 y는 1로 초기화하고,
//    - goingUp을 true로 처리.
//    - while문 블럭 마지막에 count++로 횟수 증가 시키기.
// 6. while문 아래에 x + "/" + y 로 분수 출력
// 7. BufferedReader .close() 해주기.

public class BOJ1193_v1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int X = Integer.parseInt(br.readLine()); // 입력값

    int x = 1; // 분모
    int y = 1; // 분자
    int count = 1; // 횟수

    boolean goingUp = true; // 대각선 방향. true면 up, false면 down

    while (count < X) {
      if (goingUp) {
        x--;
        y++;

        if (x == 0) {
          x = 1;
          goingUp = false;
        }
      } else {
        x++;
        y--;

        if (y == 0) {
          y = 1;
          goingUp = true;
        }
      }

      count++;
    }
    

    System.out.println(x + "/" + y);

    br.close();
  }
}