package baekjoon.class8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
