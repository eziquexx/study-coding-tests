package baekjoon.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 25.05.04
// 문제 번호: BOJ 1008
// 문제 제목: A/B
// 풀이 내용: 
// (1) BufferedReader+InputStreamReader 사용.
// (2) 두 개의 정수 값을 받을 때 숫자로 형변환 시켜주기.
// (3) 소수점까지 나오도록 해야하므로 double타입으로 형변환 시킨다음 계산하기.
public class BOJ1008_v2 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 입력 받은 정수를 숫자로 형변환 시키고 A, B에 각각 담기.
    int A = Integer.parseInt(br.readLine());
    int B = Integer.parseInt(br.readLine());

    // double타입으로 형변환 한 다음 계산하여 저장.
    double sum = (double) A / B ;

    // 출력
    System.out.println(sum);
  }
}