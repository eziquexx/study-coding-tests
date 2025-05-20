package baekjoon.class4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 문제 푼 날짜: 25.05.18
// 문제 번호: BOJ 10807
// 문제 제목: 개수 세기
// 풀이 내용: 
// (1) for-each문 사용해보기.
// (2) int N을 활용 못해서 실패. fore-each문은 적합하지 않은 거 같다.
public class BOJ10807_v5 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    // int N = Integer.parseInt(br.readLine());
    String[] input = br.readLine().split(" ");
    int V = Integer.parseInt(br.readLine());
    int count = 0;

    for (String num : input) {
      if (num.equals(String.valueOf(V))) {
        count++;
      }
    }

    bw.write(count + "\n");
    bw.flush();
    bw.close();
    br.close();
  }
}