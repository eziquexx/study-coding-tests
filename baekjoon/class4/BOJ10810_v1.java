package baekjoon.class4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 문제 푼 날짜: 25.05.21
// 문제 번호: BOJ 10810
// 문제 제목: 공 넣기
// 풀이 내용: 
// (1) BufferedReader + InputStreamReader 클래스를 사용하여 입력값 받기.
// (2) BufferedWriter + OutputStreamWriter 사용해서 출력하기.
// (3) String[] input에 입력값 받아서 공백 기준으로 나누어 저장.
// (4) int N, int M에 각각 input 값 담기.
// (5) int[] basket에 배열 길이를 N으로 생성.
// (6) for문 사용해서 계산
//     : int i = 0; i < M 만큼 반복.
//     : 반복 때마다 String[] ex에 입력값 받아서 공백 기준으로 나눈 다음 저장.
//     : int basket1, int basket2, int ballNum에 각각 ex 값 저장.
//     : 중첩 for문을 사용해서 입력받은 첫번째 바구니와 두번째 바구니에 ballNum을 저장.
// (7) 그 다음 for문에서 basket.lengh에 맞추어 반복하여 bw.write() 사용해서 바구니에 담긴 공 모아두기.
// (8) bw.flush() 사용해서 출력하고 데이터 비우기
// (9) bw와 br에 .close() 사용해서 종료해주기.
public class BOJ10810_v1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
    String[] input = br.readLine().split(" ");
    int N = Integer.parseInt(input[0]); // 바구니 개수 
    int M = Integer.parseInt(input[1]); // 공 개수 

    int[] basket = new int[N]; // 바구니 1 ~ N

    for (int i = 0; i < M; i++) { // 공 번호 만큼 반복
      String[] ex = br.readLine().split(" ");
      int basket1 = Integer.parseInt(ex[0]);
      int basket2 = Integer.parseInt(ex[1]);
      int ballNum = Integer.parseInt(ex[2]);

      for (int j = basket1; j <= basket2; j++) {
        basket[j-1] = ballNum; // index 때문에 -1
      }
    }

    for (int i = 0; i < basket.length; i ++) {
      bw.write(basket[i] + " "); // 각 바구니 안에 있는 공 번호 저장.
    }

    bw.flush();
    bw.close();
    br.close();
  }
}