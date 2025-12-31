package baekjoon.class10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 25.12.31
// 문제 번호: BOJ 10101
// 풀이 내용: 
// 1. 세 각의 값은 int형 타입의 angleA, angleB, angleC에 저장.
// 2. 세 각의 합은 int suma에 저장.
// 3. if문을 사용하여 각 조건을 계산하여 결과 출력.

public class BOJ10101 {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 삼각형 각의 크기 a, b, c
    int angleA = Integer.parseInt(br.readLine());
    int angleB = Integer.parseInt(br.readLine());
    int angleC = Integer.parseInt(br.readLine());

    int sum = angleA + angleB + angleC;

    // 세 각의 크기가 모두 60이면, Equilateral
    // 세 각의 합이 180이고, 두 각이 같은 경우에는 Isosceles
    // 세 각의 합이 180이고, 같은 각이 없는 경우에는 Scalene
    // 세 각의 합이 180이 아닌 경우에는 Error
    if (sum == 180) {
      if (angleA == 60 && angleB == 60 && angleC == 60) { 
        System.out.println("Equilateral"); 
      }

      if (angleA == angleB && angleA != angleC) {
        System.out.println("Isosceles"); 
      }
      if (angleA == angleC && angleA != angleB) {
        System.out.println("Isosceles");
      }
      if (angleB == angleC && angleB != angleA) {
        System.out.println("Isosceles");
      }

      if (angleA != angleB && angleA != angleC && angleB != angleC) {
        System.out.println ("Scalene");
      }
    } else {
      System.out.println("Error");
    }
  }
}
