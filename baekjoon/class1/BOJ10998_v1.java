package baekjoon.class1;

import java.util.Scanner;

// 문제 푼 날짜: 25.05.03
// 문제 번호: BOJ 10998
// 문제 제목: AxB
// 풀이 내용: 
// (1) Scanner 클래스를 사용하여 입력 값을 콘솔로 받은 다음, 두 수를 곱한 다음 결과를 내기.
public class BOJ10998_v1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 정수 2개 값을 A, B로 받기.
    int A = sc.nextInt();
    int B = sc.nextInt();

    // AxB 결과 저장.
    int sum = A * B;

    // 출력
    System.out.println(sum);

    sc.close();
  }
}