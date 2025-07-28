package baekjoon.class9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 25.07.28
// 문제 번호: BOJ 2501
// 풀이 내용: 
// 1. BufferedReader로 입력값 받기.
// 2. String[] input에 공백 기준으로 나누어 입력값 저장
// 3. int N, K에 각각 input 값 담기.
// 4. N % i 모든 값을 String[] output에 저장.
// 5. output에서 값이 0인 것만 result에 저장.
// 6. 약수 개수가 K보다 적거나 없으면 0 출력. 크면 K번째 출력.

public class BOJ2501_v1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] input = br.readLine().split(" ");
    int N = Integer.parseInt(input[0]);
    int K = Integer.parseInt(input[1]);
    String[] output = new String[N];
    String result = "";
    int count = 0;

    // N % i 모든 값 저장
    for(int i = 1; i <= N; i++) {
      int sum = N % i;
      output[i-1] = String.valueOf(sum);
    }

    // 값이 0인 것만 저장
    for (int j = 0; j < output.length; j++) {
      if (Integer.parseInt(output[j]) == 0) {
        result = result + (j + 1) + ", ";
        count++;
      }
    }

    // K번째 구하기
    if (count >= K) {
      String[] nums = new String[count];
      nums = result.split(", ");

      System.out.println(nums[K-1]);
    } else {
      System.out.println(0);
    }

    br.close();
  }
}
