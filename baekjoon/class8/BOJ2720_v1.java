package baekjoon.class8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 25.06.30
// 문제 번호: BOJ 2720
// 풀이 내용: 
// 1. 입력은 BufferedReader 사용
// 2. int T에 테스트케이스 입력값 받기.
// 3. quarter, dime, nickel, penny 정수로 저장.
// 4. for문 사용하여 T 만큼 반복.
// 5. int C에 거스름돈 입력 받기. 
// 6. while문 사용해서 C가 0보다 클 때까지 반복.
// 7. if문 사용하여 C를 quarter, dime, nickel, penny 순으로 나눈 값들을 q, d, n, p에 각각 저장.
// 8. q, d, n, p 사이에 공백을 두고 출력.
// 9. BufferedReaer .close() 하기

public class BOJ2720_v1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int T = Integer.parseInt(br.readLine());

    /*
     * 쿼터(Quarter, $0.25)의 개수, 
     * 다임(Dime, $0.10)의 개수, 
     * 니켈(Nickel, $0.05)의 개수, 
     * 페니(Penny, $0.01)의 개수
     */

     int quarter = 25;
     int dime = 10;
     int nickel = 5;
     int penny = 1;

     // 테스트케이스 만큼 반복
     for (int i = 0; i < T; i++) {
      int C = Integer.parseInt(br.readLine()); // 거스름돈
      
      // input을 쿼터, 다임, 니켈, 페니 순으로 나누기
      int q = 0, d = 0, n = 0, p = 0;
      
      while (C > 0) {
        if (C >= quarter) {
          q = C / quarter;
          C = C - (q * quarter);
        } else if (C >= dime) {
          d = C / dime;
          C = C - (d * dime);
        } else if (C >= nickel) {
          n = C / nickel;
          C = C - (n * nickel);
        } else {
          p = C / penny;
          C = C - (p * penny);
        }
      }
      System.out.println(q + " " + d + " " + n + " " + p);
    }
    br.close();
  }
}
