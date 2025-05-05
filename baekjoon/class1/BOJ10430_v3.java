package baekjoon.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 25.05.05
// 문제 번호: BOJ 10430
// 문제 제목: ??!
// 풀이 내용: 
// (1) BufferedReader + InputStreamReader 클래스를 사용하여 입력 값 받기.
// (2) 3개의 정수 값을 한 줄로 받아서 공백 기준으로 나눈 다음 문자열타입의 배열로 저장.
// (3) 배열에 담긴 인덱스들을 각 A, B, C 변수에 저장.
// (4) 4개의 식 계산 후 저장한 다음 출력.
public class BOJ10430_v3 {
  public static void main(String[] strs) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] str = br.readLine().split(" ");

    int A = Integer.parseInt(str[0]);
    int B = Integer.parseInt(str[1]);
    int C = Integer.parseInt(str[2]);

    int sum1 = (A + B) % C;
    int sum2 = ((A % C) + (B % C)) % C;
    int sum3 = (A * B) % C;
    int sum4 = ((A % C) * (B % C)) % C;

    System.out.println(sum1);
    System.out.println(sum2);
    System.out.println(sum3);
    System.out.println(sum4);
  }
}