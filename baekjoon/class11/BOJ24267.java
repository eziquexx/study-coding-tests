package baekjoon.class11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 26.01.03
// 문제 번호: BOJ 24267
// 풀이 내용: 
// 1. 차수로 변경하는 방법은 O(n3)이기 때문에 무조건 3이 나와야한다.
// 2. 실행횟수를 구하는 방법은 아무리 풀어도 이해가 안되어서 gpt 도움을 받았다.
// 3. 풀이는 코드에 주석으로 달았다.
public class BOJ24267 {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 입력
    long n = Integer.parseInt(br.readLine());

    // nC3. n개 중 3개의 조합으로 경우의 수를 구하는 방법.
    // 즉 n!/3!(n-3)! 이다.
    // n이 7이라면 7*6*5*4*3*2*1 / (3*2*1)*(4*3*2*1) 이다.
    // 여기서 중복되는 (4*3*2*1)을 제거하면 7*6*5 / 3*2*1이 남는다.
    // 이걸 식으로 바꿔보면 n*n-1*n*2 / 6이 된다.
    System.out.println(n * (n-1) * (n-2) / 6);

    // 수행 시간을 다항수 차수로 했을때,
    // 중첩 for문 3번 반복이기 때문에 O(n3)이라서 무조건 3
    System.out.println(3);
  }
}
