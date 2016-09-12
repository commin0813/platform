package exam_control_statements;

public class ExamFor {
	public static void main(String[] ar) {
		// 이번에 소개시켜드릴 제어문은 for입니다.
		// for는 크게 당일 for 제어문과 다중 for 제어문으로 나뉩니다.

		// 단일 for 제어문 형식
		// for(초기화영역;조건부영역;증감부 영역){
		// 반복으로 실행되는 내용부;
		// }

		for (int i = 0; i < 10; i++) {
			System.out.print("#");
		}
		System.out.println();

		// 다중 for 제어문 형식
		// for(초기화영역;조건부영역;증감부영역){
		// 내용;
		// for(초기화영역;조건부영역;증감부영역){
		// 내용;
		// }
		// 내용;
		// }
		
		System.out.println();
		
		for (int i = 0; i < 10; i++) {

			for (int j = 10 ; j > i; j--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		//기타 형식
		// for(변수 선언 부 : 배열){
		//		내용;
		// }
		String[] arr = new String[10];
		int[] index = new int[10];

		for (int i = 0; i < arr.length; i++) {
			int a = (int) ((Math.random() * 10) + 1);
			index[i] = a;
			arr[i] = "Random Number : " + a;

		}

		for (String str : arr) {
			System.out.println(str);
		}

		System.out.println();
		
		//응용 - 제어문을 활용해서 1부터 10까지 임의의 숫자를 중복없이 출력
		
		for (int i = 0; i < arr.length; i++) {

			boolean bool = false;

			int a = (int) ((Math.random() * 10) + 1);

			for (int j = 0; j < i; j++) {
				if (index[j] == a) {
					bool = true;
				}
			}

			if (bool == true) {
				i--;
				continue;//밑으로 진행하지않고 포함하는 반복문(for,while,do~while)의 첫 시작부분으로 돌아간다.
			}

			index[i] = a;
			arr[i] = "not duplicate Number : " + a;

		}

		for (String str : arr) {
			System.out.println(str);
		}

	}
	
	
}
