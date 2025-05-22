package baekjoon.class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 25.05.21
// 문제 번호: BOJ 10813
// 문제 제목: 공 바꾸기
// 풀이 내용: 
// (1) BufferedReader + InputStreamReader 클래스를 사용하여 입력값 받기.
// (2) boolean[] submitted 배열 크기를 30으로 선언.
// (3) for문 사용해서 계산 - 제출한 학생
//     : int num에 제출한 학생 번호를 입력 받기.
//     : submitted[num -1] 제출한 학생은 true 값으로 저장.
// (4) for문 사용해서 계산 - 제출하지 않은 학생
//     : 30번 반복해서 false 값을 가진 인덱스 찾기.
//     : !submitted 는 false를 찾는 조건문. 그리고 i+1 해준 이유는 index 때문에.
// 메모: 
// (1) boolean값으로 출력하기. 이렇게 작성하고 싶었는데 못해서 chat-gpt 도움을 받았다.
public class BOJ5597_v2 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    boolean[] submitted = new boolean[30];

    // 제출한 학생
    for (int i = 0; i < 28; i++) {
      int num = Integer.parseInt(br.readLine());

      submitted[num - 1] = true;
    }

    // 제출하지 않은 학생
    for (int i = 0; i < 30; i++) {
      if (!submitted[i]) {
        System.out.println(i + 1); // index 때문에
      }
    }
  }
}