package baekjoon.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 25.05.06
// 문제 번호: BOJ 2588
// 문제 제목: 곱셈
// 풀이 내용: 
// (1) BufferedReader + InputStreamReader 클래스를 사용하여 입력 값 받기.
// (2) 입력 받은 값을 String타입으로 A, B 변수에 저장.
// (3) 변수 B를 숫자로 형변환하여 int b에 저장.
// (4) 변수 A를 숫자로 형변환 한 다음와 b의 곱한 값을 int sum에 저장.
// (5) int[] 배열 선언과 초기화 하기. 
//     int[] arrLen = new int[B.length()]; B의 길이만큼 크기 정해주기.
// (6) for문을 사용하여 B의 길이만큼 반복시키기.
//     b % 10의 나머지 값을 int[] arrLen에 저장하기. 
//     이때 int[] 형태라서 int[i] = b % 10; 값을 넣어주기.
//     그리고 b / 10의 몫을 b에 저장. 
// (7) for문의 반복 횟수에 맞추어 B % 10 나머지 값들과 A를 곱한 값을 출력하고 int sum도 출력. 
public class BOJ2588_v4 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String A = br.readLine();
    String B = br.readLine();

    int b = Integer.parseInt(B);
    int sum = Integer.parseInt(A) * b;

    int[] arrLen = new int[B.length()];

    for (int i = 0; i < B.length(); i++) {
      int result = b % 10;
      arrLen[i] = result;

      b = b / 10;

      System.out.println(arrLen[i] * Integer.parseInt(A));
    }

    System.out.println(sum);
  }
}