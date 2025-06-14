package baekjoon.class5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 25.06.15
// 문제 번호: BOJ 1152
// 풀이 내용: 
// (1) BufferedReader 객체 생성
// (2) String input에 입력값 받아서 저장
// (3) int num에 단어 개수 담을 거라 초기화 시키기
// (4) if문 사용하기
//     : input이 null이 아니고 빈 문자열이 아니라면 실행
//     : String[] words 생성하여 .trim() 사용해서 앞뒤 공백 자르고,
//     : .split("\\s+") 사용해서 연속된 공백도 깔끔하게 잘라내어 저장
//     : num에 words 길이 저장. (단어 개수)
// (5) nums 출력하기
// (6) BufferedReader .close() 하기
public class BOJ1152_v1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String input = br.readLine(); // 입력 값 받아서 저장
    int num = 0; // 단어 개수 초기화

    if (input != null && !input.trim().isEmpty()) { // 입력 값이 null이 아니고 비어있지 않다면 실행
      String[] words = input.trim().split("\\s+"); // 연속된 공백을 처리할 때 사용 \\s+
      num = words.length; // 단어 몇 개인지 저장
    }

    System.out.println(num); // 출력
    br.close();
  }
}
