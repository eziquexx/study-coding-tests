package baekjoon.class7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 25.06.22
// 문제 번호: BOJ 2738
// 풀이 내용: 
// 1. BufferedReader로 입력값 받기.
// 2. String[] nm에 생성할 행렬의 크기를 입력 받아서 공백 기준으로 나누기.
// 3. int N과 int M에 nm의 0번째, 1번째 값 각각 저장.
// 4. int[][] numArr을 [N][M] 크기로 생성.
// 5. 행렬을 순차적으로 값을 넣기 위한 int count를 생성.
// 6. while문 + if문을 사용하여 입력값이 없을 때까지 반복으로 입력값 받기.
// 7. String[] inputArr에 입력 받은 값을 공백 기준으로 나누어 배열로 저장.
// 8. if문 사용하여 1번 입력 받을 때마다 count와 N의 값이 같으면 count를 0으로 초기화.
// 9. for문을 사용하여 M만큼 반복하는데, count행렬에 inputArr의 요소를 순차적으로 저장. 여기서 저장할 때 다른 값이 덮어씌워지지 않도록 기존 값과 새로 들어오는 값을 더하여 저장하도록 함.
// 10. count++ 해서 0, 1, 2 이런식으로 N번까지 반복되도록 증가시켜주기.
// 11. for문 사용하여 numArr 값을 출력
// 12. BufferedReader .close() 해주기 

public class BOJ2738_v1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] nm = br.readLine().split(" ");
    int N = Integer.parseInt(nm[0]);
    int M = Integer.parseInt(nm[1]);

    int[][] numArr = new int[N][M]; // N, M 크기의 행렬 선언

    int count = 0; // 행렬 순차적으로 값을 넣기 위한 count

    while (true) { // 입력값 없을때 까지 반복
      String input = br.readLine(); // 입력 받기
      if (input == null || input.trim().isEmpty()) {
        break;
      }

      // 공백 기준으로 나누어 저장
      String[] inputArr = input.split(" ");

      // 0, 1, 2 순으로 입력값 없을 때까지 반복할 거라서 
      // count가 N과 동일하면 0으로 초기화
      if (count == N) { 
        count = 0;
      }

      for (int i = 0 ; i < M; i++) { // 행렬을 순차적으로 돌면서 값을 더하여 저장
        numArr[count][i] = numArr[count][i] + Integer.parseInt(inputArr[i]);
      }

      count++;
    }

    for (int i = 0; i < N; i++) { // 출력
      for (int j = 0; j < M; j++) {
        System.out.print(numArr[i][j] + " ");
      }
      System.out.println();
    }

    br.close();
  }
}
