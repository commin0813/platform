package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Ranking Program Exam
 * developer by commin
 * 
 * 어떤 프로그램을 만들것인가?
 * 5명의 학생의 정보(이름),점수(국어,영어,수학)를 입력 받아 평균을 내고 석차를 구하여 출력하는 프로그램.
 * 
 * 주요 기술
 * 배열,제어문,java 입출력
 * 
 */
public class RankingPro {
	public static void main(String[] ar) throws IOException {
		// source
		int student_size = 5;// 학생수
		int subject_size = 3;// 과목 수
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String names[] = new String[student_size];// 5명의 학생이름
		String subject[] = new String[] { "국어", "영어", "수학" };
		double scores[][] = new double[student_size][subject_size + 1];// 1:국어,2:영어,3:수학,4:평균
		int rank[] = new int[student_size];

		// 학생 이름 입력 받기. 인자로 BufferedReader와 학생 수변수를 넣었네요.
		names = inputName(in, student_size);

		// 각 학생의 점수 입력
		System.out.println("*** 입력 받은 이름 ***");
		for (int i = 0; i < names.length; i++) {
			System.out.println((i + 1) + ". " + names[i]);
		}

		for (int i = 0; i < scores.length; i++) {
			System.out.println(names[i] + "의 점수입력!!");
			for (int j = 0; j < scores[i].length; j++) {
				if (j == subject_size) {
					double total = 0;
					for (int z = 0; z < subject_size; z++) {
						total += scores[i][z];
					}
					scores[i][j] = total / subject_size;// scores 마지막 공간에 평균을 넣습니다.
					break;// 가장 가까운 반복문을 빠져나가도록 하는 예약어입니다.
				}
				System.out.print(subject[j] + " > ");
				double score = Double.parseDouble(in.readLine());
				scores[i][j] = score;
			}
		}

		showTable(names, subject, scores);

		// 석차 구하기

	}

	public static void showTable(String[] names, String[] subject, double[][] scores) {
		System.out.print("이름   | ");
		for (int i = 0; i < subject.length + 1; i++) {
			if (i == subject.length) {
				System.out.print("평균|   ");
				break;
			}
			System.out.print(subject[i] + "| ");

		}
		System.out.println();

		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + " |");
			for (int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j] + "| ");
			}
			System.out.println();
		}
	}

	// 메서드를 사용해보기위해 억지로 넣었습니다.
	// 클래스인 BufferedReader도 매개변수로 넣을 수 있습니다.
	public static String[] inputName(BufferedReader in, int size) {
		String[] names = new String[size];

		for (int i = 0; i < size; i++) {
			System.out.println("학생 이름을 입력 해주세요 <" + (size - i) + ">");
			try {
				System.out.print("이름  > ");
				String name = in.readLine();
				names[i] = name;
			} catch (IOException e) {
				System.out.println("err : IOException");
				i--;// 오류가 나게되면 프로그램을 종료시킬것이 아니라 i를 하나 줄여서 다시 같은자리에 입력 받는것이 더 유연한프로그램입니다.
				continue;
			}
		}
		System.out.println();// 한줄개행
		return names;
	}

}
