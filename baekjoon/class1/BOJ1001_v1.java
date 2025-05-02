package baekjoon.class1;

import java.util.Scanner;

// 문제 푼 날짜: 25.05.02
// 문제 번호: BOJ 1001
// 문제 제목: A-B
// 풀이 내용: 
// (1) Scanner 내장 클래스를 사용하여 사용자에게 입력 값을 받기.
// (2) 입력 받은 값은 int타입에 각각 A, B 변수에 저장하기.
// (3) 입력 받은 A와 B의 계산을 담은 in타입의 변수 sum 생성.
// (4) sum에 저장된 값 출력하기.
// 메모:
// (1) 백준에서 쓸데없는 소스코드를 넣으면 틀렸다고 계산된다. 그래서 불필요한 소스코드는 제외해야겠다.
public class BOJ1001_v1 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // System.out.println("첫 번째 값 입력: ");
    int A = sc.nextInt();

    // System.out.println("두 번째 값 입력: ");
    int B = sc.nextInt();

    int sum = A - B;
    System.out.println(sum);

    sc.close();
  }
}