package baekjoon.class12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 26.01.05
// 문제 번호: BOJ 2798
// 풀이 내용: 
// 1. 카드 3장을 중첩반복문을 사용하여 i, j, k의 합을 구하기.
// 2. i, j, k의 합이 M보다 작거나 같으면 result에 저장.
//    단, result와 비교하여 가장 큰 값을 저장.

public class BOJ2798 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 입력
    String firstInput[] = br.readLine().split(" ");
    int N = Integer.parseInt(firstInput[0]); // 카드 개수
    long M = Integer.parseInt(firstInput[1]); // 3장의 카드 합
    String secondInput[] = br.readLine().split(" "); // 카드 번호
  
    int cards[] = new int[N]; // 형변환 하기 위한 카드 배열
    for (int i = 0; i < N; i++) {
      cards[i] = Integer.parseInt(secondInput[i]);
    }

    // 계산 및 결과
    int result = 0;
    for (int i = 0; i < N; i++) {
      for (int j = i+1; j < N; j++) {
        for (int k = j+1; k < N; k++) {
          int sum = cards[i] + cards[j] + cards[k];
          if (sum == M || sum < M) {
            result = Math.max(sum, result); // sum과 result 값 비교하여 하나의 값만 저장
          }
        }
      }
    }
    System.out.println(result);
  }
}
