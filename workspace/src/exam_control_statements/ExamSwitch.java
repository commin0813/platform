package exam_control_statements;

public class ExamSwitch {
	public static void main(String[] ar) {
		// 두번째로 배울 제어문은 Switch ~ case ~ break 문이다.
		// switch는 특정한 수나 문자에대한 위치 이동을 제어할 수 있다.
		// if문에 비해 수치나 문자에 따른 이동의 처리가 빠르다.

		/* 형식 */
		// switch(수치(연산식도 포함) or 문자){
		// case 수치 or 문자 : 내용 ; break;
		// case 수치 or 문자 : 내용 ; break;
		// case 수치 or 문자 : 내용 ; break;
		// default : 내용
		// }

		int a = 10;
		int b = 20;

		switch (a + b) {
		case 30:
			System.out.println("a와 b의 합은 30이다.");
			break;
		case 10:
			System.out.println("a는 10이다.");
			break;
		case 20:
			System.out.println("b는  20이다.");
			break;
		default:
			System.out.println("만족한 답은 없습니다.");
		}

		System.out.println();

		// Switch문은 case에서 답을 찾고 해당 내용을 break을 만나기 전까지 모두 실행한다.
		// 그렇다면 break;을 안쓰면 어떻게될까?

		switch (a + b) {
		case 30:
			System.out.println("a와 b의 합은 30이다.");

		case 10:
			System.out.println("a는 10이다.");

		case 20:
			System.out.println("b는  20이다.");

		default:
			System.out.println("만족한 답은 없습니다.");
		}

		System.out.println();

		// a+b 의 답이 30이므로 switch문은 30에 해당하는 case를 찾고 내용을 실행하지만 break이 없기때문에 끝나지않고 밑에 내용 모두를 실행한다.
		// 이 성질은 버그가 아니고 응용해서 잘 쓰면 괜찮은 코딩이 되기도 한다.그러나 위 코딩은 default에 정의된 내용까지 출력이 되니 잘못된 코딩이 된다.
		// case 20에 break을 줘보자.
		
		switch (a + b) {
		case 30:
			System.out.println("a와 b의 합은 30이다.");

		case 10:
			System.out.println("a는 10이다.");

		case 20:
			System.out.println("b는  20이다.");
			break;
		default:
			System.out.println("만족한 답은 없습니다.");
		}

		// 실행하면 a와 b의 합뿐 아니라 a가 무엇인지 b가 무엇인지도 같이 출력해주니 코딩의 길이를 줄일 수 있다.
		// 일반적인 경우에는 그냥 분기 시키는 역할로 switch를 쓰지만 break으로 흐름을 제어하여 코딩 수 있으므로 잘 활용해 보자.

	}
}
