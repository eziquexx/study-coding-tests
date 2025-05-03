package baekjoon.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 25.05.04
// 문제 번호: BOJ 1008
// 문제 제목: A/B
// 풀이 내용: 
// (1) BufferedReader+InputStreamReader 사용.
// (2) 한 줄로 입력받은 두 개의 정수 값을 공백 기준으로 나눈 다음 String타입의 배열에 저장.
// (3) 숫자로 형변환 시킨다음 각각 A, B 변수에 입력 받은 값들 저장.
// (4) 소수점까지 나오도록 해야하므로 double타입으로 형변환 시킨다음 계산하기.
public class BOJ1008_v2_2 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 자동으로 입력 받은 값을 공백 기준으로 문자열타입의 배열로 저장.
    String[] strs = br.readLine().split(" ");

    // 문자열타입 배열에서 값 가져와서 각각 저장.
    int A = Integer.parseInt(strs[0]);
    int B = Integer.parseInt(strs[1]);

    // double타입으로 형변환후 계산.
    double sum = (double) A / B;

    // 출력.
    System.out.println(sum);
  }
}