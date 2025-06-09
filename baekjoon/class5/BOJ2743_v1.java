package baekjoon.class5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 25.06.09
// 문제 번호: BOJ 2743
// 풀이 내용: 
// (1) BufferedReader 클래스를 사용하여 입력값 받기.
// (2) String word에 단어 입력 받기.
// (3) .length() 사용해서 길이 출력하기.
public class BOJ2743_v1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String word = br.readLine();

    System.out.println(word.length());
    br.close();
  }
}
