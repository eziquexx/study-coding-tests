package baekjoon.class5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 25.06.13
// 문제 번호: BOJ 10809
// 풀이 내용: 
// (1) BufferedReader 클래스를 사용하여 입력값 받기.
// (2) String S에 단어 입력받기.
// (3) int[] az를 알파벳 개수 만큼 크기 생성.
// (4) for문으로 az 배열 전체에 -1을 기본값으로 설정.
// (5) for문 사용하여 계산.
//     : S.length() 만큼 반복
//     : char c에 S.charAt()을 사용하여 S에 입력 받은 단어 한 글자씩 담기.
//     : int index에  c - 'a'(a의 아스키코드 값)를 빼서 알파벳 몇 번째 순서에 있는지 구하기.
//     : if문을 사용하여 az를 순회하면서 -1 같이면 az[index]에 i값 저장하기.
//     : 왜냐하면 apple 단어에서 p처럼 중복 알파벳이 있을 수도 있기 때문에.
// (6) for문 사용하여 az 크기 만큼 반복하여 az 요소들 출력.
// (7) br.close(); 해주기.
public class BOJ10809_v2 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String S = br.readLine();
    int[] az = new int['z' - 'a' + 1]; // 알파벳 길이

    // az에 기본 -1으로 세팅하기
    for (int i = 0; i < az.length; i++) {
      az[i] = -1;
    }

    for (int i = 0; i < S.length(); i++) {
      char c = S.charAt(i); // S의 i번째 문자를 구해 아스키코드 값 저장
      int idx = c - 'a'; // 구한 아스키코드 값에 -'a' (a아스키코드 값)을 해주기

      if (az[idx] == -1) { // apple 처럼 중복되는 문자가 있을 수 있어서 -1이면 조건을 추가
        az[idx] = i;
      }
    }

    for (int i = 0; i < az.length; i++) { // az 출력
      System.out.print(az[i] + " ");
    }

    br.close();
  }
}
