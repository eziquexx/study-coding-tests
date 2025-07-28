package baekjoon.class9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 25.07.28
// 문제 번호: BOJ 9506
// 풀이 내용: 
// 1. BufferedReader로 입력값 받기.
// 2. while문을 사용하여 무한 반복. 단, -1 입력되면 종료.
// 3. 입력 값은 int n에 저장.
// 4. for문을 사용하여 n % i = 0이면 i를 String output에 저장. (i = 1 초기화)
// 5. String output에 저장된 값을 String[] nums에 배열 형태로 저장.
// 6. n을 제외한 나머지 약수를 int result에 저장.
// 7. n이 완전수인지 체크하여 값 출력. 

public class BOJ9506_v1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    while (true) {
      int n = Integer.parseInt(br.readLine());
      String output = "";
      int result = 0;

      if (n < 0) {
        return;
      }

      // n % i = 0의 값 저장.
      for (int i = 1; i <= n; i++) {
        if (n % i == 0) {
          output = output + i + " ";
        }
      }
      
      // n을 제외한 나머지 값의 합과 비교하여 계산
      String[] nums = output.split(" ");
      for (int j = 0; j < nums.length; j++) {
        if (Integer.parseInt(nums[j]) == n) {
          continue;
        } else {
          result += Integer.parseInt(nums[j]);
        }
      }

      // 완전수 여부 계산
      if (n == result) {
        System.out.print(n + " = ");
        for (int k = 0; k < nums.length; k++) {
          int val = Integer.parseInt(nums[k]);
          if (val == n) {
            continue;
          }
          System.out.print(nums[k]);

          if (k != nums.length - 2) { 
            System.out.print(" + ");
          }
        }
        System.out.println();
      } else {
        System.out.println(n + " is NOT perfect.");
      }
    }
  }
}
