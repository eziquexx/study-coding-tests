package baekjoon.class10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 26.01.01
// 문제 번호: BOJ 14215
// 풀이 내용: 
// 1. 삼각형 조건을 체크 후 세 변의 합을 구하여 출력한다.
// 2. 삼각형 조건이 부합하지 않은 경우, 문제에서는 막대를 줄이기만 가능하기 때문에
//    가장 긴 길이를 줄이도록 한다.
// 3. 가장 짧은 길이와 중간 길이를 구한 다음 둘의 합보다 작아야지만
//    삼각형 조건에 부합한다. 그래서 둘의 합 - 1로 하면 삼각형 조건에 부합한다.
// 4. 이렇게 구한 식을 만들어보면 
//    (짧은 길이 + 중간 길이) + (짧은 길이 + 중간 길이 - 1) 이 된다.

public class BOJ14215 {
  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 입력
    String nums[] = br.readLine().split(" ");
    int a = Integer.parseInt(nums[0]);
    int b = Integer.parseInt(nums[1]);
    int c = Integer.parseInt(nums[2]);

    // 삼각형 조건 체크
    if (a + b > c && a + c > b && b + c > a) {
      // 둘레 계산 후 출력
      int result = a + b + c;
      System.out.println(result);
    } else {
      // 가장 큰 수, 작은 수, 중간 수를 구한 후
      // (작은 수 + 중간 수) + (작은 수 + 중간 수 - 1) 의 합을 구한다.
      // 가장 큰 변은 나머지 두 변의 합보다 작아야하기 때문에.
      int max = Math.max(a, Math.max(b, c));
      int min = Math.min(a, Math.min(b, c));
      int mid = a + b + c - max - min;

      // 둘레 계산 후 출력
      int result = (min + mid) + (min + mid - 1);
      System.out.println(result);
    }
  }
}
