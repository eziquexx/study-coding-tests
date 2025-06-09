package baekjoon.class5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 25.06.09
// 문제 번호: BOJ 27866
// 풀이 내용: 
// (1) BufferedReader 클래스를 사용하여 입력값 받기.
// (2) String S에 단어 입력 받기.
// (3) int i에 몇 번째 글자 출력하지 숫자 입력 받기.
// (4) char[] letters에 toCharArray() 사용해서 한 글자씩 배열에 담기.
// (5) 출력할 때 index 고려해서 i-1 해주기.
public class BOJ27866_v1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String S = br.readLine(); // 단어 입력 받기
    int i = Integer.parseInt(br.readLine()); // 몇 번째 글자
    char[] letters = S.toCharArray(); // 

    System.out.println(letters[i-1]);
    br.close();
  }
}