package baekjoon.class8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 25.07.01
// 문제 번호: BOJ 2903
// 풀이 내용: 
// 1. 입력은 BufferedReader 사용
// 2. int N에 몇 번 반복할지 입력값 받기
// 3. int x = 1; 변의 개수 초기화
// 4. for문 사용하여 N번 반복.
// 5. for문 안에 반복할 때마다 x * 2의 값을 x에 저장.
// 6. int side에 한 변에 있는 점의 개수를 구하여 저장. x + 1
// 7. int result에 전체 점 개수를 구하여 저장. side * side
// 8. result출력하고 BufferedReader .close() 하기

public class BOJ2903_v2 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine()); // N번 반복

    int x = 1; // 변 개수 초기화
    for (int i = 0 ; i < N; i++) {
      x *= 2;  
    }

    int side = x + 1; // 한 변에 있는 점의 개수
    int result = side * side; // 전체 점 개수

    System.out.println(result);
    br.close();
  }
}
