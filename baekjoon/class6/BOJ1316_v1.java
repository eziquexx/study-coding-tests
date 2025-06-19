package baekjoon.class6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

// 문제 푼 날짜: 25.06.20
// 문제 번호: BOJ 1316
// 풀이 내용: 
// 1. 입력 받은 값을 한 글자씩 나누어 배열로 저장 -> String[] inputArr
// 2. inputArr의 index 기준으로 i번째, i+1번째를 비교하기
// 3. i번째와 i+1번째가 다르면 리스트에 i+1번째 글자를 add 해주는데, 그 전에 리스트에 i+1번째 글자가 있는지 체크하기
// 4. 만약에 있으면 그룹 단어가 아니기 때문에 false 처리하고 break 걸기
// 5. 만약에 없으면 i+1번째 글자 추가
// 6. N번 반복할 때마다 마지막에 check 변수가 true면 count 세기

public class BOJ1316_v1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine()); // N개
    int count = 0; // 그룹 단어 몇개 있는지 세기 위한 변수
    boolean check; // 그룹 단어인지 체크하기 위한 변수

    for (int i = 0; i < N; i++) { // N번 반복
      String[] inputArr = br.readLine().split(""); // 입력값 공백 기준으로 나누어 배열로 저장
      ArrayList<String> arr = new ArrayList<>(); // 리스트 생성
      arr.add(0, inputArr[0]); // 미리 arr에 inputArr 0번째 값 저장
      check = true; // 매번 기본값 true 초기화
      
      for (int j = 0; j < inputArr.length - 1; j++) { // inputArr 길이-1 만큼 반복
        if (!inputArr[j].equals(inputArr[j+1])) { // inputArr 전, 후 문자열 같지 않으면

          if (arr.contains(inputArr[j+1])) { // arr에 해당 문자가 있으면 x
            check = false;
            break;
          };
          arr.add(inputArr[j+1]); // arr에 해당 문자 없으면 add
          // System.out.println(inputArr[j+1]); // 콘솔로 확인
        } else {
          continue;
        }
      }

      // System.out.println("arr: " + arr); // 잘 들어오는지 콘솔로 확인

      if (check == true) {
        count++;
      }
    }

    System.out.println(count);
    br.close();
  }
}
