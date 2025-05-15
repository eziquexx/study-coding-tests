package baekjoon.class1;

import java.util.Scanner;

// 문제 푼 날짜: 25.05.06
// 문제 번호: BOJ 2588
// 문제 제목: 곱셈
// 풀이 내용: 
// (1) Scanner 클래스를 사용하여 입력 값 받기.
// (2) 입력 받은 값을 int타입으로 A, B 변수에 저장.
// (3) 변수 B를 String 타입으로 변환하여 strB에 저장.
// (4) 변수 strB를 .split()메서드 사용하여 1글자씩 String[] 으로 저장.
// (5) 첫 번째 입력 값 A와 String[] arrB의 각 index별로 곱한 값을 개별로 저장.
// (6) 출력
public class BOJ2588_v1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt();
    int B = sc.nextInt();

    String strB = String.valueOf(B);
    String[] arrB = strB.split("");

    int sum1 = A * Integer.parseInt(arrB[2]);
    int sum2 = A * Integer.parseInt(arrB[1]);
    int sum3 = A * Integer.parseInt(arrB[0]);
    int sum4 = sum1 + (sum2 * 10) + (sum3 * 100);

    System.out.println(sum1);
    System.out.println(sum2);
    System.out.println(sum3);
    System.out.println(sum4);

    sc.close();
  }
}