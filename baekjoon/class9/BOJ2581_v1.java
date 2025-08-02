package baekjoon.class9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

// 문제 푼 날짜: 25.08.02
// 문제 번호: BOJ 2581
// 풀이 내용: 
// 1. BufferedReader로 입력값 받기.
// 2. int M, int N에 각각 입력값 받기.
// 3. 소수인 값을 담기 위해 nums를 ArrayList로 선언.
// 4. M~N 사이를 순환하기 위해 for문 사용.
// 5. M~N 사이의 나머지가 0인 자연수를 ArrayList<Integer> 타입의 other을 생성하고 .add()메서드를 사용하여 추가하기.
// 6. other의 크기가 2인 값을 구하여 nums에 추가하기.
// 7. if문을 사용하여 nums에 값이 없으면 -1을 출력, 그러지 않으면 nums의 요소들을 전체 합한 값은 sum, 가장 작은 수를 min에 저장하여 출력. 

public class BOJ2581_v1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int M = Integer.parseInt(br.readLine());
    int N = Integer.parseInt(br.readLine());
    
    ArrayList<Integer> nums = new ArrayList<>();
    
    // M ~ N 사이의 소수 구하기 계산
    for (int i = M; i <= N; i++) {
      ArrayList<Integer> other = new ArrayList<>();
      
      // M ~ N 사이의 나머지가 0인 자연수 구하기
      for (int j = 1; j <= i; j++) {
        int num = i % j;
        if (num == 0) {
          other.add(j);
        }
      }

      // 소수 구하기
      if (other.size() == 2) {
        nums.add(i);
      }
    }

    if (nums.size() == 0) {
      System.out.println(-1);
    } else {
      // 전체 합과 가장 작은 수 구하기
      int sum = 0;
      int min = nums.get(0);
      for (int n : nums) {
        sum += n; // 합
        if (min > n) { // 최소값
          min = n;
        }
      }
      System.out.println(sum);
      System.out.println(min);
    }
    
    br.close();
  }
}
