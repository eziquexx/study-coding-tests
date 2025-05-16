package baekjoon.class3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 문제 푼 날짜: 25.05.16
// 문제 번호: BOJ 10952
// 문제 제목: A+B - 4
// 풀이 내용: 
// (1) BufferedReader + InputStreamReader 클래스를 사용하여 입력값 받기.
// (2) BufferedWriter + OutputStreamWriter 사용해서 출력하기.
// (3) String line 선언.
// (4) while문 사용하여 계산
//     : 조건식은 line = br.readLine() != null을 주기.
//     : String[] strs에 입력 받은 line 값에 공백 기준으로 나누어서 저장.
//     : int A와 int B에 각각 strs의 값을 저장.
//     : .write()를 사용하여 A와 B이 합을 모아두기.
// (5) while문 밖에서 .flush()를 사용하여 출력하고 데이터 비우기.
// (6) br과 bw 각각 close 해주기.
// 메모! EOF라고 End Of File을 해줘야한다.  "입력 스트림이 더 이상 읽을 데이터가 없다는 신호"
public class BOJ10951_v1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String line;

    while ((line = br.readLine()) != null) {
      String[] strs = line.split(" ");
      int A = Integer.parseInt(strs[0]);
      int B = Integer.parseInt(strs[1]);

      bw.write((A + B) + "\n");
    }
    bw.flush();
    bw.close();
    br.close();
  }
}