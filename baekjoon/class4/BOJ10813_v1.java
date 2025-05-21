package baekjoon.class4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 문제 푼 날짜: 25.05.21
// 문제 번호: BOJ 10813
// 문제 제목: 공 바꾸기
// 풀이 내용: 
// (1) BufferedReader + InputStreamReader 클래스를 사용하여 입력값 받기.
// (2) BufferedWriter + OutputStreamWriter 사용해서 출력하기.
// (3) String[] input에 입력값 받아서 공백 기준으로 나누어 저장.
// (4) int N, int M에 각각 input 값 담기.
// (5) int[] basket에 배열 길이를 N으로 생성.
// (6) for문 사용해서 각 바구니에 같은 번호의 공 초기화 작업.
//     : int n = 0; i < basket.length 만큼 반복.
//     : baskent[n] = n + 1;
//     : 각 바구니에 같은 번호의 값 저장. 인덱스 때문에  + 1을 작성함.
// (7) for문 사용해서 2개의 바구니 안에 있는 공 맞바꾸기.
//     : String[] ex에 입력 받은 값을 공백 기준으로 나누어서 저장. 
//     : int ex1과 int ex2에 ex 요소 각각 저장. 이때 -1 해주기.(인덱스 때문에)
//     : basket[ex1] 과 basket[ex2] 교환하기 전에 basket[ex1] 값을 임시로 저장할 int prevBasket 생성해서 값 저장해주기.
//     : basket[ex1] 과 basket[ex2] 교환.
// (8) for-each문을 사용해서 basket에 있는 요소를 공백을 두고 .wirte() 사용해서 모아두기.
// (9) for-each문 밖에서 .flush()를 사용해서 출력하고 데이터 비우기.
// (10) bw와 br에 .close() 사용해서 종료해주기.
public class BOJ10813_v1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String[] input = br.readLine().split(" ");
    int N = Integer.parseInt(input[0]); // 바구니 개수.
    int M = Integer.parseInt(input[1]); // 몇 번 반복할지.
    int[] basket = new int[N];

    // 각 바구니에 같은 번호 공 담기.
    for (int n = 0; n < basket.length; n++) {
      basket[n] = n + 1;
    }

    // M번 반복하면서 2개의 바구니 안에 있는 공 맞교환 계산.
    for (int i = 0; i < M; i++) {
      String[] ex = br.readLine().split(" ");
      int ex1 = Integer.parseInt(ex[0]) - 1; // 바구니 인덱스 구하기
      int ex2 = Integer.parseInt(ex[1]) - 1; // 바구니 인덱스 구하기
      int prevBasket = basket[ex1]; // ex1번 바구니 안의 공 임시 저장.

      // 바구니 안에 있는 공 맞교환.
      basket[ex1] = basket[ex2];
      basket[ex2] = prevBasket;
    }

    // 각 바구니에 담긴 공이 무엇인지 계산.
    for (int number : basket) {
      bw.write(number + " ");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}
