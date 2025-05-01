package baekjoon.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 25.05.01
// 문제 번호: BOJ 1000
// 문제 제목: A+B
// 풀이 내용: 
// (1) BufferedReader 클래스 사용하여 사용자한테 두 개의 정수를 입력 받은 뒤, 두 수의 합을 더한 다음 출력하기.
// (2) .readLine() 메서드 사용하기.
// (3) .readLine()은 문자열만 입력이 되기 때문에 정수로 형변환 시켜주기.
public class BOJ1000_v2 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("첫 번째 숫자(정수)를 입력해주세요: ");
    int A = Integer.parseInt(br.readLine());

    System.out.println("두 번째 숫자(정수)를 입력해주세요: ");
    int B = Integer.parseInt(br.readLine());

    int sum = A + B;

    System.out.println("입력된 숫자 합: " + sum);
  }
}