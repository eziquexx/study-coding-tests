package baekjoon.class6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 25.06.17
// 문제 번호: BOJ 10988
// 풀이 내용: 
// (1) 입력은 BufferedReader 클래스 사용
// (2) String input에 입력값 받아서 저장
// (3) String reverse 선언만
// (4) for문 사용해서 input 값의 마지막 알파벳부터 처음까지 한글자씩 reverse에 저장
// (5) if문 사용해서 input과 reverse가 같은지 .equals() 메서드를 사용해서 비교
// (6) BufferedReader.close() 해주기
public class BOJ10988_v1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String input = br.readLine();
    String reverse = "";
    
    // input의 알파벳을 마지막부터 시작해서 reverse에 담기
    for (int i = input.length() - 1; i >= 0 ; i--) {
      reverse = reverse + input.charAt(i);
    }

    // input과 reverse 같은지 비교
    if (input.equals(reverse)) {
      System.out.println("1");
    } else {
      System.out.println("0");
    }

    br.close();
  }
}
