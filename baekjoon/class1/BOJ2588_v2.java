package baekjoon.class1;

import java.util.Scanner;

// 문제 푼 날짜: 25.05.06
// 문제 번호: BOJ 2588
// 문제 제목: 곱셈
// 풀이 내용: 
// (1) Scanner 클래스를 사용하여 입력 값 받기.
// (2) 입력 받은 값을 String타입으로 A, B 변수에 저장.
// (3) 변수 B를 .toCharArray()메서드 사용하여 char[]에 문자형으로 바꾸어서 한 글자씩 저장.
// (4) 변수 A를 숫자로 형변환하여 numA에 저장.
// (5) 첫 번째 입력 값 A와 String[] arrB의 각 index별로 곱한 값을 개별로 저장.
// (6) 문자형은 문자라서 아스키코드 값으로 나오기 때문에 - '0'을 사용하여 숫자로 바꾸기. 
// (7) 출력
public class BOJ2588_v2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String A = sc.nextLine();
    String B = sc.nextLine();

    char[] charB = B.toCharArray();

    int numA = Integer.parseInt(A);

    int sum1 = numA * (charB[2] - '0');
    int sum2 = numA * (charB[1] - '0');
    int sum3 = numA * (charB[0] - '0');
    int sum4 = sum1 + (sum2 * 10) + (sum3 * 100);

    System.out.println(sum1);
    System.out.println(sum2);
    System.out.println(sum3);
    System.out.println(sum4);

    sc.close();
  }
}