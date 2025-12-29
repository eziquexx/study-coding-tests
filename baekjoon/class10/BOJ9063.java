package baekjoon.class10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 25.12.29
// 문제 번호: BOJ 9063
// 풀이 내용: 
// 1. BufferedReader로 입력값 받기.
// 2. 몇 번 입력 받을지 횟수를 int N에 저장.
// 3. x, y의 각 작은 값과 큰 값을 구해야하기 때문에 
//    int타입의 maxX, minX, maxY, minY 값을 0으로 초기화하여 선언.
// 4. for문을 사용해 N번 반복.
// 5. 입력받은 좌표를 String nums[]에 공백 기준으로 나누어 저장.
// 6. int x, y에 nums의 각 인덱스 값을 저장.
// 7. maxX, minX, maxY, minY의 값은 처음에 0으로 설정했기 때문에, 
//    비교해야할 초기값을 처음에 입력 받은 x,y로 저장. 단 i=0일 때에만 실행하도록 조건.
// 8. 내장함수 또는 조건문으로 maxX, minX, maxY, minY 값을 구하기.
// 9. for문 블럭 밖에서 (maxX-minX) * (maxY-minY) 계산한 값을 int result에 저장.

public class BOJ9063 {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 입력횟수
    int N = Integer.parseInt(br.readLine());

    // x, y 각 작은 값과 큰 값 구하여 저장
    int maxX = 0, minX = 0, maxY = 0, minY = 0;

    // N번 반복
    for (int i = 0; i < N; i++) {
      String nums[] = br.readLine().split(" ");
      int x = Integer.parseInt(nums[0]);
      int y = Integer.parseInt(nums[1]);

      // x, y 초기값 설정
      if (i == 0) {
        maxX = x;
        maxY = y;
        minX = x;
        minY = y;
      } 

      // x, y값과 maxX, maxY 값을 비교하여 값을 저장
      // 1. 내장함수로 구하기
      // maxX = Math.max(maxX, x);
      // minX = Math.min(minX, x);
      // maxY = Math.max(maxY, y);
      // minY = Math.min(minY, y);

      // 2. 조건문으로 값 구하기
      if (x > maxX) {
        maxX = x;
      } 
      if (x < minX) {
        minX = x;
      }

      if (y > maxY) {
        maxY = y;
      } 
      if (y < minY) {
        minY = y;
      }
    }

    // 계산
    int result = (maxX - minX) * (maxY - minY);

    // 출력
    System.out.println(result);
  }
}
