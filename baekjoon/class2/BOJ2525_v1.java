package baekjoon.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 25.05.10
// 문제 번호: BOJ 2525
// 문제 제목: 오븐 시계
// 풀이 내용: 
// (1) BufferedReader + InputStreamReader 클래스를 사용하여 입력값 받기.
// (2) 첫번째 입력값은 공백 기준으로 나누어서 String[] strs에 저장.
// (3) 두번째 입력값은 int C에 숫자로 형변환해서저장.
// (4) 전체 종료 시간을 분으로 환산한다.
//     int totalMin을 만들어 A는 시라서 A * 60 해주고 나머지 B, C를 더해준다.
// (5) endA는 totalMin / 60을 하고 난 몫에서 % 24를 해서 나머지 값을 저장한다.
// (6) endB는 totalMin % 60을 하고 나머지를 저장한다.
// (7) endA와 endB 사이에 공백을 두고 한 줄로 출력한다.
public class BOJ2525_v1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] strs = br.readLine().split(" ");
    int A = Integer.parseInt(strs[0]); // hour
    int B = Integer.parseInt(strs[1]); // min
    int C = Integer.parseInt(br.readLine()); // cook min

    br.close();

    int totalMin = (A * 60) + B + C;

    int endA = (totalMin / 60) % 24;
    int endB = totalMin % 60;


    System.out.println(endA + " " + endB);
  }
}