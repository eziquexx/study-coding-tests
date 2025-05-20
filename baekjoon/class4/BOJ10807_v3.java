package baekjoon.class3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

// 문제 푼 날짜: 25.05.18
// 문제 번호: BOJ 10807
// 문제 제목: 개수 세기
// 풀이 내용: 
// (1) BufferedReader + InputStreamReader 클래스를 사용하여 입력값 받기.
// (2) BufferedWriter + OutputStreamWriter 사용해서 출력하기.
// (3) int N에 입력 값을 받아서 숫자로 형변환하기.
// (4) String[] input에 공백 기준으로 나누어서 값을 저장하기.
// (5) int V에 어떤 정수를 찾을지 값 받아서 숫자로 형변환해서 저장하기.
// (6) int[] numArr을 N개 만큼 미리 만들기.
// (7) int count 만들기.
// (8) for문 사용해서 계산하기.
//     : N번만큼 반복하는데, numArr[i]로 하여 input[i]를 형변환하여 저장하기.
//     : if문을 사용해서 numArr[i]에 V와 동일한 값이 있으면 count에 증가 연산을 해준다.
// (9) .write()를 사용해서 count를 출력하기.
// (10) bw와 br을 .close() 해주기.
public class BOJ10807_v3 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine()); // 몇 개 정수 입력 받을 지.
    String[] input = br.readLine().split(" "); // 입력 받을 정수 배열 선언과 초기화.

    int V = Integer.parseInt(br.readLine()); // 어떤 정수를 찾을지.
    long count = (int) Arrays.stream(input)
                      .limit(N) // N개까지만 사용
                      .filter(x -> Integer.parseInt(x) == V)
                      .count();

    bw.write(count + "\n");
    bw.flush();
    bw.close();
    br.close();
  }
}