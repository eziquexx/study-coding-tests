package baekjoon.class10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 25.12.28
// 문제 번호: BOJ 15894
// 풀이 내용: 
// 1. BufferedReader로 입력값 받기.
// 2. long타입의 num 변수에 입력값을 받아 숫자형으로 저장.
// 3. 옆면+윗면+아랫면은 (2*num)*2 라는 규칙을 알 수 있다.
// 4. 계산 값은 long타입의 result에 저장한다.

public class BOJ15894 {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 입력
    long num = Integer.parseInt(br.readLine());

    // 계산
    // 옆면=n*2, (윗면+아랫면) = n*2, 총 옆면+윗면+아랫면 = 2n*2
    long result = (2 * num) * 2;

    // 출력
    System.out.println(result);
  }
}
