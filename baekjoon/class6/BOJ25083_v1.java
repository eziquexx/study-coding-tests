package baekjoon.class6;

import java.util.ArrayList;

// 문제 푼 날짜: 25.06.16
// 문제 번호: BOJ 25083
// 풀이 내용: 
// (1) ArrayList를 사용
// (2) ArrayList<String> output 생성
// (3) output에 출력할 문자열 추가
// (4) for문을 사용하여 output 전체 출력 
public class BOJ25083_v1 {
  public static void main(String[] args) {
    ArrayList<String> output = new ArrayList<>();

    output.add("         ,r'\"7");
    output.add("r`-_   ,'  ,/");
    output.add(" \\. \". L_r'");
    output.add("   `~\\/");
    output.add("      |");
    output.add("      |");

    for (int i = 0; i < output.size(); i++) {
      System.out.println(output.get(i));
    }
  }
}
