package baekjoon.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 25.05.13
// 문제 번호: BOJ 25314
// 문제 제목: 코딩은 체육과목 입니다
// 풀이 내용: 
// (1) BufferedReader + InputStreamReader 클래스를 사용하여 입력값 받기.
// (2) int N에 몇 바이트인지 입력 값 받아서 저장.
// (3) long 타입의 횟수를 출력할 거라서 int count에 N / 4의 값을 저장. 
// (4) while문에 사용할 int i 초기화 선언.
// (5) String a 초기화 선언.
// (6) while문 사용해서 count 회수만큼 반복하기. 
// (7) a에 덧셈 대입 연산자를 사용하여 "long "; 값 저장.
// (8) 최종 a + "int" 출력
public class BOJ25314_v1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int count = N / 4;
    int i = 0;
    String a = "";

    while (i < count) {
      a += "long ";

      i++;
    }

    System.out.println(a + "int");
  }
}