package baekjoon.class5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

// 문제 푼 날짜: 25.06.13
// 문제 번호: BOJ 10809
// 풀이 내용: 
// (1) BufferedReader 클래스를 사용하여 입력값 받기.
// (2) String S에 단어 입력받기.
// (3) ArrayList를 사용, 제너릭은 String을 하여 a-z값을 담을 리스트를 생성.
// (4) for문 사용하여 a-z까지 S.indexOf()에 대입하여 index가 있으면 해당 index를, 없으면 -1이 추가 되도록 az.add(String.valueOf())를 사용.
// (5) for문 사용하여 az에 담긴 값을 print로 공백을 넣어 한 줄로 출력.
// (6) BufferedReader .close() 시키기.
public class BOJ10809_v1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String S = br.readLine(); // 입력받은 단어 한 글자씩 저장
    ArrayList<String> az = new ArrayList<>();
    
    // a-z 반복
    for (char c = 'a'; c <= 'z'; c++) {
      // 입력받은 S에 알파벳 있으면 index값 저장. 없으면 -1
      int index = S.indexOf(c); 
      az.add(String.valueOf(index)); // az ArrayList에 저장.
    }

    for (int i = 0; i < az.size(); i++) {
      System.out.print(az.get(i) + " ");
    }
    br.close();
  }
}
