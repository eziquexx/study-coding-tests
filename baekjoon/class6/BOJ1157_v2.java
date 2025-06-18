package baekjoon.class6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

// 직접 작성하였으나, 메모리크기 초과함
// 코드 개선이 필요함
// 불필요한 부분이 많음
public class BOJ1157_v2 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String input = br.readLine().toUpperCase(); // 대문자로 변환
    ArrayList<String> inputArr = new ArrayList<>();

    // 알파벳 추출 (중복x)
    for (int i = 0; i < input.length(); i++) {
      String c = String.valueOf(input.charAt(i));
      
      if (inputArr.contains(c)) {
        continue;
      } else {
        inputArr.add(c);
      }
    }

    // count inputArr 크기 만큼 생성 후 모두 0으로 초기화
    int[] count = new int[inputArr.size()];

    // 중복 알파벳 count 세기
    for (int i = 0; i < inputArr.size(); i++) {
      
      for (int j = 0; j < input.length(); j++) {
        String c = String.valueOf(input.charAt(j));
        if (inputArr.get(i).equals(c)) {
          count[i] += 1;
        }
      }
    }

    // 결과 구하기
    int max = 0;
    String result = "";
    for (int i = 0; i < inputArr.size(); i++) {
      if (count[i] > max) {
        max = count[i];
        result = inputArr.get(i);
      } else if (count[i] == max) {
        result = "?";
      }
    }

    System.out.println(result);
    br.close();
  }
}
