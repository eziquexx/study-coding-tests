package baekjoon.class4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

// 문제 푼 날짜: 25.05.20
// 문제 번호: BOJ 10818
// 문제 제목: 최소, 최대
// 풀이 내용: 
// (1) BufferedReader + InputStreamReader 클래스를 사용하여 입력값 받기.
// (2) BufferedWriter + OutputStreamWriter 사용해서 출력하기.
// (3) int N에 몇 개 정수 받을지 입력값 받아서 젖아.
// (4) int[] numbers에 Arrays 사용하기
//     : .stream()에 입력값 받는데, 공백기준으로 나누기.
//     : .mapToInt(Integer::parseInt) 사용하여 숫자형태로 변환.
//     : .toArray() 사용하여 배열로 저장.
// (5) int max와 int min에 numbers의 0번째 값 저장.
// (6) for문 사용하여 계산
//     : if문 사용하여 numbers[i]가 max보다 크면 max에 numbers[i] 저장.
//     : numbers[i]가 min 보다 작으면 min에 numbers[i] 저장.
// (7) for문 밖에서 bw.write() 사용하여 데이터 모아두기
// (8) bw.flush()사용하여 출력하고 데이터 비우기.
// (9) bw와 br에 .close()하여 종료하기.
public class BOJ10818_v3 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    int[] numbers = Arrays.stream(br.readLine().split(" "))
                      .limit(N)
                      .mapToInt(Integer::parseInt)
                      .toArray();
    int max = numbers[0];
    int min = numbers[0];
    
    for (int i = 0; i < N; i++) {
      if (numbers[i] > max) max = numbers[i];
      if (numbers[i] < min) min = numbers[i]; 
    }

    bw.write(min + " " + max);
    bw.flush();
    bw.close();
    br.close();
  }
}