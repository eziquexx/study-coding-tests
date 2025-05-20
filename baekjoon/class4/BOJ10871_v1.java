package baekjoon.class3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 문제 푼 날짜: 25.05.19
// 문제 번호: BOJ 10871
// 문제 제목: 개수 세기
// 풀이 내용: 
// (1) BufferedReader + InputStreamReader 클래스를 사용하여 입력값 받기.
// (2) BufferedWriter + OutputStreamWriter 사용해서 출력하기.
// (3) String[] nx에 공백 기준으로 입력값 받기.
// (4) int N과 int X에 각각 nx 요소 값 저장하기.
// (5) String[] input = 공백 기준으로 입력값 받기.
// (6) int[] numbers 에 N만큼 배열을 생성하기.
// (7) int result; 결과값 저장할 변수 생성.
// (8) for문 사용하여 계산
//     : 조건식을 int i = 0; i < N; i++ 작성.
//     : numbers[i] 마다 input[i]를 형번환해서 값 저장.
//     : if문을 사용하여 numbers[i]가 X보다 적으면 result에 numbers[i] 값 저장
//     : 그리고 bw.write()를 사용하여 result + " " 라고 작성하여 result값과 공백을 출력하도록 하기.
// (9) for문 밖에서 .flush() 사용하여 출력과 데이터 비우기.
// (10) bw와 br에 .close() 해주기.
public class BOJ10871_v1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String[] nx = br.readLine().split(" ");
    int N = Integer.parseInt(nx[0]);
    int X = Integer.parseInt(nx[1]);

    String[] input = br.readLine().split(" ");
    int[] numbers = new int[N];
    int result;

    for (int i = 0; i < N; i++) {
      numbers[i] = Integer.parseInt(input[i]);

      if (numbers[i] < X) {
        result = numbers[i];
        bw.write(result + " ");
      }
    }

    bw.flush();
    bw.close();
    br.close();
  }
}