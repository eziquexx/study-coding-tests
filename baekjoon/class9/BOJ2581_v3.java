package baekjoon.class9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// chat-gpt가 리팩토링 해준 코드

public class BOJ2581_v3 {
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int M = Integer.parseInt(br.readLine());
      int N = Integer.parseInt(br.readLine());

      List<Integer> primes = findPrimesInRange(M, N);

      if (primes.isEmpty()) {
        System.out.println(-1);
      } else {
        int sum = primes.stream().mapToInt(Integer::intValue).sum();
        int min = primes.stream().mapToInt(Integer::intValue).min().getAsInt();
        System.out.println(sum);
        System.out.println(min);
      }
    }

    // M~N 범위의 소수 리스트 반환
    private static List<Integer> findPrimesInRange(int start, int end) {
      return IntStream.rangeClosed(start, end)
                    .filter(BOJ2581_v3::isPrime)
                    .boxed()
                    .collect(Collectors.toList());
    }

    // 소수 판별
    private static boolean isPrime(int num) {
      if (num < 2) return false;
      if (num == 2) return true;
      if (num % 2 == 0) return false;
      for (int i = 3; i <= Math.sqrt(num); i += 2) {
        if (num % i == 0) return false;
      }
      return true;
    }
}
