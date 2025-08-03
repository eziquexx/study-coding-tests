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
// 2. Class 분리하여 분리한 클래스에서 입력 메서드, 계산 메서드, 출력 메서드 생성.

public class BOJ11653_v3 {
  public static void main(String[] args) throws IOException {
    PrimeFactorizer factorizer = new PrimeFactorizer();
    int number= factorizer.readInput();

    if (number < 2) {
      return;
    }

    List<Integer> result = factorizer.factorize(number);
    factorizer.printFactors(result);
  }
}

// PrimeFActorizer 클래스 생성
class PrimeFactorizer {

  // 입력 메서드
  public int readInput() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    return Integer.parseInt(br.readLine());
  }

  // 계산 메서드
  public List<Integer> factorize(int number) {
    List<Integer> factors = new ArrayList<>();

    for (int i = 2; i * i <= number; i++) {
      while (number % i == 0) {
        factors.add(i);
        number /= i;
      }
    }

    // 남은 수가 소수라면 그 수도 결과에 포함
    if (number > 1) {
      factors.add(number);
    }

    return factors;
  }

  // 출력 메서드
  public void printFactors(List<Integer> factors) {
    factors.forEach(System.out::println);
  }
}
