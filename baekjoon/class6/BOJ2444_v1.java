package baekjoon.class6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 25.06.16
// 문제 번호: BOJ 2444
// 풀이 내용: 
// (1) 입력은 BufferedReader 클래스 사용
// (2) int N에 입력받은 값 숫자타입으로 형변환하여 저장
// (3) int num에 N을 저장
// (4) int count = 0; 선언과 초기화
// (5) int starC = 1; 선언과 초기화. 별 출력할 때 사용
// (6) for문 사용하여 9번 반복하는 계산을 만듦
// (7) if-else문을 사용해서 count가 N보다 작으면 상단 별 계산. N보다 크면 하단 별 계산하도록 작성
// (8) 상단 계산
//     : for문 사용해서 공백이 4, 3, 2, 1, 0 순으로 출력되도록 계산
//     : for문 사용해서 공백이 끝나면 바로 실행되는데, 별이 1, 3, 5, 7, 9 출력되도록 계산
//     : 공백과 별 계산이 끝나면 줄바꿈.
//     : count 1씩 증가, starC 별 개수 2씩 증가, num 공백 1씩 감소 시켜주기
// (9) 하단 계산
//     : 처음에 starC 2씩 감소되도록 작성
//     : 그 다음 num 공백이 1씩 증가되도록 작성
//     : for문 사용해서 공백이 1, 2, 3, 4 순으로 출력되도록 계산
//     : for문 사용해서 별이 7, 5, 3, 1 순으로 출력되도록 계산
//     : 공백과 별 계산이 끝날 때마다 줄바꿈.
public class BOJ2444_v1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine()); // 5
    int num = N;
    int count = 0;
    int starC = 1;

    for (int i = 0; i < N * 2 - 1; i++) { // 9번 반복
      
      // if문 count 5 기준으로 계산 공백과 별 출력 계산
      if (count < N) { 

        // 공백 계산
        for (int j = num - 1; j > 0; j--) {
          System.out.print(" ");
        }

        // 별 계산
        for (int k = 0; k < starC; k++) {
          System.out.print("*");
        }

        System.out.println(); // 줄바꿈
        count++; // count 1씩 증가
        starC += 2; // 별 개수 2씩 증가
        num--; // 공백 1씩 감소

      } else { // count 5 이상이면 실행
        starC -= 2; // 별 개수 2씩 감소
        num++; // 공백 1씩 증가

        // 공백 계산
        for (int j = 0; j < num; j++) {
          System.out.print(" ");
        }

        // 별 계산
        for (int k = starC - 2; k > 0; k--) {
          System.out.print("*");
        }

        System.out.println(); // 줄바꿈
      }
      
    }
  }
}
