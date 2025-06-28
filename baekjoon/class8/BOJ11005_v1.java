package baekjoon.class8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 25.06.28
// 문제 번호: BOJ 11005
// 풀이 내용: 
// 1. BufferedReader로 입력값 받기.
// 2. String[] input에 입력값을 공백으로 나누어 저장.
// 3. int B와 int N에 input[0], input[1] 값 저장.
// 4. String[] az에 알파벳 개수 크기로 생성.
// 5. int index = 0 선언 및 초기화. 나중에 필요.
// 6. String result = ""; 결과를 담을 변수 선언 및 초기화.
// 7. for문을 사용해서 a~z까지의 알파벳을 String[] az에 저장.
// 8. B값을 N진법으로 계산하여 값을 구하는 계산하기.
//    : int Number에 N의 값을 저장.
//    : int x = 0; 선언 및 초기화. Number % N 했을 때 나머지 값 저장할 용도.
//    : while문 사용하여 number가 0 미만이 될때까지 반복.
//    : 블럭 내용은 x = number % B의 값을 저장하고.
//    : number는 number / B의 값을 저장한다.
//    : if문을 사용해서 x가 10 미만이면 result에 x + result; 값을 저장하고,
//    : else를 사용하여 result에 az[x-10] + result 값을 연달아 저장한다.
//    : az는 알파벳 a~z까지 담은 배열이고 x는 N으로 나눈 나머지값. -10을 한 이유는
//    : A는 10부터 시작하기 때문에.
// 9. 마지막에 result출력하고 BufferedReader는 .close() 해준다.

public class BOJ11005_v1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] input = br.readLine().split(" ");
    int N = Integer.parseInt(input[0]);
    int B = Integer.parseInt(input[1]);

    String[] az = new String['z' - 'a' + 1];
    int index = 0;
    String result = "";

    // a-z 까지 알파벳 담기
    for (char c = 'a'; c <= 'z'; c++) {
      az[index] = String.valueOf(c).toUpperCase();
      index++;
    }
    
    // N진법으로 계산, 변환하여 출력
    int number = N;
    int x = 0;
    while (number > 0) {
      x = number % B;
      number = number / B;
      
      if (x < 10) {
        result = x + result;
      } else {
        result = az[x-10] + result;
      }
    }

    System.out.println(result);
    br.close();
  }
}
