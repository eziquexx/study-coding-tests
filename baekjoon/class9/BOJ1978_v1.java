package baekjoon.class9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 25.07.31
// 문제 번호: BOJ 1978
// 풀이 내용: 
// 1. BufferedReader로 입력값 받기.
// 2. int N에 입력 개수 받기.
// 3. String[] n에 공백 기준으로 나누어 입력값 배열로 저장.
// 4. int count = 0; 소수가 몇 개인지 세기 위한 카운트 선언 및 초기화.
// 5. for문 사용하여 N번 반복.
// 6. 중첩 for문으로 n의 각 요소 만큼 반복하면서 String nums에 j번째 값을 저장.
// 7. String nums를 공백 기준으로 나누어 String[] result에 저장.
// 8. result의 length가 2이면 소수이므로 count++ 시켜주기.
// 9. count 출력.

public class BOJ1978_v1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine()); // 입력 개수
    String[] n = br.readLine().split(" "); // 공백 기준으로 나누어 저장
    int count = 0; // 소수의 개수

    for (int i = 0; i < N; i++) {
      // 나머지 0인 값 구해서 nums에 저장
      String nums = "";
      for (int j = 1; j <= Integer.parseInt(n[i]); j++) {
        if (Integer.parseInt(n[i]) % j == 0) {
          nums = nums + j + " ";
        }
      }

      // nums를 공백 기준으로 나눈 2개이면 count++
      String[] result = nums.split(" ");
      if (result.length == 2) {
        count++;
      }
    }

    System.out.println(count);
    br.close();
  }
}
