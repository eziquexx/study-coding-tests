package baekjoon.class8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 다시 연습

public class BOJ1193_v2 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int X = Integer.parseInt(br.readLine()); // 입력값

    int x = 1; // 분자
    int y = 1; // 분모
    int count = 1; // 회수

    boolean goingUp = true; // up은 true, down은 false
    
    // while문 사용해서  X의 값이 count보다 크면 true
    while (X > count) {
      
      if (goingUp) { // 우측, 대각선 아래로 가야하는 경우
        x--;
        y++;

        if (x == 0) { // 0이면 1로 변경. 위에서 아래로.
          x = 1;
          goingUp = false;
        }
      } else { // 아래, 대각선 위로 가야하는 경우
        x++;
        y--;

        if (y == 0) { // 0이면 1로 변경. 아래에서 위로.
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
