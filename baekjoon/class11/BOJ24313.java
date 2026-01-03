package baekjoon.class11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ24313 {
  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 입력 3가지
    String a1a0[] = br.readLine().split(" ");
    int a1 = Integer.parseInt(a1a0[0]);
    int a0 = Integer.parseInt(a1a0[1]);
    int c = Integer.parseInt(br.readLine());
    int n0 = Integer.parseInt(br.readLine());

    // 계산 & 출력
    // n >= n0 성립도 시켜줘야한다.
    for (int n = n0; n <= 100; n++) {
      int fn = (a1*n) + a0;
      int gn = c * n;

      if (fn > gn) {
        System.out.println(0);
        return;
      }
    }
    
    System.out.println(1);
  }
}
