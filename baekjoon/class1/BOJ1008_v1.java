package baekjoon.class1;

import java.util.Scanner;

// 문제 푼 날짜: 25.05.04
// 문제 번호: BOJ 1008
// 문제 제목: A/B
// 풀이 내용: 
// (1) Scanner 클래스를 사용하여 입력 값 받기.
// (2) 입력 받는 값은 정수로 각각 A, B에 저장.
// (3) 입력 받은 정수들 계산할 때 double로 형변환하여 계산하고 저장도 double타입 변수에 저장.
public class BOJ1008_v1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 두 정수를 입력 받아 각각 A, B 변수에 저장.
    int A = sc.nextInt();
    int B = sc.nextInt();

    // 입력 받은 정수를 double 타입으로 변경하여 double타입의 변수에 저장.
    double sum = (double) A / B;

    // 출력
    System.out.println(sum);
    
    sc.close();
  }
}