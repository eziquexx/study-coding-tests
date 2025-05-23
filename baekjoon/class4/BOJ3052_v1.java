package baekjoon.class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 25.05.24
// 문제 번호: BOJ 3052
// 문제 제목: 나머지
// 풀이 내용: 
// (1) BufferedReader + InputStreamReader 클래스를 사용하여 입력값 받기.
// (2) int B = 42 저장.
// (3) int[] num에 10 크기만큼 선언.
// (4) int count = 0; 생성
// (5) for문으로 num[i] 마다 입력값 받아서 % B한 값 저장.
// (6) for문 + 중첩 for문을 사용하여 계산
//     : num[i]와 num[j]를 비교하는데, j < i 조건을 걸어서 하나씩 순차적으로 값을 비교하여 값이 같지 않으면 count가 증가되도록 계산
// (7) count 출력.
public class BOJ3052_v1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int B = 42;
    int[] num = new int[10];
    int count = 0;

    // 42로 나눈 나머지값 저장.
    for (int i = 0; i < num.length; i++) {
      num[i] = Integer.parseInt(br.readLine()) % B;
    }

    // 중복되는 값 제외
    for (int i = 0; i < num.length; i++) {
      boolean x = false;

      // j < i 조건식을 통해서 계속 비교.
      for (int j = 0; j < i; j++) {
        if (num[i] == num[j]) { // 중복되는 값은 true로 저장.
          x = true;

          break;
        }
      }

      // 중복되지 않은 값은 count++
      if (!x) {
        count++;
      }
    }

    System.out.println(count);
  }
}