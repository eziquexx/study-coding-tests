package baekjoon.class10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 25.12.26
// 문제 번호: BOJ 1085
// 풀이 내용: 
// 1. BufferedReader로 입력값 받기.
// 2. 입력받을 때 한 줄로 여러 숫자를 받는데, 공백 기준으로 나누어서 배열로 저장.
// 3. 각 인덱스 값을 x, y, w, h에 저장.
// 4. 총 4개의 값을 구해서 가장 작은 값을 출력하기.
// 5. 총 4개의 값은 (x-0), (y-0), (w-x), (h-y)
// 6. 왜냐하면 (x, y) 좌표의 값이 직사각형 변에 가장 먼저 닿는 최솟값을 구하는 거라서.

public class BOJ1085 {
  public static void main(String[] args) throws IOException {

    // 입력
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String nums[] = br.readLine().split(" ");
    int x = Integer.parseInt(nums[0]);
    int y = Integer.parseInt(nums[1]);
    int w = Integer.parseInt(nums[2]);
    int h = Integer.parseInt(nums[3]);

    // 최솟값 구하는 식
    int result = Math.min(Math.min(x, w-x), Math.min(y, h-y));
    
    // 출력
    System.out.println(result);
  }
}
