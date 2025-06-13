package baekjoon.class5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 문제 푼 날짜: 25.06.13
// 문제 번호: BOJ 2675
// 풀이 내용: 
// (1) BufferedReader 클래스를 사용하여 입력값 받기.
// (2) BufferedWriter 클래스 사용하여 입력값 출력.
// (3) int T에 테스트 개수 입력 받아 저장.
// (4) for문 사용하여 T만큼 반복하여 계산.
//     : String[] input에 입력 받은 값을 공백 기준으로 나누어 저장.
//     : int num에는 input[0], String word에는 input[1] 저장.
// (5) 중첩 for문 사용하여 word.length() 만큼 반복하여 계산.
//     : char c에 word.charAt() 사용하여 한글자씩 담기.
// (6) 3중 for문 사용하여 num 만큼 반복하여 계산.
//     : bw.write() 사용하여 c를 반복하여 모아두기.
// (7) 2중 for문 아래에 bw.write("\n"); 줄바꿈 넣어주기.
// (8) 첫번째 for문 밖에서 bw.flush() 사용하여 출력하고 bw.close(), br.close()해주기.
public class BOJ2675_v1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 


    int T = Integer.parseInt(br.readLine()); // 테스트 개수

    for (int i = 0; i < T; i++) { // 테스트 개수만큼 반복
      String[] input = br.readLine().split(" ");
      int num = Integer.parseInt(input[0]); // 문자 몇 번 반복할지
      String word = input[1];

      for (int j = 0; j < word.length(); j++) { // 문자열 길이 만큼 반복
        char c = word.charAt(j); // 문자 하나씩
        
        for (int k = 0; k < num; k++) { // 문자 하나당 num만큼 반복 출력
          bw.write(c);
        }
      }
      bw.write("\n"); // 줄바꿈
    }

    bw.flush();
    bw.close();
    br.close();
  }
}
