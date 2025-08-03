package baekjoon.class9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// 문제 푼 날짜: 25.08.03
// 문제 번호: BOJ 11653
// 풀이 내용: 
// 1. BufferedReader로 입력값 받기.
// 2. int N에 입력값 받아서 저장.
// 3. int temp에 N 값 저장.
// 4. int i = 2 초기화 및 선언
// 5. List<Integer> 타입으로 nums 선언.
// 6. while문을 사용하여 소인수분해 계산하기.
//    - N입력값이 1이면 아무것도 출력 x
//    - 소인수분해 했을 때 나눈 값을 nums에 .add()하여 저장.
// 7. nums를 한 줄씩 출력.

public class BOJ11653_v1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());
    int temp = N;
    int i = 2;
    
    // 소인수분해 할때 나누기 값을 nums에 저장.
    List<Integer> nums = new ArrayList<>();
    while (temp > 1) {
      if (temp < 2) { return; }
      if (temp % i == 0) {
        nums.add(i);
        temp = temp / i;
      } else {
        i++;
      }
    }

    for (int n : nums) {
      System.out.println(n);
    }
  }
}
