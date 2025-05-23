package baekjoon.class4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 문제 푼 날짜: 25.05.24
// 문제 번호: BOJ 10811
// 문제 제목: 바구니 뒤집기
// 풀이 내용: 
// swap 방식으로 변경.
public class BOJ10811_v2 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String[] input = br.readLine().split(" ");
    int N = Integer.parseInt(input[0]); // 바구니 몇 개
    int M = Integer.parseInt(input[1]); // 몇 번 반복

    int[] basket = new int[N];

    for (int i = 0; i < basket.length; i++) {
      basket[i] = i + 1; // 바구니 번호 지정.
    }

    // 바구니 뒤집기 계산
    for (int m = 0; m < M; m++) { // 반복 횟수
      String[] nums = br.readLine().split(" ");
      int i = Integer.parseInt(nums[0]) - 1;
      int j = Integer.parseInt(nums[1]) - 1;

      while (i < j) { 
        int temp = basket[i];

        basket[i] = basket[j];
        basket[j] = temp;

        i++;
        j--;
      }

 
    }

    for (int num : basket) {
      bw.write(num + " ");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}
