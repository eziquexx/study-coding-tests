package baekjoon.class6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

// 문제 푼 날짜: 25.06.21
// 문제 번호: BOJ 25206
// 풀이 내용: 
// (1) while문을 사용해서 조건식에 true를 작성하여 무한 반복
// (2) while문 안에 String input으로 입력값 받기
// (3) while문 안에 input에 입력값이 있는지 확인하는 조건문을 작성하여 입력값이 null이거나 비어있으면 종료되도록 작성
// (4) input값을 공백 기준으로 .split(" ") 해서 배열로 저장 -> String[] inputArr
// (5) inputArr에는 공백 기준으로 과목, 학점, 등급으로 저장되어 있는데 이 값들을 각각 변수에 저장 -> String subject, double credit, String grade / 과목, 학점, 등급
// (6) 등급 별 점수를 저장할 변수도 선언 및 초기화 -> double grPoint
// (7) if문을 사용해서 과목(subject) 길이가 1이상, 50이하 인지 확인.
// (8) 과목 길이가 적합하면 그 다음은 if문을 사용해서 등급에 P 등급이 있는지 확인하여 P등급이 있으면 continue; 처리한다.
// (9) P등급이 없으면, 등급 점수를 구하는데 switch문을 사용해서 등급(grade)의 case를 찾아서 등급점수(grPoint)에 해당 등급의 점수를 저장한다.
// (10) 등급점수를 구했기 때문에 과목 길이부터 체크하던 if문 아래에 입력 받은 학점끼리 더해준다. -> creditSum = creditSum + credit;
// (11) 그 다음 학점 * 과목평점을 ArrayList<Double> resultArr에 추가해준다.
// (12) while문 바깥에서 resultArr에 담은 학점 * 과목평점의 합을 for-in문을 사용하여 result에 저장한다.
// (13) (학점 * 과목평점)의 합인 result에 총 학점인 creditSum을 나눈 값을 6자리까지만 출력한다. -> .printf("%.6f", result/creditSum);
// (14) 마지막에 BufferedReader를 .close(); 한다.
public class BOJ25206_v1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<Double> resultArr = new ArrayList<>();
    
    double creditSum = 0; // 학점 총 합
    double result = 0;

    while (true) {
      String input = br.readLine();
      if (input == null || input.trim().isEmpty()) { // input값 없으면 종료
        break;
      }

      String[] inputArr = input.split(" "); // 공백기준으로 나누어 저장
      String subject = inputArr[0]; // 과목
      double credit = Double.parseDouble(inputArr[1]); // 학점
      String grade = inputArr[2]; // 등급
      double grPoint = 0; // 등급 점수

      if (1 <= subject.length() && subject.length() <= 50) { // 과목 길이 제한
        if (grade.contains("P")) { // P 등급은 계산 x
          continue;
        } else {
          // 등급 점수 구하기
          switch (grade) {
            case "A+" :
              grPoint = 4.5;
              break;
            case "A0" :
              grPoint = 4.0;
              break;
            case "B+" :
              grPoint = 3.5;
              break;
            case "B0" :
              grPoint = 3.0;
              break;
            case "C+" :
              grPoint = 2.5;
              break;
            case "C0" :
              grPoint = 2.0;
              break;
            case "D+" :
              grPoint = 1.5;
              break;
            case "D0" :
              grPoint = 1.0;
              break;
            case "F" :
              grPoint = 0;
              break;
            default :
              System.out.println("올바른 등급을 입력해주세요.");
          }
        }
      }

      // 학점끼리 더하기
      creditSum = creditSum + credit;

      // 학점 * 등급 점수 리스트에 추가
      resultArr.add(credit * grPoint);
    }

    // 합 나누기 count
    for (Double arr : resultArr) {
      result = result + arr;
    }

    System.out.printf("%.6f", result/creditSum); 
    br.close();
  }
}
