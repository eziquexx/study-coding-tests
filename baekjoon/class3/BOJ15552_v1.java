package baekjoon.class3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 문제 푼 날짜: 25.05.14
// 문제 번호: BOJ 15552
// 문제 제목: 빠른 A+B
// 풀이 내용: 
// (1) BufferedReader + InputStreamReader 클래스를 사용하여 입력값 받기.
// (2) BufferedWriter + OutputStreamWriter 사용해서 출력하기.
// (3) int T에 몇 개 출력할지 입력값 받아서 저장.
// (4) for문 사용.
//     : 조건식은 int i = 0; i < T; i++; 로해서 T만큼 반복시키기.
//     : String[] strs로 공백 기준으로 나누어서 입력 받은 값 저장.
//     : 각각 int A와 int B에 strs에 저장된 값들 숫자형으로 변환해서 저장.
//     : int sum에 A와 B를 더한 값 저장.
//     : bw.write()를 사용하여 sum에 있는 값 모아두기. 이때 꼭 "\n" 유니코드 줄바꿈 작성해줘야 함.
// (5) bw.flush() 필수 작성. 이때 bw에 임시로 저장된 데이터를 출력하고 데이터를 비워주는 작업.
// (6) bw.close() 작성해서 종료하기.
public class BOJ15552_v1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int T = Integer.parseInt(br.readLine());

    for (int i = 0; i < T; i ++) {
      String[] strs = br.readLine().split(" ");
      int A = Integer.parseInt(strs[0]);
      int B = Integer.parseInt(strs[1]);
      int sum = A + B;
      
      bw.write(sum + "\n");
    }
    
    bw.flush();
    bw.close();
  }
}