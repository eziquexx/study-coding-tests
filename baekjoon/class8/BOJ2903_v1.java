package baekjoon.class8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 25.07.01
// 문제 번호: BOJ 2903
// 풀이 내용: 
// 1. 입력은 BufferedReader 사용
// 2. int N에 몇 번 반복할지 입력값 받기
// 3. 초기값 int x = 2, int result = 1 지정
// 4. for문 사용하여 N번 반복.
// 5. for문 안에 총 점의 개수를 구하여 result에 저장.
// 6. 다음 x값을 구하기 위해 reulst의 약수 중 중간에 있는 값 추출하여 저장.
// 7. result 출력. BufferedReader .close() 하기

public class BOJ2903_v1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine()); // N번 반복

    int x = 2;
    int result = 1;

    for (int i = 0 ; i < N; i++) {
      int a = (x - 1) * (x - 1);
      int b = 2 * ((x - 1) * x);
      int c = x * x;
      result = a + b + c; // 총 점의 개수
      
      // x값 구하기. result가 9면 x는 3이 나와야함.
      for (int j = 1; j <= result; j++) {

        if (result % j == 0) {
          // 1 or result or x 값보다 작지 않는 약수.
          if (j == 1 || j == result || x > j) {
            continue;
          }

          x = j;
          break;
        }
      }
    }

    System.out.println(result);
    br.close();
  }
}
