package baekjoon.class7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 25.06.25
// 문제 번호: BOJ 10798
// 풀이 내용: 
// 1. BufferedReader로 입력값 받기.
// 2. Strint[][] wordsArr 크기를 5개 입력 값 받을거라 행은 5크기로, 열은 유동적으로 변경될 수 있어서 [] 비어둠
// 3. int colNum과 int rowNum 각각 생성 및 초기화
// 4. 결과 담을 Strint result 생성
// 5. for문 사용해서 5번 반복. 반복 때마다 입력값 받기.
// 6. 각 행마다 입력받은 값의 lengh를 구해서 열을 지정해주기
// 7. 중첩 for문 사용해서 각 행의 열마다 값 저장하기
// 8. 그 다음 출력을 위한 for문 사용. 각 행의 첫번째 열을 쭉 먼저 나열하고, 그 다음 두번째 열을 쭉 나열 방식
// 9. 여기서 중요한 점은 행마다 요소의 개수가 다른 경우, 행의 길이가 다르기 때문에 값이 없을 수도 있음.
// 10. ArrayIndexOutOfBOundsException 예외가 발생하기 때문에, 각 행마다 길이가 i보다 크면 continue 해줘야함.
// 11. result에 값 들을 저장해주고 맨 마지막에 출력하기.
// 12. BufferedReader .close() 해주기.

public class BOJ10798_v1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[][] wordsArr = new String[5][];
    int colNum = 0;
    int rowNum = 0;
    String result = "";

    /*
     * 1. 5개의 단어를 나열. 즉, 5번 반복. 반복할 때마다 입력값 받기.
     * 2. 각 열의 첫번째, 두번째, 세번째를 쭉 나열해서 한 줄로 출력.
     */

    // 5번 반복. 입력값들 전체 저장.
    for (int i = 0; i < 5; i++) {
      String[] input = br.readLine().split("");
      if (input.length < 0 || input.length > 15) {
        System.out.println("0~15개의 글자를 입력해주세요.");
      } 

      wordsArr[i] = new String[input.length]; // 각 행마다 열의 개수 지정
      for (int j = 0; j < input.length; j++) {
        wordsArr[i][j] = input[j];
        
        if (j > rowNum) {
          rowNum = j;
        }

        if (i > colNum) {
          colNum = i;
        }
      }
    }

    // 계산
    for (int i = 0; i < rowNum + 1; i++) {
      for (int j = 0; j < colNum + 1; j++) {
        // 배열 행마다 열 크기 비교 조건 필요
        if (i >= wordsArr[j].length || wordsArr[j][i] == null || wordsArr[j][i].trim().isEmpty()) {
          continue;
        }
        result = result + wordsArr[j][i];
      }
    }

    System.out.println(result);
    br.close();
  }
}
