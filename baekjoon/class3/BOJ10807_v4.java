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
// (4) int[] numbers에 Arrays를 활용하기.
//     : .stream() 사용하여 입력받은 값을 공백 기준으로 나누고,
//     : .mapToInt() 사용하여, 입력받은 값을 숫자형으로 타입 변환시켜서 다음으로 넘긴다.
//     : 형변환된 요소들을 .toArray()를 사용하여 배열로 저장한다.
// (5) int V에 어떤 정수를 찾을지 입력값 받아서 저장하기.
// (6) int count에 Arrays 사용.
//     : .stream()을 사용하여 입력받은 numbers를 0부터 N개까지
//     : .filter()을 사용하여 순회하는 요소가 V와 같은지 조건을 통해 있으면 true 반환.
//     : true마다 .count() 하기.
public class BOJ10807_v4 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    int[] numbers = Arrays.stream(br.readLine().split(" "))
                          .mapToInt(Integer::parseInt)
                          .toArray();

    int V = Integer.parseInt(br.readLine());

    int count = (int) Arrays.stream(numbers, 0, N)
                      .filter(x -> x == V)
                      .count();

    bw.write(count + "\n");
    bw.flush();
    bw.close();
    br.close();
  }
}