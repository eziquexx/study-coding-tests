package baekjoon.class3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 문제 푼 날짜: 25.05.15
// 문제 번호: BOJ 2438
// 문제 제목: 별 찍기 - 1
// 풀이 내용: 
// (1) BufferedReader + InputStreamReader 클래스를 사용하여 입력값 받기.
// (2) BufferedWriter + OutputStreamWriter 사용해서 출력하기.
// (3) int N에 몇 개 별을 출력할지 값을 입력받아 형변환하여 저장.
// (4) String star에 "*" 모양을 저장.
// (5) for문 사용하여 계산.
//     : 조건식에 int i = 0으로 하고, 입력 받은 N보다 작게 반복.
//     : .write() 사용해서 star를 먼저 모아두기.
//     : star 변수에 덧셈 대입 연산자를 사용하여 "*" 반복때마다 계속 추가해주기.
// (6) for문 밖에서 .flush()를 사용해서 저장되어 있는 데이터를 출력하고 내용 비우기.
// (7) .close() 사용해서 종료.
public class BOJ2438_v1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine()); // 몇 번 반복할지.
    String star = "*"; // 별 선언 및 초기화.

    for (int i = 0; i < N; i++) {
      bw.write(star + "\n"); // 데이터 모아두기.

      star += "*"; // 덧셈 대입 연산
    }

    bw.flush(); // 출력과 데이터 비우기.
    bw.close();
  }
}