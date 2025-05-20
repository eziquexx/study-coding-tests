package baekjoon.class3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

// 문제 푼 날짜: 25.05.19
// 문제 번호: BOJ 10871
// 문제 제목: 개수 세기
// 풀이 내용: 
// (1) BufferedReader + InputStreamReader 클래스를 사용하여 입력값 받기.
// (2) BufferedWriter + OutputStreamWriter 사용해서 출력하기.
// (3) int[] nx에 Arrays사용
//     : .stream()을 사용하여 입력값을 공백 기준으로 나누어서 받기.
//     : .mapToInt() 사용하여 입력받은 값들을 숫자타입으로 변형.
//     : .toArray() 사용하여 배열로 저장.
// (4) int[] numbers에 Arrays사용
//     : (3)번과 동일한 방법.
//     : 추가된 것은 .limit()를 사용하여 nx[0] 만큼 입력값 받기.
// (5) int result 선언.
// (6) for문 사용해서 계산하기.
//     : int i = 0; i < nx[0]; i++ 조건식
//     : if문을 사용하여 numbers[i]가 nx[0] 보다 작으면
//     : result에 numbers[i] 값 저장하기.
//     : bw.write() 사용하여 result + " " 모아두기.
// (7) for문 밖에서 .flush() 사용하여 출력과 데이터 비우기.
// (8) br과 bw에 .close() 사용하여 닫아주기.
public class BOJ10871_v2 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int[] nx = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
    int[] numbers = Arrays.stream(br.readLine().split(" "))
                    .limit(nx[0])
                    .mapToInt(Integer::parseInt)
                    .toArray();
    int result;

    for (int i = 0; i < nx[0]; i++) {
      if (numbers[i] < nx[1]) {
        result = numbers[i];

        bw.write(result + " ");
      }
    }

    bw.flush();
    bw.close();
    br.close();
  }
}