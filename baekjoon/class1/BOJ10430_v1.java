package baekjoon.class1;

import java.util.Scanner;

// 문제 푼 날짜: 25.05.05
// 문제 번호: BOJ 10430
// 문제 제목: ??!
// 풀이 내용: 
// (1) Scanner 클래스를 사용하여 입력 값 받기.
// (2) 3개의 정수 값을 받기.
// (3) 4개의 식 계산 후 저장한 다음 출력.
public class BOJ10430_v1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();

    int sum1 = (A + B) % C;
    int sum2 = ((A % C) + (B % C)) % C;
    int sum3 = (A * B) % C;
    int sum4 = ((A % C) * (B % C)) % C;

    System.out.println(sum1);
    System.out.println(sum2);
    System.out.println(sum3);
    System.out.println(sum4);
  }
}