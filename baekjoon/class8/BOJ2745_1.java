package baekjoon.class8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 25.06.27
// 문제 번호: BOJ 2745
// 풀이 내용: 
// 1. BufferedReader로 입력값 받기.
// 2. String[] input에 입력값을 공백으로 나누어 저장.
// 3. String B와 int N에 input[0], input[1] 값 저장.
// 4. int[] az에 알파벳 개수 크기로 생성.
// 5. int x = 10 선언 및 초기화. 나중에 필요.
// 6. for문을 사용하여 문제에 출시된 A=10, B=11, ... , Z=35 설정하기 위해 az 배열에 순차적으로 x+=1 값을 저장.
// 7. for문을 사용하여 10진수 인지 아닌지 체크를 위해 B의 한 글자씩 0~9의 숫자인지 비교하기.
//    : 만약에 숫자면 azIndex[i] 위치에 c를 저장하고,
//    : 숫자가 아니라면 알파벳 자리 계산하여 index에 저장하고 
//    : az[] 배열이 알파벳 순으로 값을 저장해 놓은 것이므로,
//    : azIndex[i]에 az[index] 값을 저장
// 8. azIndex에 담긴 값을 N진법으로 계산을 중첩 for문으로 계산
//    : 예를들어, 5개의 문자로 이루어진거라면 0번째는 4번, 1번째는 3번, 2번째는 2번, 3번째는 1번, 4번째는 0번
//    : 이러한 순으로 계산해야하기 때문에 바깥 for문은 int i = 0; input[0].lenght 만큼 반복.
//    : 안쪽 for문은 int j = input[0].length - 1 값으로 해야하는데,
//    : count에 input[0].length을 저장하고, int j = count - 1; 로 지정하여 0보다 작을때까지 j-- 로 반복
//    : 그리고 count-- 하여 4, 3, 2, 1 반복, 3, 2, 1 반복할 수 있도록 설정.
//    : 반복할 때마다 multiply = multiply * N 을 저장. (N은 진수법)
//    : 안쪽 for문 끝날때마다 result에 result + (multiply * azIndex[i]) 값을 누적시켜준다.
// 9. 마지막에 result 출력. 그리고 BufferedReader .close() 해주기

public class BOJ2745_1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String[] input = br.readLine().split(" "); // 공백으로 나누어 저장
    String B = input[0].toUpperCase();
    int N = Integer.parseInt(input[1]);

    int[] az = new int['z' - 'a' + 1];
    int x = 10;
    
    // 문제에 출시된 A=10, B=11, ... Z=35 을 
    // index 계산하기 위해 순차적으로 저장.
    for (int i = 0; i < az.length; i++) {
      az[i] = x;
      x += 1;
    }
    
    // 10진수 인지 아닌지 체크 (0~9 사이의 값인지)
    // 문자가 있으면 해당 문자의 값을 구하여 azIndex에 저장
    String[] azIndex = new String[B.length()];
    for (int i = 0; i < B.length(); i++) {
      char c = B.charAt(i);
      if (c >= '0' && c <= '9') { // c가 0~9사이의 값이라면
        azIndex[i] = String.valueOf(c); // azIndex[i]에 c 저장
      } else { // 아니라면
        int index = c - 'A'; // 문자열 위치 계산
        azIndex[i] = String.valueOf(az[index]); // 해당 위치의 값 azIndex[i]에 저장
      }
    }

    // azIndex를 N진법으로 계산.
    int multiply = 1;
    int result = 0;
    int count = input[0].length();
    for (int i = 0; i < input[0].length(); i++) { // 5
      multiply = 1;
      // 예시: 0번자리는 4번, 2번 자리는 3번, 3번 자리는 2번, 4번 자리는 1번, 5번 자리는 0
      for (int j = count - 1; j > 0; j--) {
        multiply = multiply * N;
      }
      count--;
      result = result + (multiply * Integer.parseInt(azIndex[i]));
    }
    System.out.println(result);
    br.close();
  }
}
