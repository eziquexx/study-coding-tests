package baekjoon.class3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 문제 푼 날짜: 25.05.16
// 문제 번호: BOJ 10952
// 문제 제목: A+B - 5
// 풀이 내용: 
// (1) BufferedReader + InputStreamReader 클래스를 사용하여 입력값 받기.
// (2) BufferedWriter + OutputStreamWriter 사용해서 출력하기.
// (3) Strs[] strs, int A, int B 선언만 하기.
// (4) while문 사용하여 계산
//     : 조건식은 true로 하여 무한으로 반복할 수 있게 하기.
//     : strs는 입력 받는 값을 공백 기준으로 나누어서 저장하기.
//     : A와 B에 각각 strs의 값을 저장.
//     : if문을 사용하여 A와 B의 값이 0이면 멈추기. (while문 바깥으로)
//     : .write()를 사용하여 A와 B이 합을 모아두기.
// (5) while문 밖에서 .flush()를 사용하여 출력하고 데이터 비우기.
// (6) br과 bw 각각 close 해주기.
public class BOJ10952_v1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 

    String[] strs;
    int A, B;
    
    while (true) {
      strs = br.readLine().split(" ");
      A = Integer.parseInt(strs[0]);
      B = Integer.parseInt(strs[1]);

      if (A == 0 && B == 0) break; // 입력값이 두개다 0이면 멈추기.
      bw.write((A + B) + "\n");
  
    }
    bw.flush();
    bw.close();
    br.close();
  }
}