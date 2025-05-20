package baekjoon.class4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 문제 푼 날짜: 25.05.20
// 문제 번호: BOJ 10818
// 문제 제목: 최소, 최대
// 풀이 내용: 
// (1) BufferedReader + InputStreamReader 클래스를 사용하여 입력값 받기.
// (2) BufferedWriter + OutputStreamWriter 사용해서 출력하기.
// (3) int N에 몇 개 정수 받을지 입력값 받아서 젖아.
// (4) String[] input에 입력값 받아서 공백 기준으로 나누어서 저장.
// (5) int max와 int min에 input의 0번째 값 저장.
// (6) for문 사용하여 계산
//     : int number에 input[i] 값 저장.
//     : if문 사용하여 number 가 max보다 크면 max에 number 저장.
//     : number가 min 보다 작으면 min에 number 저장.
// (7) for문 밖에서 bw.write() 사용하여 데이터 모아두기
// (8) bw.flush()사용하여 출력하고 데이터 비우기.
// (9) bw와 br에 .close()하여 종료하기.
public class BOJ10818_v2 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    String[] input = br.readLine().split(" ");
    int max = Integer.parseInt(input[0]);
    int min = Integer.parseInt(input[0]);
    
    for (int i = 0; i < N; i++) {
      int number = Integer.parseInt(input[i]);

      if (number > max) max = number;
      if (number < min) min = number;
    }

    bw.write(min + " " + max);
    bw.flush();
    bw.close();
    br.close();
  }
}