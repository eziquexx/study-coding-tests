package baekjoon.class9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 문제 푼 날짜: 25.08.02
// 문제 번호: BOJ 2581
// 풀이 내용: 
// 1. BufferedReader로 입력값 받기.
// 2. int M, int N에 각각 입력값 받기.
// 3. 소수인 값을 담기 위해 primes를 ArrayList로 생성.
// 4. for문을 사용하여 M~N사이의 자연수 중 소수를 판별하여 primes에 추가.
//    - isPrime 메서드를 생성하여 소수 판별함.
// 5. 소수 판별하는 isPirme 메서드 boolean 타입으로 생성.
//    - isPirme으로 넘어온 파라미터를 int num으로 함.
//    - num < 2 이면 false를 return. (소수는 1 이상의 자연수)
//    - for문 사용하여 조건식에 int i = 2; int i < Math.sqrt(num); i++ 로 지정.
//    - 블럭에는 num % i 가 0이면 false를 return함. (num을 i로 나누었을 때 0으로 떨어지면 소수가 아님. 소수는 1과 본인과 동일한 수만 가지기 때문에.)
//    - 위에 조건들이 부합하지 않으면 true를 return함.
// 6. 본 코드로 돌아와서 primes에 아무런 값이 없으면 -1을 출력하고, 값이 있으면 primes안에 있는 요소의 총 합과 가장 작은 수를 구하여 출력.
//    - 총 합은 .stream()을 사용하여 .mapToInt()로 숫자로 형변환 한 다음에 전체 값을 .sum() 메서드 사용하여 전체 합을 구함.
//    - Collections 클래스를 사용하여 .min() 메서드로 primes 리스트 안에 있는 요소 중 가장 작은 수를 구하기.

public class BOJ2581_v2 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int M = Integer.parseInt(br.readLine());
    int N = Integer.parseInt(br.readLine());

    List<Integer> primes = new ArrayList<>();

    // 소수 판별하여 primes에 추가
    for (int i = M; i <= N; i++) {
      if (isPrime(i)) {
        primes.add(i);
      }
    }

    if (primes.isEmpty()) {
      System.out.println(-1); // primes에 값이 없으면 -1
    } else {
      int sum = primes.stream().mapToInt(Integer::intValue).sum();
      int min = Collections.min(primes);
      System.out.println(sum);
      System.out.println(min);
    }
  }

  // 소수 판별
  private static boolean isPrime(int num) {
    // num이 2미만이면 false. 1은 소수가 아니기 때문.
    if (num < 2) return false;

    // 루트 num이 i로 나누었을 때 나머지가 0이면 소수가 아님.
    // 왜냐하면 소수는 1과 본인과 같은 수만 있기 때문에.
    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) return false;
    }
    
    return true;
  }
}
