package baekjoon.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 25.05.13
// 문제 번호: BOJ 10950
// 문제 제목: A+B - 3
// 풀이 내용: 
// (1) BufferedReader + InputStreamReader 클래스를 사용하여 입력값 받기.
// (2) 몇 번 반복할지 int T를 생성해서 값 저장하기.
// (3) 회수 저장 할(?) 변수 생성. int i = 0;
// (4) while()문을 사용해서 조건식은 i < T 로 반복횟수 지정.
// (5) 2개의 정수는 String[] strs에 공백 기준으로 나누어서 저장한 다음, A와 B에 각각 저장하기.
// (6) A + B 값을 출력한 다음, i++; 증가 시켜주기.
public class BOJ10950_v1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int T= Integer.parseInt(br.readLine());
    int i= 0;
    int A;
    int B;

    while (i < T) {
      String[] strs = br.readLine().split(" ");
      
      A = Integer.parseInt(strs[0]);
      B = Integer.parseInt(strs[1]);

      System.out.println(A + B);

      i ++;
    }
  }
}