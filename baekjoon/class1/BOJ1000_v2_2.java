package baekjoon.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 25.05.01
// 문제 번호: BOJ 1000
// 문제 제목: A+B
// 풀이 내용: 
// (1) BufferedReader 클래스 사용하여 사용자한테 두 개의 정수를 입력 받은 뒤, 두 수의 합을 더한 다음 출력하기.
// (2) .readLine() 메서드 사용하기.
// (3) .readLine()은 문자열만 입력이 되기 때문에 정수로 형변환 시켜주기.
// 수정:
// (1) 백준에서 BufferedReader 클래스를 사용하여 제출하면 NumberFormatException이 발생한다.
// (2) 찾아보니 프로그램이 자동으로 숫자를 입력할 때 숫자가 1 줄바꿈 2 이런 형태로 되면 괜찮지만 1 공백 2 형식이라면
//     .split() 메서드를 사용하여 공백을 기준으로 값을 나누어서 배열 형태로 저장을 해야한다고 한다.
//     그리고 배열에 있는 값을 각각 불러와서 숫자로 형변환 해줘야한다.
public class BOJ1000_v2_2 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] strs = br.readLine().split(" ");

    System.out.println("첫 번째 숫자(정수)를 입력해주세요: ");
    int A = Integer.parseInt(strs[0]);

    System.out.println("두 번째 숫자(정수)를 입력해주세요: ");
    int B = Integer.parseInt(strs[1]);

    int sum = A + B;

    System.out.println("입력된 숫자 합: " + sum);
  }
}