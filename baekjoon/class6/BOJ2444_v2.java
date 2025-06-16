package baekjoon.class6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 25.06.16
// 문제 번호: BOJ 2444
// 풀이 내용: 
// (1) 입력은 BufferedReader 클래스 사용
// (2) int N에 입력받은 값을 숫자타입으로 형변환하여 저장
// (3) main 메서드 아래에 printChars 메서드 생성
//     : 매개변수로 char ch, int count를 받도록 지정
//     : for문 사용하여 i가 count 보다 작으면 반복되도록 조건 지정
//     : ch를 출력
// (4) 다시 main 메서드로 돌아와서 상단과 하단 나누어서 계산.
// (5) 상단
//     : int spaceCount에 N - 1 - i; 초기화 -> 공백 계산
//     : int starCount에 2 * i + 1; 초기화 -> 별 계산
//     : printChars() 호출하여 공백은 spaceCount, 별은 starCount 호출하여 출력.
//     : 하나씩 실행되고 System.out.println()으로 줄바꿈을 해주기
// (6) 하단 
//     : for문 사용하여 계산.
//     : 조건식은 int i = N - 2; 로 지정. 즉, 3, 2, 1, 0 출력을 위해.
//     : 그 다음 조건식은 i >= 0 으로 작성. 마지막에 i-- 작성
//     : 상단과 동일하게 int spaceCount와, int starCount 생성과 초기화.
//     : 그 다음 printChars 사용하여 spaceCount와 starCount 출력
//     : 줄바꿈을 위해 System.out.println(); 작성
public class BOJ2444_v2 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());

    // 상단
    for (int i = 0; i < N; i++) {
      int spaceCount = N - 1 - i;
      int starCount = 2 * i + 1;

      printChars(' ', spaceCount);
      printChars('*', starCount);
      System.out.println();

    }

    // 하단
    for (int i = N - 2; i >= 0; i--) {
      int spaceCount = N - 1 - i;
      int starCount = 2 * i + 1;

      printChars(' ', spaceCount);
      printChars('*', starCount);
      System.out.println();
    }
  }

  // 반복 문자 출력 함수
  public static void printChars(char ch, int count) {
    for (int i = 0; i < count; i++) {
      System.out.print(ch);
    }
  }
}
