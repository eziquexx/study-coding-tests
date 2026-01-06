package baekjoon.class12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

// 문제 푼 날짜: 26.01.06
// 문제 번호: BOJ 2331
// 풀이 내용: 
// 1. 입력값 N을 자연수라고 하고, N부터 -1씩 감소 시킨 자연수의 분해합이 N과 동일하고
//    N과 비교했을 때 작은 값을 구하기.
public class BOJ2331 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 입력
    int N = Integer.parseInt(br.readLine());
    int M = N;

    int sum;
    int result;

    // -1 씩 감소시키며 분해합을 모두 구하여 배열에 저장 후 가장 작은 수를 출력
    for (int i = N; i > 0; i--) {
      String num = String.valueOf(i); // -1씩 감소한 값
      ArrayList<String> numArr = new ArrayList<>(); // num 각 자리수
      sum = 0; // 초기화
      result = 0; // 초기화

      // num 길이만큼 반복하여 1자리 값 구하기.
      for (int j = 0; j < num.length(); j++) {
        numArr.add(String.valueOf(num.charAt(j)));
        int n = Integer.parseInt(numArr.get(j));
        sum += n;
      }

      // 분해합
      result = sum + Integer.parseInt(num);

      if (result == N) {
        M = Math.min(Integer.parseInt(num), M);
      }
    }

    // 결과
    if (M == N) {
      System.out.println(0);
    } else {
      System.out.println(M);
    }

    br.close();
  }
}
