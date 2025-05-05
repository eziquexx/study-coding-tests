package baekjoon.class1;

import java.util.Scanner;

// 문제 푼 날짜: 25.05.05
// 문제 번호: BOJ 18108
// 문제 제목: 1998년생인 내가 태국에서는 2541년생?! 불기 연도를 서기 연도로 변환
// 풀이 내용: 
// (1) Scanner 내장 클래스 사용.
// (2) 입력받은 불기 연도를 서기 연기로 바꿔주는 식 작성.
//     불기 연도 - 543을 하면 서기 연도가 된다.
public class BOJ18108_v1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int BE = sc.nextInt();
    int CE = BE - 543;

    System.out.println(CE);
  }
}