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
// 4. 하루에 가는 거리는 A-B, 전날 올라가야하는 거리 V-B
// 5. 전날 올라가야하는 거리 / 하루에 올라가는 거리를 나눈 다음 반올림을 해주기.
// 6. 반올림을 하려면 소수점이 출력되어야해서 double로 형변환시키고 ceil 메서드 사용하여 반올림 한 다음 int 타입으로 다시 바꾸어 주기.

public class BOJ2869_v2 {
  public static void main(String[] ags) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    int A = Integer.parseInt(input[0]); // 낮 up
    int B = Integer.parseInt(input[1]); // 밤 down
    int V = Integer.parseInt(input[2]); // 나무 막대

    // 
    int day = (int) Math.ceil((double)(V-B) / (A-B));
    System.out.println(day);
  }
}