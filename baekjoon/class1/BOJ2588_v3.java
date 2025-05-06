package baekjoon.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 25.05.06
// 문제 번호: BOJ 2588
// 문제 제목: 곱셈
// 풀이 내용: 
// (1) BufferedReader + InputStreamReader 클래스를 사용하여 입력 값 받기.
// (2) 입력 받은 값을 int타입으로 A, B 변수에 저장. (.readLine()으로 입력 받아야해서 숫자로 형변환해주기.)
// (3) 변수 B의 길이를 구해야해서 String.valueOf().length()를 사용하여 길이 구하기.
//     구한 값은 숫자형태라서 int타입의 변수에 저장. int lenB로 지정.
// (4) 변수 A와 B의 곱한 값을 int sum에 저장.
// (5) int[] 배열 선언과 초기화 하기. int[] arrLen = new int[lenB]; lenB는 B의 길이.
// (6) for문을 사용하여 B의 길이만큼 반복시키기.
//     B % 10의 나머지 값을 int[] arrLen에 저장하기. 
//     이때 int[] 형태라서 int[i] = B % 10; 값을 넣어주기.
//     그리고 B / 10의 몫을 B에 저장. 
// (7) for문의 반복 횟수에 맞추어 B % 10 나머지 값들과 A를 곱한 값을 출력하고 int sum도 출력. 
public class BOJ2588_v3 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int A = Integer.parseInt(br.readLine());
    int B = Integer.parseInt(br.readLine());

    int lenB = String.valueOf(B).length();
    int sum = A * B;

    // 고정된 길이의 int array 만들기
    int[] arrLen = new int[lenB];

    for (int i = 0; i < lenB; i++) {
      int result = B % 10;
      arrLen[i] = result;

      B = B / 10;

      System.out.println(arrLen[i] * A);
    }

    System.out.println(sum);

  }
}