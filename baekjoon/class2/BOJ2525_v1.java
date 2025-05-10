package baekjoon.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 25.05.10
// 문제 번호: BOJ 2525
// 문제 제목: 오븐 시계
// 풀이 내용: 
// (1) BufferedReader + InputStreamReader 클래스를 사용하여 입력값 받기.
// (2) 첫번째 입력값은 공백 기준으로 나누어서 Strs[] strs에 저장.
// (3) 두번째 입력값은 int C에 숫자로 형변환해서저장.
// (4) 종료 시간에서 시와 분은 int타입으로, 
//     시는 endA에 A값 저장하고 분은 endB에 B와 C를 더한 값을 저장.
// (5) endB가 60분 보다 크면 endA에 endB/60의 값을 더해주고 저장.
// (6) endB가 60분 보다 크면 endB에 endB-60의 값을 저장.
// (7) endA가 24와 같으면 0의 값 저장. endB가 60과 같으면 0의 값 저장.
// (8) endA와 endB 사이에 공백을 두고 출력.
public class BOJ2525_v1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] strs = br.readLine().split(" ");
    int A = Integer.parseInt(strs[0]); // hour
    int B = Integer.parseInt(strs[1]); // min
    int C = Integer.parseInt(br.readLine()); // cook min

    int totalMin = (A * 60) + B + C;

    int endA = (totalMin / 60) % 24;
    int endB = totalMin % 60;


    System.out.println(endA + " " + endB);
  }
}