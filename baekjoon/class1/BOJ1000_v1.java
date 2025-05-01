package baekjoon.class1;

import java.util.Scanner;

// 문제 푼 날짜: 25.05.01
// 문제 번호: BOJ 1000
// 문제 제목: A+B
// 풀이 내용: 
// (1) Scanner 클래스를 사용하여 입력 값을 콘솔로 받은 다음, 두 수의 합을 함쳐서 결과를 내기.
// (2) 숫자는 nextInt(), 문자열은 nextLine() 사용한다.
public class BOJ1000_v1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("첫 번째 숫자(정수)를 입력하세요: ");
    int A = sc.nextInt();
    
    System.out.println("두 번째 숫자(정수)를 입력하세요: ");
    int B = sc.nextInt();

    int sum = A + B;
    System.out.println("두 수의 합: " + sum);

    sc.close();

  }
}