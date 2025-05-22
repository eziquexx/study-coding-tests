package baekjoon.class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 25.05.21
// 문제 번호: BOJ 10813
// 문제 제목: 공 바꾸기
// 풀이 내용: 
// (1) BufferedReader + InputStreamReader 클래스를 사용하여 입력값 받기.
// (2) int[] students 배열 크기를 30으로 선언.
// (3) int[] assignment 배열 크기를 30으로 선언.
// (4) for문 사용해서 students[i] 학생 출석번호 저장하기.
// (5) for문 사용해서 제출한 학생 입력값을 int num에 받아서 제출한 학생 출석 번호에 num 저장. assignment[num-1] = num 
// (6) for문과 if문을 사용해서 assignment 요소 중 0인 값을 찾아서 출력.
// 메모: 
// (1) 제출하지 않은 학생은 0으로 저장된다. 0인 학생을 찾아서 출력해주면 된다.
public class BOJ5597_v1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int[] students = new int[30];
    int[] assignment = new int[30];

    // 학생 출석번호 저장
    for (int i = 0; i < students.length; i++) {
      students[i] = i + 1;
    }

    // 제출한 학생 저장
    for (int j = 0; j < 28; j++) {
      int num = Integer.parseInt(br.readLine());
      
      assignment[num-1] = num; // index 때문에 num-1
    }

    // 제출하지 않은 학생 찾기.
    for (int i = 0; i < students.length; i++) {

      if (assignment[i] == 0) {
        System.out.println(i + 1);
      }
    }

  }
}