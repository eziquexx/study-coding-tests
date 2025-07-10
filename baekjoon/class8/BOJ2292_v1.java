package baekjoon.class8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 25.07.10
// 문제 번호: BOJ 2292
// 풀이 내용: 
// 1. 입력은 BufferedReader 사용
// 2. int N에 방 번호 받기.
// 3. quarter, dime, nickel, penny 정수로 저장.
// 4. lastRoom과 floor 각각 1로 초기화 및 선언.
// 5. 벌집 이미지를 보면 마지막 번호의 방은 
//    - 1층은 1, 2층은 7, 3층은 19, 4층은 37. 이렇게 증간된다.
//    - 6의 배수로 증가하는 걸 알 수 있다. 6, 12, 18, ...
//    - 이것을 토대로 각 층에 6을 곱한 값을 더해나가면 된다.
//    - 각 층의 마지막 번호를 기준으로 N번 방이 몇 층에 있는지 구하면 된다.
//    - while문 사용하여 계산하여 
//    - 조건식을 lastRoom(마지막 방 번호)보다 N번 방이 크면 false가 되어 멈춘다.
//    - 그리고 while문이 반복할 때마다 floor 층을 1씩 증가시켜준다.
// 6. 마지막에 floor를 출력하고, BufferedReader.close() 해주기.

public class BOJ2292_v1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 입력값
    int N = Integer.parseInt(br.readLine());

    // 마지막 방 번호
    int lastRoom = 1;
    int floor = 1; // 층수

    // while문 사용하여 N번방이 마지막 번호 초과면 멈추기
    // 1, 7, 19, 37 ...
    while (lastRoom < N) {
      lastRoom += 6 * (floor);
      floor++;
    }
    System.out.println(floor);
    br.close();
  }
}
