package baekjoon.class5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 25.06.15
// 문제 번호: BOJ 5622
// 풀이 내용: 
// (1) BufferedReader 객체 생성
// (2) String[] input에 입력받은 값을 한 글자씩 나누어 저장
// (3) int number 선언과 초기화
// (4) for문 사용해서 입력 받은 값의 길이만큼 반복. 그리고 한 문자씩 if문을 사용하여 계산
// (5) number 출력
// (6) BufferedReader .close() 하기
public class BOJ5622_v1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] input = br.readLine().split("");
    int number = 0;

    // if문 사용
    // 입력받은 값 중에서 abc가 있으면 number에 += 2 + 1, def는 number에  += 3 + 1 ... 
    for(int i = 0; i < input.length; i++) {
      String s = input[i].toUpperCase();
      char c = s.charAt(0);

      if (c == 'A' || c == 'B' || c == 'C') {
        number += 2 + 1;
      } else if (c == 'D' || c == 'E' || c == 'F') {
        number += 3 + 1;
      } else if (c == 'G' || c == 'H' || c == 'I') {
        number += 4 + 1;
      } else if (c == 'J' || c == 'K' || c == 'L') {
        number += 5 + 1;
      } else if (c =='M' || c == 'N' || c == 'O') {
        number += 6 + 1;
      } else if (c == 'P' || c == 'Q' || c == 'R' || c == 'S') {
        number += 7 + 1;
      } else if (c == 'T' || c == 'U' || c == 'V') {
        number += 8 + 1;
      } else if (c == 'W' || c == 'X' || c == 'Y' || c == 'Z') {
        number += 9 + 1;
      } else {
        System.out.println("대문자 알파벳만 입력해주세요.");
      }
    }

    System.out.println(number);

    br.close();

  }
}
