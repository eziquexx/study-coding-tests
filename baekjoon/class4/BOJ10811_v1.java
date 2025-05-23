package baekjoon.class4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 문제 푼 날짜: 25.05.24
// 문제 번호: BOJ 10811
// 문제 제목: 바구니 뒤집기
// 풀이 내용: 
// (1) BufferedReader + InputStreamReader 클래스를 사용하여 입력값 받기.
// (2) BufferedWriter + OutputStreamWriter 클래스 사용하여 출력.
// (3) String[] input에 바구니 개수와 반복 횟수 값 받아서 공백 기준으로 나누기.
// (4) int N과 int M에 input 배열 요소 각각 담기.
// (5) int[] basket과 int[] dummy를 생성. 배열 길이는 int N만큼.
// (6) for문 사용해서 바구니 번호 지정해주기. (index + 1)
// (7) for문 사용해서 바구니 뒤집는 계산하기.
//     : M만큼 반복하기.
//     : 반복 할 때마다 입력값 2개 받아서 공백 기준으로 나누기.
//     : 나눈 값은 각각 int i와 int j에 저장을 하는데 -1 해주기. (index 때문에)
//     : int x를 생성해서 j의 값을 임시 저장하기.
//     : while문 사용해서 i번~ j번까지의 바구니들을 뒤집는 식 만들기.
//     : dummy[] 바구니에 기존 바구니의 번호 담기.
//     : ex) dummy[0] = basket[1], dummy[1] = basket[0] 이런 식.
//     : 그 다음 다시 for문을 사용해서 기존 바구니에 dummy 바구니 값 저장하기.
// (8) for-each문과 bw.write() 사용해서 basket에 있는 값 출력하기.
public class BOJ10811_v1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String[] input = br.readLine().split(" ");
    int N = Integer.parseInt(input[0]); // 바구니 몇 개
    int M = Integer.parseInt(input[1]); // 몇 번 반복

    int[] basket = new int[N];
    int[] dummy = new int[basket.length]; // dummy 바구니 만들기.

    for (int i = 0; i < basket.length; i++) {
      basket[i] = i + 1; // 바구니 번호 지정.
      dummy[i] = i + 1;
    }

    // 바구니 뒤집기 계산
    for (int m = 0; m < M; m++) { // 반복 횟수
      String[] nums = br.readLine().split(" ");
      int i = Integer.parseInt(nums[0]) - 1;
      int j = Integer.parseInt(nums[1]) - 1;
      int x = j; // j값 임시 저장.

      while (i <= j) { 
        dummy[x] = basket[i]; // 더미에 바구니 값 저장.

        i++;
        x--;
      }

      for (int k = 0; k < basket.length; k++) { // 바구니에 더미 값 저장.
        basket[k] = dummy[k];
      }
      
    }

    for (int num : basket) {
      bw.write(num + " ");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}
