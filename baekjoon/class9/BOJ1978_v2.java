package baekjoon.class9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 문제 푼 날짜: 25.07.31
// 문제 번호: BOJ 1978
// 풀이 내용: 
// 1. BufferedReader로 입력값 받기.
// 2. br.readLine(); 첫번째 개수 입력 받기.
// 3. .stream()을 사용하여 계산.
//    - 입력 받은 값을 공백 기준으로 나누어 .mapToInt() 각 int 타입으로 변경
//    - .filter()를 사용하여 isPrime 함수 호출하여 대입.
//    - .isPrime()에서 true로 반환된 것을 count() 하기.
// 4. isPrime 함수 생성하여 int n을 파라미터로 받기.
//    - int n이 2보다 작으면 false를 return. (1은 소수가 아니기 때문)
//    - rangeClosed(a, b)사용하여 a는 2, b는 int n을 루트로 계산하기.
//    - 루트로 계산한 n은 (int)로 강제 형변환.
//    - .noneMatch()를 사용하여 int n을 i로 나누었을 때 0이면 false 반환.
//    - i는 rangeClosed()에서 계산한 각각의 값을 의미.

public class BOJ1978_v2 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    br.readLine();
    long primeCount = Arrays.stream(br.readLine().split(" "))
        .mapToInt(Integer::parseInt) //int 타입으로 변경
        .filter(BOJ1978_v2::isPrime) // isPrime 함수 호출하여 filter
        .count();
    
    System.out.println(primeCount);
    br.close();
  }

  private static boolean isPrime(int n) {
    if (n < 2) return false;
    return java.util.stream.IntStream.rangeClosed(2, (int) Math.sqrt(n))
        .noneMatch(i -> n % i == 0);
  }

  // rangeClose(a,b ): a 이상 b 이하
  // .sqrt(): 루트
  // .nonMatch(): 일치하는게 없어야 ture, 일치하면 false
  // i는 .rangeClosed에서 구해진 각각의 값

}
