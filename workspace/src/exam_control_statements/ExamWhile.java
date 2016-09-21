package exam_control_statements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExamWhile {
	public static void main(String[] ar) {
		// while은 조건식만가진 반복문입니다.
		// 그렇기때문에 while의 형태는 for문에서 선언부와 증감부를 뺀 형태를 가지고있습니다.
		// while 의 형태
		// while(조건식){내용}

		int a = 0;
		while (a < 10) {
			System.out.println(a + "번");
			a++;
		}

		// 선언부와 증감식이 없기때문에 while전에 변수를 하나 선언했고,
		// while안에서 변수를 1씩 증가시키는 증가식을 썼습니다.
		// 네 그렇습니다. 이렇게보면 for문과 별 다르지 않습니다.그렇다면 while은 어떨때 많이 쓰일까요?
		// while은 무한 루프를 돌릴때 많이 사용됩니다. 그리고 break과 같이 많이 쓰이지요.
		// 프로그램을 만들때 어떨경우에는 어떠한내용이 계속해서 실행되어야 할때가 있습니다.
		// 프로그램이 종료되기전가지요. 그러한 경우에 while을 많이 쓰죠.

		// 전에 배웠던 BufferedReader 를 이용해 문자열을 입력받아 그대로 출력하는 프로그램을
		// 만든다고 칩시다. 특정 문자열 'exit'를 입력받기전에는 프로그램은 끝나면안된다고 할 때
		// while을 사용하면 됩니다.

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			try {
				System.out.print("입력 : ");
				String str = in.readLine();
				if (str.equals("exit")) {
					System.out.println("입력을 종료하였습니다.");
					break;
				} else {
					System.out.println("입력하신 내용은 : " + str + " 입니다.");
				}

			} catch (IOException e) {
				System.out.println("시스템 입력 오류입니다. 다시입력하세요");
			}

		}

		// 물론 저걸 이내용을 for문을 이용해도됩니다. for(;;)처럼 선언부,조건부,증감부를 빼고 빈칸으로 쓰면
		// 무한루프를 돌린다는 뜻입니다. 위내용을 그대로 바꿔보겠습니다.
		for (;;) {
			try {
				System.out.print("입력 : ");
				String str = in.readLine();
				if (str.equals("exit")) {
					System.out.println("입력을 종료하였습니다.");
					break;
				} else {
					System.out.println("입력하신 내용은 : " + str + " 입니다.");
				}

			} catch (IOException e) {
				System.out.println("시스템 입력 오류입니다. 다시입력하세요");
			}

		}

		// while의 형태중 do{}while() 문이라는것이있습니다. 프로그램을 만들다보면
		// 어떠한 내용이 최소한번은 실행되고 반복되거나 아니면 그대로 끝나야할 상황이 있을 수도있습니다.
		// 그럴때 do~while문을 쓰지요.

		boolean check = false;
		do {
			try {
				if (check == false) {
					System.out.print("반복 실행 ?[시작 : 'start' 종료 : 아무 키] ");
				} else {
					System.out.print("입력 : ");
				}

				String str = in.readLine();

				if (str.equalsIgnoreCase("start") && check == false) {
					check = true;
					System.out.println("반복실행을 시작합니다.[종료 : 'exit']");
				} else if (str.equals("exit")) {
					System.out.println("입력을 종료하였습니다.");
					break;// 또는 check=false
				} else if (check == true) {
					System.out.println("입력하신 내용은 : " + str + " 입니다.");
				} else {
					System.out.println("반복실행을 취소 하셨습니다.");
				}

			} catch (IOException e) {
				System.out.println("시스템 입력 오류입니다. 다시입력하세요");
			}

		} while (check == true);

		// while문의 조건부가 먼저 실행되었다면 check가 false이므로 바로끝나버렸겠지만,
		// do의 내용이 먼저 한번 실행되기때문에 사용자에게 반복문을 사용할 것인지 물어보고
		// check를 true로 바꾸어 반복문을 시작할 수 있죠. 좀 조잡한 예이긴해도 여러가지를 써볼 수있을것같아
		// 저렇게 코딩해봤습니다. 좀더 고급스럽게 한번 바꿔보셔도될것같습니다.

	}
}
