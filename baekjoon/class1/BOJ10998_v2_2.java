package baekjoon.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 25.05.03
// 문제 번호: BOJ 10998
// 문제 제목: AxB
// 풀이 내용: 
// (1) BufferedREader + InputStreamReader 사용하여 문제를 풀었다.
// (2) 백준에 제출하기 위해서 입력받은 값을 공백 기준으로 나눈다음 String타입 배열로 저장하였다.
public class BOJ10998_v2_2 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 자동으로 입력 받은 값을 공백 기준으로 나누어서 String타입 배열로 저장.
    String[] strs = br.readLine().split(" ");

    // strs 배열에 담긴 값 각각 형변화하여 저장.
    int A = Integer.parseInt(strs[0]);
    int B = Integer.parseInt(strs[1]);

    // 입력 받은 값 계산.
    int sum = A * B;

    // 출력.
    System.out.println(sum);
  }
}