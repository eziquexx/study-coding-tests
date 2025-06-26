package baekjoon.class7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 25.06.26
// 문제 번호: BOJ 2563
// 풀이 내용: 
// 1. BufferedReader로 입력값 받기.
// 2. 몇 번 반복할지 int n에 입력받은 값 저장.
// 3. 100 * 100 크기의 종이를 boolean 타입 2차원배열 생성
// 4. for문 사용하여 n번 반복.
// 5. 입력받은 값을 공백 기준으로 나눈 다음 각각 x, y에 저장
// 6. 중첩 for문으로 x ~ x+10, y ~ y+10 를 각각 순회하면서 false이면 true로 변경하고 area의 값을 1씩 증가시켜준다.
// 7. area 값 출력하고 BufferedReader에 .close() 시켜주기.

public class BOJ2563_v1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine()); // 반복 횟수
    
    boolean[][] paper = new boolean[100][100]; // 100 * 100 면적의 종이
    int area = 0;

    for (int i = 0; i < n; i++) { // n번 반복
      String[] input = br.readLine().split(" "); 
      // 입력 값 각 x, y에 저장
      int x = Integer.parseInt(input[0]);
      int y = Integer.parseInt(input[1]);

      // 면적 계산
      for (int j = x; j < x + 10; j++) {
        for (int k = y; k < y + 10; k++) {
          if (!paper[j][k]) {
            paper[j][k] = true;
            area++;
          }
        }
      }
    }
    System.out.println(area);
    br.close();    
  }
}
