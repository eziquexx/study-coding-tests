package baekjoon.class11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ24263 {
  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    // 수행 횟수
    // 1~n번 반복하기 때문에 즉 n이 횟수이다.
    System.out.println(n);

    // 수행 횟수를 다항식으로
    // i가 1부터 n까지. sum=0, i는 1부터 n까지라고 하더라도 A[i]는 1나의 수만 존재. 즉 sum = 1 
    System.out.println(1);
  }
}