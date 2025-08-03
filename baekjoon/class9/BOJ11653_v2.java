package baekjoon.class9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// 문제 푼 날짜: 25.08.03
// 문제 번호: BOJ 11653
// 풀이 내용: 
// 1. BufferedReader로 입력값 받기.
// 2. 입력용 메서드 readInput(), 소인수분해 계산 메서드 getPrimeFactors(), 출력 메서드 printFactors() 생성.

public class BOJ11653_v2 {
  public static void main(String[] args) throws IOException {
    int N = readInput();
    if (N < 2) {
      return;
    }

    List<Integer> factors = getPrimeFactors(N);
    printFactors(factors);
  }

  // 입력 메서드
  private static int readInput() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    return Integer.parseInt(br.readLine());
  }

  // 소인수분해 계산
  private static List<Integer> getPrimeFactors(int number) {
    List<Integer> result = new ArrayList<>();
    int divisor = 2;

    while (number > 1) {
      if (number % divisor == 0) {
        result.add(divisor);
        number /= divisor;
      } else {
        divisor++;
      }
    }
    
    return result;
  }

  // 출력 계산
  private static void printFactors(List<Integer> factors) {
    for (int factor : factors) {
      System.out.println(factor);
    }
  }
}
