package baekjoon.class1;

import java.io.Console;

// 문제 푼 날짜: 25.05.01
// 문제 번호: BOJ 1000
// 문제 제목: A+B
// 풀이 내용: 
// (1) Console 클래스를 사용하여 사용자한테 두 개의 숫자(정수)를 받은 뒤, 두 수의 합을 구해 출력하기.
// (2) .readLine() 메서드 사용하기.
// (3) .readLine()은 문자열만 입력이 되기 때문에 정수로 형변환 시켜주기.
// 메모:
// (1) 백준에서는 틀린 답이다.
// (2) Console은 System.console() 기반 입력 도구라서 콘솔에서만 정상 작동한다. 
//     즉, 터미널 환경이 아니라면 null 값 반환.
public class BOJ1000_v3 {
  public static void main(String[] args) {
    Console console = System.console();

    if (console != null) {
      int A = Integer.parseInt(console.readLine("첫 번째 숫자(정수)를 입력해주세요: "));
      int B = Integer.parseInt(console.readLine("두 번째 숫자(정수)를 입력해주세요: "));

      int sum = A + B;
      System.out.println("두 수의 합은: " + sum);
    } else {
      System.out.println("콘솔을 사용할 수 없습니다.");
    }
  }
}
