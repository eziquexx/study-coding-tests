package baekjoon.class12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 26.01.07
// 문제 번호: BOJ 19532
// 풀이 내용: 
// 1. x, y의 범위를 지정해놓고 방정식에 대입하여 x, y 값 찾기

public class BOJ19532 {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 입력
    String nums[] = br.readLine().split(" ");
    
    // a, b, c, d, e, f 값 지정
    int a = Integer.parseInt(nums[0]);
    int b = Integer.parseInt(nums[1]);
    int c = Integer.parseInt(nums[2]);
    int d = Integer.parseInt(nums[3]);
    int e = Integer.parseInt(nums[4]);
    int f = Integer.parseInt(nums[5]);
    
    // 계산, 결과
    for (int x = -999; x <= 999; x++) {
      for (int y = -999; y <= 999; y++) {
        if (a * x + b * y == c && d * x + e * y == f) {
          System.out.println(x + " " + y);
          return;
        }
      }
    }

  }
}
