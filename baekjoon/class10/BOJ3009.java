package baekjoon.class10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 25.12.28
// 문제 번호: BOJ 3009
// 풀이 내용: 
// 1. BufferedReader로 입력값 받기.
// 2. int타입 a, b, c, d 값을 0으로 초기화 선언.
// 3. int타입 counta, countb, countc, countd 값을 0으로 초기화 선언.
// 4. 3번 입력값을 받아야하기 때문에 for문을 사용하여 3회 반복문 설정.
// 5. 입력값은 공백 기준으로 String nums[]에 저장.
// 6. int x, y에 nums[] 각 인덱스 값을 저장.
// 7. 비교할 값이 필요하므로 a, c에 각 x, y 값을 저장.단, 첫번째 입력값 조건한에서.
// 8. if문을 사용하여 a, c 값이 x, y와 같으면 a, c에 저장. 그러하지 않으면 b, d에 저장.
//    그리고 각 알파벳에 카운터를 추가.
// 9. int result[]를 2크기로 설정.
// 10. count가 2 미만인 값을 찾아서 result[] 인덱스에 각 값을 저장.
// 11. result[] 인덱스 값을 출력.

public class BOJ3009 {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a = 0, b = 0, c = 0, d = 0;
    int counta = 0, countb = 0, countc = 0, countd = 0;

    for (int i = 0; i < 3; i++) { // 3번 입력
      String nums[] = br.readLine().split(" ");
      int x = Integer.parseInt(nums[0]);
      int y = Integer.parseInt(nums[1]);

      if (i == 0) { // 비교할 a, c 초기화값 설정
        a = x;
        c = y;
      }

      if (a == x) {
        a = x;
        counta ++;
      } else {
        b = x;
        countb ++;
      }
      
      if (c == y) {
        c = y;
        countc ++;
      } else {
        d = y;
        countd ++;
      }
    }

    int result[] = new int[2];

    if (counta < 2) {
      result[0] = a;
    } else {
      result[0] = b;
    }

    if (countc < 2) {
      result[1] = c;
    } else {
      result[1] = d;
    }

    System.out.println(result[0] + " " + result[1]);
  }
}
