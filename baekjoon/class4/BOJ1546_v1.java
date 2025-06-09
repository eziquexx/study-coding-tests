package baekjoon.class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 25.06.09
// 문제 번호: BOJ 1546
// 풀이 내용: 
// (1) BufferedReader 클래스를 사용하여 입력값 받기.
// (2) String[] input에 과목 점수 입력 받아서 공백 기준으로 나누어서 저장.
// (3) double[] exam에 각 과목들을 배열로 저장.
// (4) double max에 가장 큰 시험 과목 점수 구한 다음 값 저장.
// (5) double[] exam에 담긴 점수들을 max로 나눈 다음 100 곱한 값으로 계산 후 저장.
// (6) 새로 구한 점수의 평균값 구해서 출력.
public class BOJ1546_v1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int N = Integer.parseInt(br.readLine()); // 시험 본 과목 수
    String[] input = br.readLine().split(" "); // 과목 점수 받기
    double[] exam = new double[N];
    double max = 0; // 가장 큰 과목 점수
    double avg = 0; // 평균 점수

    // 과목 점수 실수로 변환하여 저장
    for (int i = 0; i < N; i++) {
      exam[i] = Integer.parseInt(input[i]);
    }

    // 가장 큰 수 구하기
    for (int i = 0; i < exam.length; i++) {
      if (exam[i] > max) {
        max = exam[i];
      }
    }

    // 모든 과목을 큰 점수로 다시 점수 구하기
    for (int i = 0; i < exam.length; i++) {
      double temp = 0;
      temp = exam[i] / max * 100;
      exam[i] = temp;
    }

    // 새로 구한 점수로 평균 값 내기
    for (int i = 0; i < exam.length; i++) {
      avg = exam[i] + avg;
    }
    
    avg = avg / N; // 평균 값 구하기

    System.out.println(avg);
    br.close();
  }
}