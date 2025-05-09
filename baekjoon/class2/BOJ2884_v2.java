package baekjoon.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 25.05.09
// 문제 번호: BOJ 2884
// 문제 제목: 알람 시계
// 풀이 내용: 
// (1) BOJ2884_v1에서 소스코드를 조금이나마 줄여보려고 수정한 코드.
public class BOJ2884_v2 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] strs = br.readLine().split(" ");

    int H = Integer.parseInt(strs[0]);
    int M = Integer.parseInt(strs[1]);

    M -= 45;
    
    if (M < 0) {
      H -= 1; 
      M += 60;
      
      if (M < 0) {
        M += 24;
      }
    } 
    
    System.out.println(H + " " + M);
  }
}