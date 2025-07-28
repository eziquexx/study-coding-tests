package baekjoon.class9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 25.07.28
// 문제 번호: BOJ 5086
// 풀이 내용: 
// 1. BufferedReader로 입력값 받기.
// 2. while문을 사용하여 무한 반복. 단, 0 0 입력되면 break;
// 3. String[] input에 입력값을 공백으로 나누어 저장.
// 4. int a, b에 각각 input[0], input[1] 값 저장.
// 5. a가 b의 약수이면 factor, a가 b의 배수이면 multiple, 둘다 아니면 neither

public class BOJ5086_v1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    while (true) {
      String[] input = br.readLine().split(" "); // 공백기준으로 나누어 저장
      int a = Integer.parseInt(input[0]);
      int b = Integer.parseInt(input[1]);

      if (a == 0 && b == 0) {
        break;
      } else if (a % b != 0 && b % a == 0) {
        System.out.println("factor");
      } else if (a % b == 0 && b % a != 0) {
        System.out.println("multiple");
      } else {
        System.out.println("neither");
      }
    }
  }
}
