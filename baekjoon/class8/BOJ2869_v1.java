package baekjoon.class8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 25.07.28
// 문제 번호: BOJ 2869
// 풀이 내용: 
// 1. BufferedReader로 입력값 받기.
// 2. String[] input에 입력값을 공백으로 나누어 저장.
// 3. int A, B, V에 각 값 저장.
// 4. while문을 사용하여 하루에 A-B 만큼 증가하되 V에 도달하면 break. 도달하지 않으면 day++;

public class BOJ2869_v1 {
  public static void main(String[] ags) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    int A = Integer.parseInt(input[0]); // 낮 up
    int B = Integer.parseInt(input[1]); // 밤 down
    int V = Integer.parseInt(input[2]); // 나무 막대

    int day = 1; // 날짜
    int result = 0;
    
    while (true) {
      if (result + A < V) {
        result = result + A - B;
        day++;
      } else {
        break;
      }
    }

    System.out.println(day);
  }
}