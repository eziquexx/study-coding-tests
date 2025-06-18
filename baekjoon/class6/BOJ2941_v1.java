package baekjoon.class6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 푼 날짜: 25.06.18
// 문제 번호: BOJ 2941
// 풀이 내용: 
// (1) 입력은 BufferedReader 클래스 사용
// (2) String[] arr에 크로아티아 문자 배열로 저장
// (3) int count와 int result 0으로 초기화
// (4) for문 사용해서 계산
//     : arr 길이 만큼 반복
//     : while문 사용해서 input에 arr[i]가 있으면 input에 arr[i]를 제거하고 ,(쉼표)로 바꾸기
// (5) for문 밖에서 input에 모든 ,(쉼표)를 제거하고 "" 그 자리에 빈 문자를 추가
// (6) result에 count와 input의 길이를 더하여 저장
// (7) result 출력
// (8) BufferedReader .close() 해주기
public class BOJ2941_v1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String input = br.readLine(); // 입력받기
    String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="}; // 크로아티아 저장
    int count = 0;
    int result = 0;

    for (int i = 0; i < arr.length; i++) { // arr 길이 만큼 반복

      while (input.contains(arr[i])) { // input에 arr[i]가 있으면 true
        count++; // 있으면 count 1씩 증가 해주기
        // input에 arr[i] 처음에 있는 것만 제거하고 ,(쉼표)로 바꾸기 
        input = input.replaceFirst(arr[i], ","); 
      }
    } 

    // input에 있는 ,(쉼표)를 전부 없애기
    input = input.replaceAll(",", "");
    result = count + input.length(); // 제거한 크로아티아 수와 input 길이 더하기
    System.out.println(result); // 출력
    br.close();
  }
}
