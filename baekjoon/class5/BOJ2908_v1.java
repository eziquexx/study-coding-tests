package baekjoon.class5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 25.06.15
// 문제 번호: BOJ 2908
// 풀이 내용: 
// (1) BufferedReader 객체 생성
// (2) String[] input에 입력받은 값 공백 기준으로 나누어 저장
// (3) int[] nums를 input.length 크기로 생성
// (4) 가장 큰 값을 구하기 위해 int max 선언 및 초기화
// (5) for문 사용하여 input 값을 nums에 숫자로 형변환하여 저장
// (6) for문 사용하여 reverse 계산하여 저장
//     : 각 nums의 요소들을 10으로 나눈 다음 나머지 값들을 모아서 해당 nums[i] 위치에 다시 저장
// (7) for문 사용하여 가장 큰 값 구하기
//     : nums[i]가 max보다 크면 max에 저장하는 식을 사용하여 가장 큰 수 구하기
// (8) max 출력하기
// (9) BufferedReader .close() 해주기
public class BOJ2908_v1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] input = br.readLine().split("\\s+");
    int[] nums = new int[input.length];
    int max = 0;

    
    for (int i = 0; i < nums.length; i++) {
      nums[i] = Integer.parseInt(input[i]); // 입력 받은 값 숫자로 형변환하여 nums에 저장

      // reverse 계산
      int num = nums[i];
      String revNum = "";

      for (int j = 0; j < String.valueOf(nums[i]).length(); j++) {
        int temp = num % 10;
        num /= 10;

        revNum = revNum + temp;
      }

      // reverse 계산한 값 다시 저장
      nums[i] = Integer.parseInt(revNum);
    }

    // 가장 큰 값 구하기
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > max) {
        max = nums[i];
      }
    }

    // 출력
    System.out.println(max); 

    br.close();
  }
}