package baekjoon.class1;

import java.util.Scanner;

// 문제 푼 날짜: 25.05.05
// 문제 번호: BOJ 10926
// 문제 제목: ??!
// 풀이 내용: 
// (1) Scanner 클래스를 사용하여 입력 값 받기.
// (2) 입력 받는 값은 문자열 타입의 name에 저장.
// (3) 출력 시 name 뒤에 "??!" 입력.
public class BOJ10926_v1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String name = sc.nextLine();

    System.out.println(name + "??!");    
  }
}