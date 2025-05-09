package baekjoon.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 25.05.09
// 문제 번호: BOJ 2884
// 문제 제목: 알람 시계
// 풀이 내용: 
// (1) BufferedReader + InputStreamReader 클래스를 사용하여 입력 값 한 줄로 받아서
//     String타입의 배열에 공백 기준으로 나눈 값들을 저장.
// (2) 배열에 담은 값을 각각 int타입의 H, M에 저장.
// (3) 45분 전 알람이라서 int M2를 만들어서 M - 45의 값을 저장.
// (4) M2가 0보다 작으면 다음과 같은 식이 실행
//     M2 += 60 해주기. 왜냐하면 분이 음수이기 때문에 60(60분)을 더해주면 45분 전 값이 나온다.
//     그리고 int타입의 H2를 만들어서 H - 1을 해준다. 이때 H2가 0 보다 작으면 마찬가지로 24를 더한 값을 저장한다.
//     최종으로 H2와 M2 값을 출력해준다.
// (5) M2가 0보다 크면 H와 M2의 값을 출력한다.
public class BOJ2884_v1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] strs = br.readLine().split(" ");

    int H = Integer.parseInt(strs[0]);
    int M = Integer.parseInt(strs[1]);

    int M2 = M - 45; // - 45분 해주기
    
    if (M2 < 0) { // - 45한 값이 0 보다 작으면 시간 - 1 해주기.
      int H2 = H - 1; 
      M2 += 60; // 분이 음수이면 60분 더해주기.

      if (H2 < 0) { // 시간이 음수이면 24시간 더해주기.
        H2 = H2 + 24;
      }

      System.out.println(H2 + " " + M2);
    } else {
      System.out.println(H + " " + M2);
    }
  }
}