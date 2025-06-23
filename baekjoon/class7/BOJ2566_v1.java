package baekjoon.class7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 25.06.23
// 문제 번호: BOJ 2566
// 풀이 내용: 
// 1. BufferedReader로 입력값 받기.
// 2. int[][] numArr에 9x9 행렬 크기로 선언
// 3. 가장 큰 값을 담을 int max를 선언하고 0으로 초기화.
// 4. max가 위치한 행렬 위치를 담기 위한 int[] nums를 2 크기로 선언
// 5. for문을 사용하여 i를 9번 반복하고, 반복할 때마다 입력값을 받기. 입력값은 공백 기준으로 나누어 String[] inputArr에 저장.
// 6. 이중 for문으로 j를 9번 반복하고, numArr[i][j]에 inputArr[j] 값을 순차적으로 저장.
// 7. 그리고 if문을 사용하여 numArr[i][j]가 max보다 크면 max에 numArr[i][j]를 저장하고 i와 j를 nums에 0번째, 1번째에 값을 저장.
// 8. max값과 nums의 값을 출력.

public class BOJ2566_v1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[][] numArr = new int[9][9]; // 9x9 행렬 선언
    int max = 0;
    int[] nums = new int[2]; // max값 위치 구하기 위한 변수

    for (int i = 0; i < 9; i++) {
      String[] inputArr = br.readLine().split(" ");

      for (int j = 0; j < 9; j++) {
        numArr[i][j] = Integer.parseInt(inputArr[j]);

        // 가장 큰 수와 위치 구하는 계산
        if (numArr[i][j] > max) {
          max = numArr[i][j];
          nums[0] = i;
          nums[1] = j;
        }
      }
    }

    System.out.println(max); // 가장 큰 값 출력
    for (int num : nums) { // 가장 큰 값 위치 출력
      System.out.print(num + 1 + " ");
    }
  }
}
