package baekjoon.class10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ5073 {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    ArrayList<String> numsArr = new ArrayList<>();
    ArrayList<String> output = new ArrayList<>();

    // 각 변 선언 및 초기화
    int sideA = 0, sideB = 0, sideC = 0;

    // 입력 받기
    while (true) {
      String input = br.readLine();
      if (input.equals("0 0 0")) break; // 입력값 0 0 0 이면 종료.

      numsArr.add(input);
    }

    // nums 길이 만큼 반복 + 계산
    for (int i = 0; i < numsArr.size(); i++) {
      String num[] = numsArr.get(i).split(" ");
      
      // 각 변에 값 저장
      sideA = Integer.parseInt(num[0]);
      sideB = Integer.parseInt(num[1]);
      sideC = Integer.parseInt(num[2]);
      
      // 가장 큰 변, 중간 변, 작은 변의 값
      int maxN = Math.max(sideA, Math.max(sideB, sideC));
      int minN = Math.min(sideA, Math.min(sideB, sideC));
      int midN = sideA + sideB + sideC - maxN - minN;

      // 나머지 두 변의 합
      int sumN = minN + midN;
      
      // 조건 계산
      // Equilateral : 세 변의 길이가 모두 같은 경우
      // Isosceles : 두 변의 길이만 같은 경우
      // Scalene : 세 변의 길이가 모두 다른 경우
      // Invalid : 가장 긴 변 길이보다 나머지 두 변의 길이의 합이 작은 경우
      if (maxN < sumN) {
        if (sideA == sideB && sideA == sideC) output.add("Equilateral");
        if (sideA == sideB && sideA != sideC) output.add("Isosceles");
        if (sideA == sideC && sideA != sideB) output.add("Isosceles");
        if (sideB == sideC && sideB != sideA) output.add("Isosceles");
        if (sideA != sideB && sideA != sideC && sideB != sideC) output.add("Scalene");
      } else {
        output.add("Invalid");
      }
    }

    // 출력
    output.stream()
          .map(text -> {
            System.out.println(text);
            return text;
          });

    br.close();
  }
}
