package baekjoon.class1;

import java.util.Scanner;

// 문제 푼 날짜: 25.05.05
// 문제 번호: BOJ 10869
// 문제 제목: 사칙연산
// 풀이 내용: 
// (1) Scanner 클래스를 사용하여 입력 값 받기.
// (2) 입력 받는 값은 정수로 각각 A, B에 저장.
// (3) 입력 받은 값을 + - * / % 사칙연산하여 저장 후 출력
public class BOJ10869_v1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt();
    int B = sc.nextInt();

    int sum1 = A + B;
    int sum2 = A - B;
    int sum3 = A * B;
    int sum4 = A / B;
    int sum5 = A % B;

    System.out.println(sum1);
    System.out.println(sum2);
    System.out.println(sum3);
    System.out.println(sum4);
    System.out.println(sum5);
  }
}