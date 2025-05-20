package baekjoon.class4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 문제 푼 날짜: 25.05.20
// 문제 번호: BOJ 2562
// 문제 제목: 최댓값
// 풀이 내용: 
// (1) BufferedReader + InputStreamReader 클래스를 사용하여 입력값 받기.
// (2) BufferedWriter + OutputStreamWriter 사용해서 출력하기.
// (3) int[] numbers 배열 몇개로 만들지 선언.
// (4) int max에 numbers[0] 저장.
// (5) int index= 0; 만들기
// (6) for문 사용하여 계산하기.
//     : int i = 0; i < 9; i++ 조건식 작성.
//     : numbers[i] 마다 입력값 받아서 숫자로 형변환.
//     : if문 사용하여 numbers[i]가 max보다 크면 max에 numbers[i]저장.
//     : 그리고 해당 i를 index에 저장하는데 i + 1; 값을 저장(i=0으로 했었기 때문).
// (7) for문 밖에서 bw.write() 사용해서 max와 index값을 가져와 모아두기.
// (8) bw.flush() 사용해서 출력하고 데이터 비우기.
// (9) bw와 br에 .close() 작성해서 종료하기.
public class BOJ2562_v1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br=  new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int[] numbers = new int[9];
    int max = numbers[0];
    int index = 0;

    for (int i = 0; i < 9; i++) {
      numbers[i] = Integer.parseInt(br.readLine());

      if (numbers[i] > max) {
        max = numbers[i];
        index = i + 1;
      }

    }
    
    bw.write(max + "\n" + index);
    bw.flush();
    bw.close();
    br.close();
  }
}