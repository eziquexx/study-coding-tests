package baekjoon.class11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 26.01.01
// 문제 번호: BOJ 24262
// 풀이 내용: 
// 1. 시간 복잡도 문제라서 시간 복잡도 알고리즘에 대해서 알고 있어야 한다.
// 2. 입력값이 어떤 값이든 주어진 문제의 알고리즘에 대입하여 풀어보면은,
//    A[i] 번째만 계산하기 때문에, 즉 1회만 실행된다.
//    그렇기 때문에 차수는 항상 0이 된다.

public class BOJ24262 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 입력
    int n = Integer.parseInt(br.readLine());

    // 시간 복잡도 O(1) 알고리즘
    // 어떤 값을 넣든 A[i] 번째만, 즉 1회만 실행된다. 
    System.out.println(1);

    // 차수는 항상 0이 된다.
    System.out.println(0);
  }
}
