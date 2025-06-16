package baekjoon.class6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

// 문제 푼 날짜: 25.06.16
// 문제 번호: BOJ 3003
// 풀이 내용: 
// (1) 입력은 BufferedReader 클래스 사용
// (2) String[] input에 입력값을 공백 기준으로 나누어 저장
// (3) int[] chessInput을 크기 6으로 생성
// (4) ArrayList<Integer> chess 생성
// (5) 차이 계산을 위해 int diff = 0; 선언과 초기화
// (6) chess에 .add() 메서드를 사용하여 킹, 퀸, 록, 비숏, 나이트, 폰 값을 순차적으로 저장
// (7) for문 계산
//     : chessInput.length 만큼 반복하여 chessInput에 input 요소들 저장
//     : diff에 chess.get(i) - chessInput[i] 값을 담기
//     : bw.wirte(diff) 사용하여 데이터 임시 저장
// (8) bw.flush()로 데이터 출력과 비우기
// (9) bw와 br .close() 해주기
public class BOJ3003_v1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String[] input = br.readLine().split("\\s+");
    int[] chessInput = new int[6]; // 체스는 6종류로 구성
    ArrayList<Integer> chess = new ArrayList<>();
    int diff = 0;

    // 체스 기본값: 킹 1, 퀸 1, 룩 2, 비숏 2, 나이트 2, 폰 8
    chess.add(0, 1);
    chess.add(1, 1);
    chess.add(2, 2);
    chess.add(3, 2);
    chess.add(4, 2);
    chess.add(5, 8);


    // input값 chessInput에 담고 chess와 비교하는 계산
    for (int i = 0; i < chessInput.length; i++) {
      // chessInput에 input값 담기
      chessInput[i] = Integer.parseInt(input[i]);

      // chessInput과 chess 비교
      diff = chess.get(i) - chessInput[i];
      bw.write(diff + " "); // 데이터 임시 저장
    }
    
    bw.flush(); // 데이터 출력과 비우기
    bw.close(); // 종료
    br.close(); // 종료

  }
}