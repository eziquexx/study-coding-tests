package baekjoon.class3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 문제 푼 날짜: 25.05.14
// 문제 번호: BOJ 11022
// 문제 제목: A+B - 8
// 풀이 내용: 
// (1) BufferedReader + InputStreamReader 클래스를 사용하여 입력값 받기.
// (2) int T에 몇 번 반복할지 값 저장.
// (3) while문 사용해서 계산하기.
//     : String[] strs에 두 정수를 공백 기준으로 입력 받은 뒤 저장하기.
//     : int A와 int B에 각각 입력 받은 정수 저장하기.
//     : String result에 출력할 값들 저장.
//     : .write()를 사용해서 출력할 데이터들 모아두기.
// (4) .flush()를 사용해서 모아둔 데이터들 출력하고 비우기.
// (5) .close()를 사용해서 BufferedWriter 종료하기.
public class BOJ11022_v1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int T = Integer.parseInt(br.readLine());
    int x = 1;

    while (x <= T) {
      String[] strs = br.readLine().split(" ");
      int A = Integer.parseInt(strs[0]);
      int B = Integer.parseInt(strs[1]);

      String result = "Case #" + x + ": "+ A + " + " + B + " = " + (A+B);
      
      bw.write(result + "\n");
      
      x++;
    }

    bw.flush();
    bw.close();
  }
}