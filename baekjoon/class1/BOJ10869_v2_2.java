package baekjoon.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 25.05.05
// 문제 번호: BOJ 10869
// 문제 제목: 사칙연산
// 풀이 내용: 
// (1) BufferedReader + InputStreamReader 클래스를 사용하여 입력 값 받기.
// (2) 문자열타입 배열에 자동으로 입력받은 값을 공백 기준으로 나누어 저장.
// (3) 배열에 담긴 값을 각각 A, B에 저장.
// (4) 입력 받은 값을 + - * / % 사칙연산하여 저장 후 출력
public class BOJ10869_v2_2 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] strs = br.readLine().split(" ");

    int A = Integer.parseInt(strs[0]);
    int B = Integer.parseInt(strs[1]);

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