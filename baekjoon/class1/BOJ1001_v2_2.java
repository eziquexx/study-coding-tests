package baekjoon.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 25.05.02
// 문제 번호: BOJ 1001
// 문제 제목: A-B
// 풀이 내용: 
// (1) BufferedReader + InputStreamReader 사용
// (2) .readLine()은 문자열만 가능하기 때문에 숫자로 형변환 시키기.
// (3) 백준에 제출할 때에는 자동으로 값이 입력되다보니 받은 값을 공백 기준으로 나누어서 문자열타입의 배열로 받은 다음 각 0번째, 1번째 값을 가져와 A, B에 숫자로 형변환하여 저장하기.
public class BOJ1001_v2_2 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] strs = br.readLine().split(" ");

    int A = Integer.parseInt(strs[0]);
    int B = Integer.parseInt(strs[1]);

    int sum = A - B;

    System.out.println(sum);
  }
  
}
