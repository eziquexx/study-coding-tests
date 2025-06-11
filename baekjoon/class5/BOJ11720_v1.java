package baekjoon.class5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 25.06.11
// 문제 번호: BOJ 11720
// 풀이 내용: 
// (1) BufferedReader 클래스를 사용하여 입력값 받기.
// (2) int N에 몇 개 받을지 저장.
// (3) int[] nums에 N개 크기로 생성.
// (4) String[] input에 입력받은 숫자들을 1글자씩 배열로 담기.
// (5) int sum 합계 담는 변수 선언.
// (6) for문 사용해서 입력 받은 input값을 nums에 배열로 저장.
// (6) for-each문 사용해서 nums에 있는 값 전체 더하기.
// (7) 총 합계 출력.
public class BOJ11720_v1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine()); // N개의 숫자
    int[] nums = new int[N]; // 숫자 배열 생성
    String[] input = br.readLine().split(""); // 1개씩 나누어 담기.
    int sum = 0; // 합계 담는 용

    // 반복문 사용해서 nums에 input 배열 하나씩 담기
    for (int i = 0; i < nums.length; i++) {
      nums[i] = Integer.parseInt(input[i]);
    }

    // for-each문 사용해서 총 합 구하기
    for (int num : nums) {
      sum = num + sum;
    }

    // 총 합 출력
    System.out.println(sum);
  }
}