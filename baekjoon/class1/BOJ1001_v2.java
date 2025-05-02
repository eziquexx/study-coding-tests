package baekjoon.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 25.05.02
// 문제 번호: BOJ 1001
// 문제 제목: A-B
// 풀이 내용: 
// (1) BufferedReader + InputStreamReader 사용
// (2) .readLine()은 문자열만 가능하기 때문에 숫자로 형변환 시키기.
public class BOJ1001_v2 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int A = Integer.parseInt(br.readLine());
    int B = Integer.parseInt(br.readLine());

    int sum = A - B;

    System.out.println(sum);
  }
}