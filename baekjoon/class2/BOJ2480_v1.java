package baekjoon.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 25.05.11
// 문제 번호: BOJ 2480
// 문제 제목: 주사위 세개
// 풀이 내용: 
// (1) BufferedReader + InputStreamReader 클래스를 사용하여 입력값 받기.
// (2) 한 줄로 입력 받은 값을 공백으로 나누어서 String[] strs에 저장.
// (3) int타입의 a, b, c에 각각 strs 값들을 순차적으로 저장.
// (4) if문을 사용하여 계산
//     3개의 값이 같으면 10000 + (a * 1000) 계산 후 출력
//     2개의 값이 같으면 1000 + ((a or b or c) * 100) 계산 후 출력
//     값이 모두 다르면 100 * (3개 중 가장 큰 수) 계산 후 출력
public class BOJ2480_v1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] strs = br.readLine().split(" ");

    int a = Integer.parseInt(strs[0]);
    int b = Integer.parseInt(strs[1]);
    int c = Integer.parseInt(strs[2]);

    if (a == b && b == c) { // 3개 같으면
      System.out.println(10000 + (a * 1000));
    } else if (a == b || b == c || a == c) { // 2개 같으면
      if (a == b) {
        System.out.println(1000 + (a * 100));
      } else if (b == c) {
        System.out.println(1000 + (b * 100));
      } else {
        System.out.println(1000 + (c * 100));
      }
    } else { // 전부 다르면
      int maxNum = Math.max(Math.max(a, b), c);
      
      System.out.println(maxNum * 100);
    }
  }
}