package baekjoon.class6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 25.06.18
// 문제 번호: BOJ 1157
// 풀이 내용: 
// (1) 입력은 BufferedReader 클래스 사용
// (2) String input에 입력받은 값을 대문자로 변환하여 저장
// (3) int[] count를 알파벳 개수만큼 생성
// (4) int max를 -1로 생성 -> a-z 알파벳 기본 0으로 세팅할 것이기 때문에 비교하기 위해서는 -1로 해야함
// (5) char result 빈 문자로 생성
// (6) for문 사용하여 알파벳 등장 횟수 세기
//     : input.length() 만큼 반복
//     : 알파벳 개수 크기로 생성한 count에 input의 알파벳 자리를 찾아서 count++ 해주기
// (7) for문 사용하여 많이 등장한 알파벳 찾기
//     : count.length 만큼 반복
//     : if문 사용하여 count[i]가 max보다 크면 max에 count[i] 저장하고 result에 count[i]의 자리의 알파벳을 구해야하는데 아스키코드를 활용하여 구하기
//     : 구하는 방법은 i + 'A' A의 아스키코드 값에 i를 더해주면 됨
//     : count[i]와 max의 값이 동일하면 result에 ? 저장
// (8) result 출력
public class BOJ1157_v1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String input = br.readLine().toUpperCase(); // 대문자로 변환
    int[] count = new int['z' - 'a' + 1]; // 알파벳 개수만큼 선언. 전체 0으로 초기화.
    int max = -1; // 최대값 구하기 위한 변수
    char result = ' ';

    // 각 알파벳 등장 횟수 세기
    for (int i = 0; i < input.length(); i++) {
      char c = input.charAt(i);

      count[c - 'A']++; // 해당 알파벳 자리의 count++ 해주기
    }

    // 가장 많이 등장한 알파벳 찾기
    for (int i = 0; i < count.length; i++) {
      if (count[i] > max) {
        max = count[i]; // 가장 큰 수 저장
        result = (char) (i + 'A'); // 알파벳 아스키코드 구하기
      } else if (count[i] == max) {
        result = '?';
      }
    }

    System.out.println(result);
    br.close();
  }
}