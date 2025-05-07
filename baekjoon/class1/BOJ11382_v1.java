package baekjoon.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 25.05.07
// 문제 번호: BOJ 11382
// 문제 제목: 꼬마 정민. A+B+C의 값을 출력하기
// 풀이 내용: 
// (1) BufferedReader + InputStreamReader 내장 클래스 사용.
// (2) 입력 받은 값을 공백 기준으로 .split(" ")한 다음, String[] strs에 저장.
// (3) long타입의 A, B, C에 각각 0, 1, 2번째 값을 저장 후 계산하여 출력.
public class BOJ11382_v1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] strs = br.readLine().split(" ");

    long A = Long.parseLong(strs[0]);
    long B = Long.parseLong(strs[1]);
    long C = Long.parseLong(strs[2]);

    long sum = A + B + C;

    System.out.println(sum);
  }
}