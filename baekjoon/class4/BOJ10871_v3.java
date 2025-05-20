package baekjoon.class3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 문제 푼 날짜: 25.05.19
// 문제 번호: BOJ 10871
// 문제 제목: 개수 세기
// 풀이 내용: 
// (1) BOJ10871_v1 을 조금 더 줄여보려고 코드를 줄여보았다.
// (2) 크게 변한 것은 없으므로 설명은 생략.
public class BOJ10871_v3 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String[] nx = br.readLine().split(" ");
    String[] numbers = br.readLine().split(" ");

    for (int i = 0; i < Integer.parseInt(nx[0]); i++) {
      if (Integer.parseInt(numbers[i]) < Integer.parseInt(nx[1])) {
        int result = Integer.parseInt(numbers[i]);

        bw.write(result + " ");
      }
    }

    bw.flush();
    bw.close();
    br.close();
  }
}