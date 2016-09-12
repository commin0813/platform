package exam_control_statements;

public class ExamIf {
	public static void main(String[] ar) {
		// 프로그래밍을 할 때 가장 Base로 생각 해야하는 점은
		// 문장의 흐음이 위에서 아래 , 좌에서 우라는 것입니다.
		// 이 문장의 흐름을 제어하기위한 것이 제어문입니다. 그 중 if문에대해서 알아봅시다.

		// 프로그래밍에서도 if 는 '만약 ~ 라면'이라는 뜻으로 해석됩니다.

		/* 변수 선언 */
		int a = 100;
		int b = 100;
		int c = 50;

		/* 설명 부 */

		// 1형식- if(논리 조건문) {내용;}
		if (a == b) {
			System.out.println("a 와  b는 같다.");
		}

		// 2형식- if(논리 조건문) {내용;}else{내용;}

		if (a == c) {
			System.out.println("a 와  c는 같다.");
		} else {
			System.out.println("a 와  c는 다르다.");
		}

		// 3형식- if(논리 조건문) {내용}else if(논리 조건문){내용}else if(논리 조건문){내용}...else{내용}

		if (a == c) {
			System.out.println("a 와  c는 같다.");
		} else if (a == (2 * c)) {
			System.out.println("a 는 c에 2를 곱한 갑과 같다.");
		} else{
			System.out.println("a 는 c 는 다르다.");
		}

	}
}
