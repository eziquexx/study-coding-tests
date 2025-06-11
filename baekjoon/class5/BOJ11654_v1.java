package baekjoon.class5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 25.06.11
// 문제 번호: BOJ 11654
// 풀이 내용: 
// (1) BufferedReader 클래스를 사용하여 입력값 받기.
// (2) String input에 입력값 받아서 저장.
// (3) 출력시 input.hashCode() 를 사용하여 아스키코드로 출력.
public class BOJ11654_v1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String input = br.readLine();

    System.out.println(input.hashCode());
  }
}
