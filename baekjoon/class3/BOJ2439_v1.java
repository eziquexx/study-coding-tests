package baekjoon.class3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 문제 푼 날짜: 25.05.15
// 문제 번호: BOJ 2439
// 문제 제목: 별 찍기 - 2
// 풀이 내용: 
// (1) BufferedReader + InputStreamReader 클래스를 사용하여 입력값 받기.
// (2) BufferedWriter + OutputStreamWriter 사용해서 출력하기.
// (3) int N에 몇 개 별을 출력할지 값을 입력받아 형변환하여 저장.
// (4) String star에 "*" 모양을 저장.
// (5) String space에 공백 선언 및 초기화.
// (6) while문 조건에 사용할 int i에 1값 초기화. 
// (7) while문 사용하여 계산.
//     : 조건식에 i <= N을 주어 N번 반복할 수 있게 만들기.
//     : int j = i를 만들어서 공백을 위한 변수 만들기.
//     : while문 안에 while문 또 만들기. 공백은 N-j개의 공백을 만들기 위해서.
//     : int result에 space와 star의 값을 저장.
//     : .write() 사용해서 result값 모아두기.
//     : space 초기화 시켜주기.
//     : star 변수에 덧셈 대입 연산자를 사용하여 "*" 반복때마다 계속 추가해주기.
//     : 마지막에 i++을 해주기.
// (8) while문 밖에서 .flush()를 사용해서 저장되어 있는 데이터를 출력하고 내용 비우기.
// (9) .close() 사용해서 종료.
public class BOJ2439_v1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine()); // 몇 개 별 출력할지.
    String star = "*";
    String space = "";
    int i = 1;

    while (i <= N) {
      int j = i;
      while (0 < (N - j)) { // 공백 계산
        space += " ";
        j++;
      }

      String result = space + star;

      bw.write(result + "\n"); // 결과 모아두기.

      space = ""; // space 초기화.
      star += "*"; // 별 추가.
      i++;
    }

    bw.flush(); // 데이터 출력 및 비우기.
    bw.close(); // 종료
  }
}